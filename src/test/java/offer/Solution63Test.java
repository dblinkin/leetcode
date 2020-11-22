package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution63Test {

    @Test
    public void maxProfit() {

        Solution63 solution63 = new Solution63();
        assertEquals(0, solution63.maxProfit(new int[]{}));
        assertEquals(0, solution63.maxProfit(new int[]{7}));
        assertEquals(0, solution63.maxProfit(new int[]{7, 6}));

        assertEquals(1, solution63.maxProfit(new int[]{6, 7}));
        assertEquals(4, solution63.maxProfit(new int[]{4, 8, 2, 5}));

        assertEquals(5, solution63.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        assertEquals(0, solution63.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}