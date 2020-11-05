package offer;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution29Test {

    @Test
    public void testSpiralOrder() throws Exception {
        Solution29 solution29 = new Solution29();

        int[][] matrix;

        matrix = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
        };
        assertArrayEquals(new int[]{1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7}, solution29.spiralOrder(matrix));

        matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        assertArrayEquals(new int[]{1, 2, 3, 6, 9, 8, 7, 4, 5}, solution29.spiralOrder(matrix));



        matrix = new int[][]{
                {1, 2, 3, 4}
        };
        assertArrayEquals(new int[]{1, 2, 3, 4}, solution29.spiralOrder(matrix));

        matrix = new int[][]{
                {1},
                {2},
                {3},
                {4}
        };
        assertArrayEquals(new int[]{1, 2, 3, 4}, solution29.spiralOrder(matrix));

    }
}