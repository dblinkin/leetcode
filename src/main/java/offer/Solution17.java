package offer;

import java.util.ArrayList;
import java.util.List;

public class Solution17 {

    private char[] chars = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    public int[] printNumbers(int n) {
        if (n < 1) {
            return new int[0];
        }

        int count = (int) (Math.pow(10, n) - 1);
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = i + 1;
        }
        return result;
    }

    public int[] printNumbers0(int n) {
        if (n < 1) {
            return new int[0];
        }

        List<String> result = new ArrayList<>();
        char[] cur = new char[n];

        dfs(cur, 0, result, n);
        return result.stream()
                .mapToInt(Integer::parseInt)
                .filter(i -> i > 0)
                .toArray();
    }


    private void dfs(char[] curNum, int i, List<String> result, int n) {
        if (i == n) {
            result.add(new String(curNum));
            return;
        }

        for (int j = 0; j < 10; j++) {
            curNum[i] = chars[j];
            dfs(curNum, i+1, result, n);
        }
    }



}
