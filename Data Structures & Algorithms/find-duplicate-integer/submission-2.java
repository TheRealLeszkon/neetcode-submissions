class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i =0;i<nums.length;i++){
            if(nums[nums[i]-1]==0){
                return nums[i];
            }else{
                nums[i]=0;
            }
        }
        return -1;
    }
}
