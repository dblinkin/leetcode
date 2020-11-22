package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution141Test {

    @Test
    public void cuttingRope() {

        Solution141 solution141 = new Solution141();

        assertEquals(1, solution141.cuttingRope(2));
        assertEquals(2, solution141.cuttingRope(3));
        assertEquals(4, solution141.cuttingRope(4));
        assertEquals(6, solution141.cuttingRope(5));

        assertEquals(6, solution141.cuttingRope(5));
        assertEquals(36, solution141.cuttingRope(10));
        assertEquals(1549681956, solution141.cuttingRope(58));
    }
}