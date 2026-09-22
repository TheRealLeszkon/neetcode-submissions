class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<2){
            return 0;
        }
        int maxProfit = 0;
        int minBuy = prices[0];
        for(int i=0;i<prices.length;i++){
            int currentProfit = prices[i]-minBuy;
            maxProfit = Math.max(currentProfit,maxProfit);
            minBuy = Math.min(prices[i],minBuy);
        }
        return maxProfit;
    }
}
