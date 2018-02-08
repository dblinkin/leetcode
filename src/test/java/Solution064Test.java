import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhang on 2017/6/28.
 */
public class Solution064Test {

    @Test
    public void testMinPathSum() throws Exception {


        assertEquals(0, new Solution064().minPathSum(new int[][]{{0}}));

        assertEquals(1, new Solution064().minPathSum(new int[][]{{0,1}, {1, 0}}));

        assertEquals(3, new Solution064().minPathSum(new int[][]{{1,2}, {1, 1}}));

        int[][] a = new int[][]{
                {0, 1, 2, 3},
                {0, 1, 2, 3},
                {0, 1, 2, 3},

        };
        assertEquals(6, new Solution064().minPathSum(a));

    }

}