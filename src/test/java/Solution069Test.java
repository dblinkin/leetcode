import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhang on 2017/6/22.
 */
public class Solution069Test {
    @Test
    public void testMySqrt() throws Exception {

        assertEquals(0, new Solution069().mySqrt(0));

        assertEquals(1, new Solution069().mySqrt(1));

        assertEquals(1, new Solution069().mySqrt(2));

        assertEquals(3, new Solution069().mySqrt(9));

        assertEquals(3, new Solution069().mySqrt(10));

        assertEquals(3, new Solution069().mySqrt(15));

        assertEquals(4, new Solution069().mySqrt(16));

        assertEquals(46339, new Solution069().mySqrt(2147395599));

        assertEquals((int)Math.sqrt(Integer.MAX_VALUE), new Solution069().mySqrt(Integer.MAX_VALUE));

        System.out.println(Integer.MAX_VALUE);
    }

}