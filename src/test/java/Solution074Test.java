import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhang on 2017/6/23.
 */
public class Solution074Test {
    @Test
    public void testSearchMatrix() throws Exception {

        int[][] a = new int[][]{
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30 , 34, 50}
        };
        assertEquals(true, new Solution074().searchMatrix(a, 3));
        assertEquals(true, new Solution074().searchMatrix(a, 1));
        assertEquals(true, new Solution074().searchMatrix(a, 50));
        assertEquals(false, new Solution074().searchMatrix(a, 15));
        assertEquals(false, new Solution074().searchMatrix(a, 0));
        assertEquals(false, new Solution074().searchMatrix(a, 51));
    }

}