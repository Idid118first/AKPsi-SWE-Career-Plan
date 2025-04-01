class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];

        for (int i = 0; i < prices.length - 1; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
            if ((prices[i + 1] - minPrice) > maxProfit){
                maxProfit = prices[i + 1] - minPrice;
            }
        }

        return maxProfit;
    }
}
