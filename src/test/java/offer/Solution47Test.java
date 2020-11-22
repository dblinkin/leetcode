package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution47Test {

    @Test
    public void maxValue() {

        Solution47 solution47 = new Solution47();
        int[][] grid;

        grid = new int[][]{
                {1, 3, 1,},
                {1, 5, 1,},
                {4, 2, 1}
        };
        assertEquals(12, solution47.maxValue(grid));

    }
}