/**
 * Created by zhang on 2017/6/21.
 */
public class Solution010 {

    public boolean isMatch(String src, String pattern) {

        char[] s = src.toCharArray();
        char[] p = pattern.toCharArray();

        for (int i = 0; i < p.length; i++) {
            char cur = p[i];
            boolean matchZeroOrMore = false;
            if (i + 1 < p.length && p[i + 1] == '*') {
                matchZeroOrMore = true;
                i ++;
            }


        }
        return false;

    }


}
