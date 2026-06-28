class Solution {
    public int findMin(int[] nums) {
        int min;
        int l=0;
        int r = nums.length-1;
        int mid;
        int result = nums[0];
        while(l<=r){
            if(nums[l]<nums[r]){
                result = Math.min(nums[l],result);
                break;
            }
            mid = (l+r)/2;
            result = Math.min(nums[mid],result);

            if(nums[mid]>=nums[l]){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return result;
    }
}
