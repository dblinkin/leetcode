package offer;

public class Solution47 {

    public int maxValue(int[][] grid) {

        if (grid == null || grid.length == 0) {
            return 0;
        }

        int[] dp = new int[grid[0].length];
        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[0].length; column++) {
                if (row == 0) {
                    if (column == 0) {
                        dp[column] = grid[row][column];
                    } else {
                        dp[column] = dp[column - 1] + grid[row][column];
                    }
                } else if (column == 0) {
                    dp[column] = dp[column] + grid[row][column];
                } else {
                    dp[column] = Math.max(dp[column - 1], dp[column]) + grid[row][column];
                }
            }
        }

        return dp[grid[0].length - 1];
    }
}
