import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhang on 2017/6/26.
 */
public class Solution188Test {
    @Test
    public void testMaxProfit() throws Exception {
        assertEquals(0, new Solution188().maxProfit(2, new int[]{1, 1}));

        assertEquals(1, new Solution188().maxProfit(2, new int[]{1, 2}));

        assertEquals(0, new Solution188().maxProfit(2, new int[]{7, 1}));

        assertEquals(2, new Solution188().maxProfit(2, new int[]{7, 1, 3}));

        assertEquals(10, new Solution188().maxProfit(2, new int[]{7, 1, 3, 5, 2, 6, 8}));

        assertEquals(7, new Solution188().maxProfit(2, new int[]{3, 2, 6, 5, 0, 3}));
    }

}