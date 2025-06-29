public class lc0121 {
    public int maxProfit(int[] prices) {
        int minValue = Integer.MAX_VALUE;
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            minValue = Integer.min(prices[i], minValue);
            profit = Integer.max(profit, prices[i] - minValue);
        }

        return profit;
    }
}
