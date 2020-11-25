package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution04Test {

    @Test
    public void testFindNumberIn2DArray() throws Exception {

        int[][] matrix = new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };

        Solution04 solution04 = new Solution04();

        assertEquals(true, solution04.findNumberIn2DArray(matrix, 5));
        assertEquals(false, solution04.findNumberIn2DArray(matrix, 20));

    }
}