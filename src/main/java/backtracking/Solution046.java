package backtracking;

import java.util.*;

/**
 * Created by zhang on 2017/7/3.
 */
public class Solution046 {

    public List<List<Integer>> permute(int[] nums) {

        if (nums == null || nums.length == 0) {
            return Collections.EMPTY_LIST;
        }

        List<List<Integer>> results = new ArrayList<>();

        int pi = -1;
        int k = 0;
        int len = nums.length;
        Integer[] permute = new Integer[len];
        BitSet bits = new BitSet(len);
        while (k >= 0) {

            while (k < len) {
                int next = bits.nextClearBit(k);
                permute[++pi] = next;
                if (pi == len - 1) {
                    results.add(new ArrayList<>(Arrays.asList(permute)));
                    break;
                }
                bits.set(next);
                k = next + 1;
            }

            pi --;
            k = permute[pi];
            bits.clear(permute[pi], len);
            permute[pi] += 1;
            bits.set(permute[pi]);

        }
        return results;

    }

}
