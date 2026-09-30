class Solution {
    private List<List<Integer>> result =  new ArrayList<>();
    private List<Integer> subset = new ArrayList<>();
    public void backtracking(int i,int[] nums){ 
        if(i>=nums.length){
            result.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[i]);
        backtracking(i+1,nums);

        subset.removeLast();
        backtracking(i+1,nums);
    }

    public List<List<Integer>> subsets(int[] nums) {
        backtracking(0,nums);
        return result;
    }
}
