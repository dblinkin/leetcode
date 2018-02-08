import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhang on 2017/6/27.
 */
public class Solution063Test {
    @Test
    public void testUniquePathsWithObstacles() throws Exception {

        assertEquals(1, new Solution063().uniquePathsWithObstacles(new int[][]{{0}}));

        assertEquals(1, new Solution063().uniquePathsWithObstacles(new int[][]{{0,0}}));

        assertEquals(0, new Solution063().uniquePathsWithObstacles(new int[][]{{0,0}, {0 ,1}}));

        int[][] a = new int[][]{
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0},
        };

        a[0][0] = 1;
        assertEquals(0, new Solution063().uniquePathsWithObstacles(a));
        a[0][0] = 0;

        assertEquals(6, new Solution063().uniquePathsWithObstacles(a));

        a[1][1] = 1;
        assertEquals(2, new Solution063().uniquePathsWithObstacles(a));

        a[0][2] = 1;
        assertEquals(1, new Solution063().uniquePathsWithObstacles(a));

        a[2][0] = 1;
        assertEquals(0, new Solution063().uniquePathsWithObstacles(a));
    }

}