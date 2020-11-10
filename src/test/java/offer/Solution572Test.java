package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution572Test {

    @Test
    public void findContinuousSequence() {

        Solution572 solution572 = new Solution572();
        int[][] result;

        result = solution572.findContinuousSequence(2);
        assertEquals(true, result.length == 0);

        result = solution572.findContinuousSequence(3);
        assertArrayEquals(new int[]{1,2}, result[0]);

        result = solution572.findContinuousSequence(9);
        assertArrayEquals(new int[]{2,3,4}, result[0]);
        assertArrayEquals(new int[]{4,5}, result[1]);

        result = solution572.findContinuousSequence(15);
        assertArrayEquals(new int[]{1,2,3,4,5}, result[0]);
        assertArrayEquals(new int[]{4,5,6}, result[1]);
        assertArrayEquals(new int[]{7,8}, result[2]);

    }
}