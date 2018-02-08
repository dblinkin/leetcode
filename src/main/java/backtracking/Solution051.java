package backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by zhang on 2017/7/3.
 */
public class Solution051 {

    public List<List<String>> solveNQueens(int n) {

        if (n < 1) {
            return Collections.emptyList();
        }

        List<List<String>> results = new ArrayList<>();

        int k = 1;
        int[] queen = new int[n + 1];
        while (k >= 1) {
            while (queen[k] < n) {
                queen[k] += 1;
                if (canPlace(k, queen)) {
                    if (k == n) {
                        results.add(genResult(queen));
                        break;
                    }
                    k++;
                }
            }
            queen[k] = 0;
            k--;
        }
        return results;

    }

    private boolean canPlace(int k, int[] queue) {
        for (int i = 1; i < k; i++) {
            // 同一行  或者 对角线
            if (queue[i] == queue[k] || (k - i) == Math.abs(queue[k] - queue[i])) {
                return false;
            }
        }
        return true;
    }

    private List<String> genResult(int[] queue) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i < queue.length; i++) {
            StringBuilder re = new StringBuilder();
            for (int j = 1; j < queue.length; j++) {
                if (queue[i] == j) {
                    re.append('Q');
                } else {
                    re.append('.');
                }
            }
            result.add(re.toString());
        }
        return result;
    }


}
