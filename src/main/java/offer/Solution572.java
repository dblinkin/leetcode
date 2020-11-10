package offer;

import java.util.ArrayList;
import java.util.List;

public class Solution572 {

    public int[][] findContinuousSequence(int target) {

        if (target <= 1) {
            return new int[0][0];
        }

        List<int[]> result = new ArrayList<>();
        int begin = 1;
        int right = begin + 1;
        int sum = begin + right;
        while (begin < (target + 1) >> 1) {
            if (sum < target) {
                right++;
                sum += right;
            } else if (sum > target) {
                sum -= begin;
                begin++;
            } else {
                int[] r = new int[right - begin + 1];
                int index = -1;
                for (int i = begin; i <= right ; i++) {
                    r[++index] = i;
                }
                result.add(r);
                sum -= begin;
                begin++;
            }

        }

        int[][] rr = new int[result.size()][];
        for (int i = 0; i < result.size(); i++) {
            rr[i] = result.get(i);
        }
        return rr;
    }
}
