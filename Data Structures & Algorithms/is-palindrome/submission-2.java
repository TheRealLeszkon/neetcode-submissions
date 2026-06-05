class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int start =0;
        int end = s.length()-1;
        while(start<=end){

            char c1 =s.charAt(start);
            char c2 =s.charAt(end);
            while(!Character.isLetterOrDigit(c1) && start<end){
                start++;
                c1 = s.charAt(start);
            }

            while(!Character.isLetterOrDigit(c2) && start<end){
                end--;
                c2 = s.charAt(end);
            }
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            // System.out.printf("Start -> %s  End -> %s\n",s.charAt(start),s.charAt(end));
            start++;
            end--;
        }
        return true;
    }
}
