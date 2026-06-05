class Solution {
        public int search(int[] nums, int target) {
            int hi = nums.length;
            int lo =0;
            int mid;
            while(lo<hi){
                mid = lo+(hi-lo)/2;
                if(nums[mid]==target){
                    return mid;
                }
                if(target>nums[mid]){
                    lo =mid+1;
                }
                else{
                    hi =mid;
                }
            }
            return -1;
        }
}