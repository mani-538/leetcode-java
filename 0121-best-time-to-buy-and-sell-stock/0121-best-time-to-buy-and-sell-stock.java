class Solution {
    public int maxProfit(int[] prices) {
        int lowestPrice = prices[0];
        int maxProfit = 0;
        int i = 1;

        while (i < prices.length) {
            if (prices[i] - lowestPrice > maxProfit) {
                maxProfit = prices[i] - lowestPrice;
            }

            if (prices[i] < lowestPrice) {
                lowestPrice = prices[i];
            }

            i++;
        }

        return maxProfit;
    }
}