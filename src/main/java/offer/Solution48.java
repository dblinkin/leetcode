package offer;

public class Solution48 {


    public int lengthOfLongestSubstring(String s) {

        if (s == null || s.length() == 0) {
            return 0;
        }

        char[] chars = s.toCharArray();
        int[] dp = new int[chars.length];
        int max = dp[0] = 1;

        int[] index = new int[256];
        index[chars[0]] = 1;

        for (int i = 1; i < chars.length; i++) {
            if (index[chars[i]] == 0) {
                dp[i] = dp[i - 1] + 1;
            } else {
                int distance = i +1 - index[chars[i]];
                if (distance > dp[i - 1]) {
                    dp[i] = dp[i - 1] + 1;
                } else {
                    dp[i] = distance;
                }
            }
            index[chars[i]] = i + 1;
            max = Math.max(max, dp[i]);
        }

        return max;
    }


}
