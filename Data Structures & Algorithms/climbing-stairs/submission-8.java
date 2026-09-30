class Solution {
    public int climbStairs(int n) {
        if(n==1) return 1;
        if (n==2) return 2;

        int prev = 1;
        int curr = 2;
        int temp;
        
        for(int i=2;i<n;i++){
            temp = curr;
            curr = prev+curr;
            prev = temp;
        }
            
        return curr;
    }
}
