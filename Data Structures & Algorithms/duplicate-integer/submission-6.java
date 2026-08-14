class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int num : nums){
            if(list.contains(num)){
                return true;
            }else list.add(num);
        }
        return false;
    }
}