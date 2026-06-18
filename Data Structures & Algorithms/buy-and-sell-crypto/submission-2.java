class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int r;
        int todaysPrice;
        for(int l=0;l<prices.length;l++){
            r=l+1;
            todaysPrice=prices[l];
            while(r<prices.length){
                maxProfit = Math.max(prices[r]-todaysPrice,maxProfit);
                r++;
            }
        }
        return maxProfit;
    }
}
