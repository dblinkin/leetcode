import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhang on 2017/6/22.
 */
public class Solution035Test {
    @Test
    public void testSearchInsert() throws Exception {
        assertEquals(2, new Solution035().searchInsert(new int[]{1, 3, 5, 6}, 5));

        assertEquals(1, new Solution035().searchInsert(new int[]{1, 3, 5, 6}, 2));

        assertEquals(4, new Solution035().searchInsert(new int[]{1, 3, 5, 6}, 7));

        assertEquals(0, new Solution035().searchInsert(new int[]{1, 3, 5, 6}, 0));
    }

}