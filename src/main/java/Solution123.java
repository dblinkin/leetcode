/**
 * Created by zhang on 2017/6/26.
 */
public class Solution123 {

    public int maxProfit(int[] prices) {

        if (prices == null || prices.length < 2) {
            return 0;
        }

        int[] pre = new int[prices.length];
        pre[0] = 0;
        int lower = prices[0];
        for (int i = 1; i < prices.length; i++) {
            lower = Math.min(lower, prices[i]);
            pre[i] = Math.max(prices[i] - lower, pre[i - 1]);
        }

        int[] post = new int[prices.length];
        post[prices.length - 1] = 0;
        int higher = prices[prices.length - 1];
        for (int j = prices.length - 2; j >= 0; j--) {
            higher = Math.max(higher, prices[j]);
            post[j] = Math.max(higher - prices[j], post[j + 1]);
        }

        int ans = post[0];
        for (int i = 1; i < prices.length; i++) {
            ans = Math.max(ans, pre[i - 1] + post[i]);
        }
        return ans;
    }


}
