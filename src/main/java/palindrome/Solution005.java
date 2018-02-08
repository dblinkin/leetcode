package palindrome;

/**
 * Created by zhang on 2018/2/3.
 */
public class Solution005 {

    public String longestPalindrome(String s) {

        String str = prepare(s);
        int[] result = manacher(str);
        return getResult(str, result);

    }

    private String getResult(String str, int[] result) {
        char[] c = str.toCharArray();
        StringBuilder res = new StringBuilder();
        for (int i = 0 ; i < str.length(); i++) {
            if (c[i] == '#') {
                continue;
            }

            if (i >= (result[0] - result[1]) && i <= (result[0] + result[1])) {
                res.append(c[i]);
            }
        }
        return res.toString();
    }


    private int[] manacher(String s) {

        char[] cs = s.toCharArray();
        int[] p = new int[cs.length];

        int mid = 0;
        int maxRight = 0;
        int maxLen = 0;
        int maxLenIndex = 0;

        for (int i = 0; i < s.length(); i++) {

            if (i < maxRight) {
                p[i] = Math.min(maxRight - i, p[2 * mid - i]);
            } else {
                p[i] = 1;
            }

            while ((i + p[i] < cs.length && i - p[i] >= 0)
                    && cs[i + p[i]] == cs[i - p[i] ]) {
                p[i]++;
            }

            if (i + p[i] > maxRight) {
                maxRight = i + p[i];
                mid = i;
            }

            if (p[i] > maxLen) {
                maxLen = p[i];
                maxLenIndex = i;
            }
        }

        return new int[]{maxLenIndex, maxLen - 1};
    }

    // abba --> #a#b#b#a#
    private String prepare(String s) {
        StringBuilder result = new StringBuilder("#");
        for (char c : s.toCharArray()) {
            result.append(c).append("#");
        }
        return result.toString();

    }

}
