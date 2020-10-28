package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zhang on 2018/2/4.
 */
public class Solution039 {

    private List<List<Integer>> totalResults = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] a, int target) {

        Arrays.sort(a);

        // dfs(a, new ArrayList<Integer>(), target);

        return totalResults;
    }

    private void dfs(int[] a, int i, List<Integer> results, int target) {
        results.add(a[i]);
        System.out.println(Arrays.toString(results.toArray()));
        int sum = sum(results);
        if (sum == target) {
            System.out.println("##" + target + " " + Arrays.toString(results.toArray()));
            totalResults.add(new ArrayList<Integer>(results));
            return;
        }

        if (sum > target) {
            results.remove(results.size() - 1);
        }
        for (int j = 0; j < a.length; i++) {

             if (sum < target) {
                // dfs(a, results, target);
            } else {
                return;
            }
        }
    }

    private int sum(List<Integer> results) {
        int sum = 0;
        for (int a : results) {
            sum += a;
        }
        return sum;
    }
}
