class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int r;
        for(int l=0;l<prices.length;l++){
            r=l+1;
            while(r<prices.length){
                maxProfit = Math.max(prices[r]-prices[l],maxProfit);
                r++;
            }
        }
        return maxProfit;
    }
}
