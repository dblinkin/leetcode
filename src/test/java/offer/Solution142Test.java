package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution142Test {

    @Test
    public void cuttingRope() {

        Solution142 solution142 = new Solution142();

        assertEquals(1, solution142.cuttingRope(2));
        assertEquals(2, solution142.cuttingRope(3));
        assertEquals(4, solution142.cuttingRope(4));
        assertEquals(6, solution142.cuttingRope(5));

        assertEquals(6, solution142.cuttingRope(5));
        assertEquals(36, solution142.cuttingRope(10));
        assertEquals(549681949, solution142.cuttingRope(58));
        assertEquals(324522920, solution142.cuttingRope(59));
        assertEquals(620946522, solution142.cuttingRope(1000));
    }
}