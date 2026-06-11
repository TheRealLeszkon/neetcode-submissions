class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l =0;
        int r;
        for(l=0;l< numbers.length;l++){
            r=l+1;
            while (r<numbers.length){
                if(numbers[l]+numbers[r]==target){
                    return new int[]{l+1,r+1};
                }
                r++;
            }
        }
        return new int[]{-1,-1};
    }
}
