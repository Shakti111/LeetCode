import java.util.Arrays;

public class BuySellStock_121 {
    public static void main (String[] args) {
        int[] prices = {3,2,6,5,0,3};
        BuySellStock_121 obj = new BuySellStock_121();
        int result = obj.maxProfit(prices);
        System.out.println(result);
    }

    public int maxProfit(int[] prices) {
        int maxProfit = 0, cheapest = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < cheapest) cheapest = prices[i];
            maxProfit = Math.max(maxProfit, prices[i] - cheapest);
        }
        return maxProfit;
    }
}
