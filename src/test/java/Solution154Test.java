import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhang on 2017/6/25.
 */
public class Solution154Test {
    @Test
    public void testFindMin() throws Exception {

        assertEquals(1, new Solution154().findMin(new int[]{1}));

        assertEquals(1, new Solution154().findMin(new int[]{1, 1}));

        assertEquals(1, new Solution154().findMin(new int[]{1, 1, 1}));

        assertEquals(0, new Solution154().findMin(new int[]{1, 1, 0, 1}));

        assertEquals(0, new Solution154().findMin(new int[]{1, 1, 0, 1, 1}));

        assertEquals(1, new Solution154().findMin(new int[]{1, 1, 2, 2}));

        assertEquals(0, new Solution154().findMin(new int[]{1, 2, 2, 0, 0}));

        assertEquals(0, new Solution154().findMin(new int[]{2, 3, 0, 1, 2, 2, 2}));

        assertEquals(0, new Solution154().findMin(new int[]{6, 0, 1, 2, 4, 5}));

        assertEquals(0, new Solution154().findMin(new int[]{4, 5, 6, 7, 0, 1, 2}));
    }

}