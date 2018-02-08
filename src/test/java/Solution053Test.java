import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhang on 2017/6/26.
 */
public class Solution053Test {
    @Test
    public void testMaxSubArray() throws Exception {

        assertEquals(6, new Solution053().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));

        assertEquals(-2, new Solution053().maxSubArray(new int[]{-2}));

        assertEquals(-2, new Solution053().maxSubArray(new int[]{-2, -1}));

        assertEquals(-1, new Solution053().maxSubArray(new int[]{-2, 1}));

    }

}