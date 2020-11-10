package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution16Test {

    @Test
    public void myPow() {

        Solution16 solution16 = new Solution16();

        double delta = 0.00001d;
        assertEquals(1.0, solution16.myPow(1.000d, Integer.MIN_VALUE), delta);
        assertEquals(1.0, solution16.myPow(-1.000d, Integer.MIN_VALUE), delta);
        assertEquals(0.0, solution16.myPow(0.00001, Integer.MAX_VALUE), delta);

        assertEquals(0.00003, solution16.myPow(34.00515, -3), delta);

        assertEquals(1024.00000, solution16.myPow(2.00000d, 10), delta);
        assertEquals(9.26100, solution16.myPow(2.10000, 3), delta);
        assertEquals(0.25000, solution16.myPow(2.00000d, -2), delta);

        assertEquals(-1.0d, solution16.myPow(-1.0d, -1), delta);
        assertEquals(1.0, solution16.myPow(-1.0d, -2), delta);

    }
}