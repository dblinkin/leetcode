package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution42Test {

    @Test
    public void maxSubArray() {
        Solution42 solution42 = new Solution42();

        assertEquals(6, solution42.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));

        assertEquals(1, solution42.maxSubArray(new int[]{1}));
    }
}