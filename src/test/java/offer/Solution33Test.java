package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution33Test {

    @Test
    public void verifyPostorder() {
        Solution33 solution33 = new Solution33();

        assertEquals(true, solution33.verifyPostorder(new int[]{}));
        assertEquals(true, solution33.verifyPostorder(new int[]{2}));
        assertEquals(true, solution33.verifyPostorder(new int[]{1, 2}));
        assertEquals(true, solution33.verifyPostorder(new int[]{1, 3, 2, 6, 5}));
        assertEquals(false, solution33.verifyPostorder(new int[]{1, 6, 3, 2, 5}));
        assertEquals(true, solution33.verifyPostorder(new int[]{2, 6, 5}));
        assertEquals(true, solution33.verifyPostorder(new int[]{4, 8, 6, 12, 16, 14, 10}));

    }
}