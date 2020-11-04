package offer;

public class Solution19 {

    public boolean isMatch(String s, String p) {

        char[] str = s.toCharArray();
        char[] pattern = p.toCharArray();

        boolean[] dp = new boolean[str.length + 1];
        dp[0] = true;

        int i = 0, j = 0;
        while (i < str.length && j < pattern.length) {
            dp[i + 1] = isMath(str, i, pattern, j, dp);
            if (i < str.length) {
                i++;
            }
            if (j < pattern.length) {
                j++;
            }
        }
        return dp[str.length];

    }

    public boolean isMath(char[] str, int i, char[] p, int j, boolean dp[]) {
        int dpIndex = i + 1;
        if (dp[dpIndex-1] && (str[i] == p[j] || p[j] == '.')) {
            return true;
        }

        if (p[j] == '*' && (dp[dpIndex-2] || dp[dpIndex-1])) {
            return true;
        }

        return false;

    }
}
