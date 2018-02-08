/**
 * Created by zhang on 2017/6/26.
 */
public class Solution122 {

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int totalProfit = 0;
        int lower = 0;
        int higher = 0;

        int i = 1;
        while (i < prices.length) {

            while (i < prices.length && prices[i] <= prices[i - 1]) {
                i++;
            }
            lower = i - 1;

            while (i < prices.length && prices[i] >= prices[i - 1]) {
                i ++;
            }
            higher = i - 1;

            if (higher > lower) {
                totalProfit += prices[higher] - prices[lower];
                i ++;
            }
        }

        return totalProfit;
    }
}
