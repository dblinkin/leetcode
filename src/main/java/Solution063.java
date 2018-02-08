/**
 * Created by zhang on 2017/6/27.
 */
public class Solution063 {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;

        int[][] dp = new int[row][col];
        for (int c = 0; c < col; c++) {
            if (obstacleGrid[0][c] == 1) {
                break;
            }
            dp[0][c] = 1;
        }
        for (int r = 0; r < row; r++) {
            if (obstacleGrid[r][0] == 1) {
                break;
            }
            dp[r][0] = 1;
        }

        for (int r = 1; r < row; r++) {
            for (int c = 1; c < col; c++) {

                if (obstacleGrid[r - 1][c] != 1) {
                    dp[r][c] += dp[r - 1][c];
                }

                if (obstacleGrid[r][c - 1] != 1) {
                    dp[r][c] += dp[r][c - 1];
                }
            }
        }
        return obstacleGrid[row - 1][col - 1] == 1 ? 0 : dp[row - 1][col - 1];
    }

}
