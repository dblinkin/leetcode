package offer;

public class Solution13 {

    public int movingCount(int m, int n, int k) {
        if (m <= 0 || n <= 0 || k < 0) {
            return 0;
        }

        int count = 0;
        boolean[][] dp = new boolean[m][n];
        for (int row = 0; row < m; row++) {
            for (int column = 0; column < n; column++) {
                if (row == 0 && column == 0 ) {
                    dp[row][column] = true;
                    count++;
                } else if (row == 0) {
                    if (dp[row][column - 1] && sum(column) <= k) {
                        dp[row][column] = true;
                        count++;
                    }
                } else if (column == 0) {
                    if (dp[row - 1][column] && sum(row) <= k) {
                        dp[row][column] = true;
                        count++;
                    }
                } else {
                    if ((dp[row][column - 1] || dp[row - 1][column]) && sum(row) + sum(column) <= k ) {
                        dp[row][column] = true;
                        count++;
                    }
                }
            }
        }
        return count;
    }

    private int sum(int m) {
        int sum = 0;

        while (m != 0) {
            sum += m % 10;
            m = m / 10;
        }

        return sum;
    }


}
