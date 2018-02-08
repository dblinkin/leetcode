/**
 * Created by zhang on 2017/6/28.
 */
public class Solution064 {

    public int minPathSum(int[][] grid) {

        int row = grid.length;
        int col = grid[0].length;

        int[][] dp = new int[row][col];

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                if (r == 0 || c == 0) {
                    if (c > 0) {
                        dp[r][c] = dp[r][c - 1] + grid[r][c];
                    } else if (r > 0) {
                        dp[r][c] = dp[r - 1][c] + grid[r][c];
                    } else {
                        dp[r][c] = grid[r][c]; // dp[0][0]
                    }
                } else {
                    dp[r][c] = Math.min(dp[r - 1][c], dp[r][c - 1]) + grid[r][c];
                }
            }
        }
        return dp[row - 1][col - 1];
    }

}
