class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minPrice = prices[0];
        for(int currentPrice:prices){
            if(currentPrice < minPrice){
                minPrice = Math.min(currentPrice, minPrice);
            }
            else{
                profit = Math.max(currentPrice - minPrice , profit);
            }

        }
        return profit;
    }
}