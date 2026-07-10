class Solution {
    public int scoreOfString(String s) {
        int curr =0;
        int result =0;
        while(curr+1<s.length()){
            result += Math.abs(s.charAt(curr)-s.charAt(curr+1));
            curr++;
        }
        return result;
    }
}