import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhang on 2017/6/25.
 */
public class Solution167Test {

    @Test
    public void testTwoSum() throws Exception {

        assertArrayEquals(new int[]{1, 2}, new Solution167().twoSum(new int[]{2, 7, 9, 11, 15}, 9));

        assertArrayEquals(new int[]{4, 5}, new Solution167().twoSum(new int[]{2, 7, 9, 11, 15}, 26));

        assertArrayEquals(new int[]{3, 4}, new Solution167().twoSum(new int[]{2, 7, 9, 11, 15}, 20));

        assertArrayEquals(new int[]{1, 2}, new Solution167().twoSum(new int[]{-1, 0}, -1));

        assertArrayEquals(new int[]{1, 3}, new Solution167().twoSum(new int[]{-1, 0, 1}, 0));

        assertArrayEquals(new int[]{3, 5}, new Solution167().twoSum(new int[]{-5, -3, -1, 0, 1, 8, 9 , 10}, 0));

        assertArrayEquals(new int[]{2, 6}, new Solution167().twoSum(new int[]{-5, -3, -1, 0, 2, 3, 8, 9 , 10}, 0));

        assertArrayEquals(new int[]{2, 6}, new Solution167().twoSum2(new int[]{-5, -3, -1, 0, 2, 3, 8, 9 , 10}, 0));

    }

}