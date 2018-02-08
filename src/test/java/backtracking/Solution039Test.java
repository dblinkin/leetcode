package backtracking;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by zhang on 2018/2/7.
 */
public class Solution039Test {

    Solution039 s = new Solution039();

    @Test
    public void testCombinationSum() throws Exception {

        List<List<Integer>> results = s.combinationSum(new int[]{2, 3, 6, 7}, 7);
        assertArrayEquals(new Integer[]{2,2,3}, results.get(0).toArray());
        assertArrayEquals(new Integer[]{7}, results.get(1).toArray());


    }

}