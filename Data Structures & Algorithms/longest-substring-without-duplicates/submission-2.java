class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count =0;
        int max = 0;
        Set<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                char c = s.charAt(j);
                if(set.add(c)){
                    count++;
                }else{
                    set.clear();
                    count=0;
                }
                max = Math.max(count,max);
            }
        }

        return max;
    }
}
