import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhang on 2017/6/26.
 */
public class Solution121Test {

    @Test
    public void testMaxProfit() throws Exception {
        assertEquals(0, new Solution121().maxProfit(new int[]{7}));

        assertEquals(5, new Solution121().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));

        assertEquals(7, new Solution121().maxProfit(new int[]{7, 1, 2, 5, 3, 6, 4, 8}));

        assertEquals(0, new Solution121().maxProfit(new int[]{7, 6, 4, 3, 1}));

    }

}