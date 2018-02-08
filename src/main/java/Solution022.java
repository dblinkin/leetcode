import java.util.*;

/**
 * Created by zhang on 2017/6/19.
 */
public class Solution022 {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        generate(n, n, "", result);
        return result;
    }

    private void generate(int left, int right, String s, List<String> result) {

        if (left == 0 && right == 0) {
            result.add(s);
            return;
        }

        if (left > 0) {
            generate(left - 1, right, s + "(", result);
        }

        if (right > 0 && right > left) {
            generate(left, right - 1, s + ")", result);
        }

    }

}
