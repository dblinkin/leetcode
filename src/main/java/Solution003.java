/**
 * Created by zhang on 2017/6/21.
 */
public class Solution003 {

    public int lengthOfLongestSubstring(String s) {

        int maxLen = 0;
        int len = 0;

        // 256个ascii字符的首次出现的下一个位置，即下一次迭代的位置
        int[] next = new int[256];
        char[] ss = s.toCharArray();

        for (int i = 0; i < ss.length; ) {
            int bitsIndex = ss[i];
            if (next[bitsIndex] == 0) {
                len++;
                next[bitsIndex] = i + 1;
                i ++;
            } else {
                maxLen = len > maxLen ? len : maxLen;

                len = 0;
                i = next[bitsIndex];
                for (int j = 0; j < next.length; j++) {
                    next[j] = 0;
                }

            }
        }

        return len > maxLen ? len : maxLen;
    }

}
