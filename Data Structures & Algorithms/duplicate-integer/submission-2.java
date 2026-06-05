// import java.util.HashMap;

class Solution {
    HashMap<Integer,Integer> map = new HashMap<>();
    public boolean hasDuplicate(int[] nums) {
        for(int i : nums){
            if(map.get(i)==null){
                map.put(i,1);
            }else{
                return true;
            }
        }
        return false;
    }
}