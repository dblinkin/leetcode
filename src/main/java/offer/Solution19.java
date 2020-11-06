package offer;

public class Solution19 {

    public boolean isMatch(String s, String p) {


        char[] str = new char[s.length() + 1];
        str[0] = '#';
        System.arraycopy(s.toCharArray(), 0, str, 1, s.length());

        char[] pattern = new char[p.length() + 1];
        pattern[0] = '#';
        System.arraycopy(p.toCharArray(), 0, pattern, 1, p.length());

        // 隐含 dp[0][0] = true;
        boolean[][] dp = new boolean[str.length][pattern.length];
        dp[0][0] = true;

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < pattern.length; j++) {
                if (i + j != 0) {
                    dp[i][j] = isMatch(str, i, pattern, j, dp);
                }
            }
        }

        return dp[str.length - 1][pattern.length - 1];
    }

    public boolean isMatch(char[] str, int i, char[] p, int j, boolean dp[][]) {
        if (p[j] == '*' && ((j > 1 & dp[i][j-2]) || (j > 0 && dp[i][j-1]) || (i > 0 && dp[i-1][j]))) {
            return true;
        } else if ((str[i] == p[j] || p[j] == '.') && ( i > 0 && j > 0 && dp[i - 1][j - 1])) {
            return true;
        }
        return false;
    }
}
