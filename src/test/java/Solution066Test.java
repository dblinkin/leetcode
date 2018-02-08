import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhang on 2017/6/22.
 */
public class Solution066Test {
    @Test
    public void testPlusOne() throws Exception {

        assertArrayEquals(new int[]{1, 2, 3, 5}, new Solution066().plusOne(new int[]{1, 2, 3, 4}));

        assertArrayEquals(new int[]{1, 2, 4, 0}, new Solution066().plusOne(new int[]{1, 2, 3, 9}));

        assertArrayEquals(new int[]{1, 0, 0, 0, 0}, new Solution066().plusOne(new int[]{9, 9, 9, 9}));

        assertArrayEquals(new int[]{0, 0, 0, 1}, new Solution066().plusOne(new int[]{0, 0, 0, 0}));
    }

}