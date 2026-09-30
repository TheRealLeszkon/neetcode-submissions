class Solution {
    private Map<Integer,Integer> memo = new HashMap<>();

    int fibonacci(int n){
        if(memo.containsKey(n)){
            return memo.get(n);
        }else{
            memo.put(n,fibonacci(n-2)+fibonacci(n-1));
            return memo.get(n);
        }
    }
    public int climbStairs(int n) {
        memo.put(1,1);
        memo.put(2,2);
        return fibonacci(n);
    }
}
