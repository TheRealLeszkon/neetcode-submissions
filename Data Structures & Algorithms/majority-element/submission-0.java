class Solution {
    public int majorityElement(int[] nums) {
        int majority =0;;
        int counter = 0;
        for(int i=0;i<nums.length;i++){
            if(counter == 0){
                majority = nums[i];
            }
            if(nums[i]==majority){
                counter++;
            }else{
                counter--;
            }
        }
        counter =0;
        int halfLength = nums.length/2;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==majority){
                counter++;
            }
        }
        if(counter> halfLength){
            return majority;
        }
        return Integer.MIN_VALUE;
    }
}