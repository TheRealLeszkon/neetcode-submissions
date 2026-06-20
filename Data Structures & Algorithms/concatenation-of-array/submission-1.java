class Solution {
    public int[] getConcatenation(int[] nums) {
        int n =nums.length*2;
        int[] result =new int[n];
        for(int i=0;i<n;i++){
            result[i] = nums[i%nums.length];
        }
        return result;
    }
}