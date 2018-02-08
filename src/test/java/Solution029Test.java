import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhang on 2017/6/19.
 */
public class Solution029Test {

    @Test
    public void testDivide() throws Exception {

        assertEquals(10, new Solution029().divide(10, 1));

        assertEquals(3, new Solution029().divide(10, 3));

        assertEquals(0, new Solution029().divide(10, 100));

        assertEquals(0, new Solution029().divide(0, 100));


        assertEquals(-1, new Solution029().divide(-1, 1));

        assertEquals(-1, new Solution029().divide(1, -1));

        assertEquals(Integer.MAX_VALUE, new Solution029().divide(Integer.MAX_VALUE, 1));

        assertEquals(Integer.MAX_VALUE, new Solution029().divide(Integer.MIN_VALUE, -1));
    }

}