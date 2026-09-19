class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<=0){
            return 0;
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int prev = nums[0];
        int counter =1;
        int longest = 1;
        for(int i =1;i<nums.length;i++){
            if(nums[i]==prev+1){
                counter++;
            }else if(prev==nums[i]){
                
            }else{
                longest = Math.max(counter,longest);
                counter = 1;

            }
            prev = nums[i];
        }
        longest = Math.max(counter,longest);
        return longest;
    }
}
