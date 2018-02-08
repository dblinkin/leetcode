/**
 * Created by zhang on 2017/6/26.
 */
public class Solution188 {

    public int maxProfit(int k, int[] prices) {

        if (prices == null || prices.length < 2) {
            return 0;
        }

        // 退化为122题
        if (k >= prices.length / 2) {
            int ans = 0;
            for (int i = 1; i < prices.length; i++) {
                int v = prices[i] - prices[i - 1];
                if (v > 0) {
                    ans += v;
                }
            }
            return ans;
        }

        int[][] dp = new int[k + 1][prices.length];
        for (int i = 1; i < k + 1; i++) {

            int tempMax = -prices[0]; // 负数表示买入股票

            for (int j = 1; j < prices.length; j++) {
                dp[i][j] = Math.max(dp[i][j - 1], tempMax + prices[j]); // + 表示卖出股票
                tempMax = Math.max(tempMax, dp[i - 1][j - 1] - prices[j]); // -表示买入该轮股票
            }
        }

        return dp[k][prices.length - 1];

    }


}
