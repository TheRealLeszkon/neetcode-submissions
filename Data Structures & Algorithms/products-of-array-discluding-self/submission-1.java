class Solution {
    public int[] productExceptSelf(int[] nums) {
        int r;
        int[] result=new int[nums.length];
        for(int l=0;l<nums.length;l++){
            System.out.println(nums[l]);
            r=(l+1)%nums.length;
            result[l]=1;
            while(r!=l){
                result[l]*=nums[r];
                r = (r+1)%nums.length;
            }
        }
        return result;
    }
}  
