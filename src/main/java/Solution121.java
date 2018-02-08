/**
 * Created by zhang on 2017/6/26.
 */
public class Solution121 {

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int minPrice = prices[0];
        int maxProfit = -prices[0];

        for (int i = 1; i < prices.length; i++) {

            minPrice = prices[i] < minPrice ? prices[i] : minPrice;
            int profit = prices[i] - minPrice;
            maxProfit = profit > maxProfit ? profit : maxProfit;
        }

        return maxProfit < 0 ? 0 : maxProfit;
    }

}

