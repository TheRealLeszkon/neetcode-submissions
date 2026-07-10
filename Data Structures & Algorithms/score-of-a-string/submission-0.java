class Solution {
    public int scoreOfString(String s) {
        int curr =0;
        int next =1;
        int result =0;
        while(next<s.length()){
            result += Math.abs(s.charAt(curr)-s.charAt(next));
            curr++;
            next++;
        }
        return result;
    }
}