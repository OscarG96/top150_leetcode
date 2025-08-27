package Arrays;

public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int buy = 0;
        int sell = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[buy]) {
                int max_profit = prices[i] - prices[buy];
                profit = Math.max(profit, max_profit);
                sell = i;
            } else {
                buy = i;
            }
        }

        return profit;
    }

    public static void main(String[] args) {
        int result = maxProfit(new int[]{7,1,5,3,6,4});
        System.out.println(result);
    }
}
