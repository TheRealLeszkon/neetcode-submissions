class Solution {
    public boolean validPalindrome(String s) {
        StringBuilder temp = new StringBuilder(s);
        if(temp.reverse().toString().equals(s)){
            return true;
        }
        for(int i=0;i<s.length();i++){
            temp.setLength(0);
            for(int j=0;j<s.length();j++){
                if(i==j) continue;
                temp.append(s.charAt(j));
            }
            System.out.println(temp);
            if(temp.toString().equals(temp.reverse().toString())){
                return true;
            }
        }
        return false;
    }
}