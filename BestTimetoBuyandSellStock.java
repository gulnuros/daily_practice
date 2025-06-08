public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        int lowest = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            lowest = Math.min(lowest, prices[i]);
            max = Math.max(max, prices[i] - lowest);
        }
        return max;
    }
}
