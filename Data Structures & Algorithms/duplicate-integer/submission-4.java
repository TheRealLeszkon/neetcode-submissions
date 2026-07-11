class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums.length<2) return false;
        Arrays.sort(nums);
        int i=0,j=1;
        while(j<nums.length){
            if(nums[j]==nums[i]) return true;
            i++;
            j++;
        }
        return false;
    }
}