package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution57Test {

    @Test
    public void twoSum() {
        Solution57 solution57 = new Solution57();
        assertArrayEquals(new int[]{2, 7}, solution57.twoSum(new int[]{2,7,11,15}, 9));
        assertArrayEquals(new int[]{}, solution57.twoSum(new int[]{2,7,11,15}, 10));
        assertArrayEquals(new int[]{}, solution57.twoSum(new int[]{2,7,11,15}, 30));
        assertArrayEquals(new int[]{11,15}, solution57.twoSum(new int[]{2,7,11,15}, 26));

        assertArrayEquals(new int[]{10, 30}, solution57.twoSum(new int[]{10,26,30,31,47,60}, 40));
        assertArrayEquals(new int[]{}, solution57.twoSum(new int[]{2}, 2));

    }
}