package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution39Test {

    @Test
    public void testMajorityElement() throws Exception {
        Solution39 solution39 = new Solution39();

        assertEquals(3, solution39.majorityElement(new int[]{3,2,3}));
        assertEquals(-1, solution39.majorityElement(new int[]{}));
        assertEquals(1, solution39.majorityElement(new int[]{1}));
        assertEquals(1, solution39.majorityElement(new int[]{1,2,1}));
        assertEquals(1, solution39.majorityElement(new int[]{1,2,1,2}));
        assertEquals(1, solution39.majorityElement(new int[]{1,1,2,2,1}));
        assertEquals(2, solution39.majorityElement(new int[]{1, 2, 3, 2, 2, 2, 5, 4, 2}));

    }
}