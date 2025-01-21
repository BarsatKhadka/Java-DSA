class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = prices[0];

        //so how i understand this problem is that i need to find the biggest difference , the biggest difference always occurs with the minimum number 
        //and another rule is that i cannot revisit the previous numbers because i already bought that stock , so i need to look at the right hand side numbers to find the biggest difference.

        for(int i=1; i<prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            else{
                if(profit <  prices[i] -min){
                    profit = prices[i]-min;
                }
            }

        }
        return profit;


        
        
    }
}