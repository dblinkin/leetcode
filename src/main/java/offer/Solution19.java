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

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < pattern.length; j++) {
                if (j == 0) {
                    if (i == 0) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = false;
                    }
                } else {
                    dp[i][j] = isMatch(str, i, pattern, j, dp);
                }
            }
        }

        return dp[str.length - 1][pattern.length - 1];
    }

    public boolean isMatch(char[] str, int i, char[] p, int j, boolean dp[][]) {
        boolean isMatch = false;
        if (p[j] == '*') {
            if (dp[i][j - 2]) {
                isMatch = true; // 匹配0次
            } else if (i > 0 && (p[j - 1] == str[i] || p[j - 1] == '.')) {
                isMatch = dp[i][j - 1] | dp[i - 1][j]; // 匹配1次或多次
            }
        } else if (i > 0 && (p[j] == '.' || p[j] == str[i])) {
            isMatch = dp[i - 1][j - 1];
        } else {
            isMatch = false;
        }
        return isMatch;
    }


}
