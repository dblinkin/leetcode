/**
 * Created by zhang on 2017/6/27.
 */
public class Solution062 {

    public int uniquePaths(int m, int n) {

        int[][] dp = new int[m + 1][n + 1];

        for (int j = 1; j < n + 1; j++) {
            dp[1][j] = 1;
        }
        for (int i = 1; i < m + 1; i++) {
            dp[i][1] = 1;
        }

        for (int i = 2; i < m + 1; i++) {
            for (int j = 2; j < n + 1; j++) {
                dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
            }
        }
        return dp[m][n];

    }

}
