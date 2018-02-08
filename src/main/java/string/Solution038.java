package string;

/**
 * Created by zhang on 2018/2/4.
 */
public class Solution038 {

    public String countAndSay(int n) {

        String source = "1";
        for (int i = 0; i < n - 1; i++) {
            source = countAndSay(source);
        }

        return source;
    }

    public String countAndSay(String s) {
        char[] cs = s.toCharArray();
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 0; i < cs.length - 1; i++) {
            if (cs[i] == cs[i + 1]) {
                count++;
            } else {
                result.append(count).append(cs[i]);
                count = 1;
            }
        }
        result.append(count).append(cs[cs.length - 1]);
        return result.toString();
    }

}
