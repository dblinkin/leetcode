import org.junit.Test;
import org.omg.PortableInterceptor.Interceptor;

import static org.junit.Assert.*;

/**
 * Created by zhang on 2017/6/22.
 */
public class Solution050Test {
    @Test
    public void testMyPow() throws Exception {

        assertEquals(Math.pow(2, 0), new Solution050().myPow(2, 0), 0.0000001d);

        assertEquals(Math.pow(2, 1), new Solution050().myPow(2, 1), 0.0000001d);

        assertEquals(Math.pow(2, -1), new Solution050().myPow(2, -1), 0.0000001d);

        assertEquals(Math.pow(2, 8), new Solution050().myPow(2, 8), 0.0000001d);

        assertEquals(Math.pow(2, 11), new Solution050().myPow(2, 11), 0.0000001d);

        assertEquals(Math.pow(2, 31), new Solution050().myPow(2, 31), 0.0000001d);

        assertEquals(Math.pow(0.00001, Integer.MAX_VALUE), new Solution050().myPow(0.00001, Integer.MAX_VALUE), 0.0000001d);

        assertEquals(Math.pow(0.00001, Integer.MIN_VALUE), new Solution050().myPow(0.00001, Integer.MIN_VALUE), 0.0000001d);
    }

}