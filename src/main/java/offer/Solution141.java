package offer;

public class Solution141 {

    public int cuttingRope(int n) {
        if (n < 2) {
            return -1;
        }

        if (n < 4) {
            return n - 1;
        }

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;

        for (int i = 4; i <= n; i++) {
            dp[i] = Math.max(2 * dp[i - 2], 3 * dp[i - 3]);
        }
        return dp[n];
    }



}
