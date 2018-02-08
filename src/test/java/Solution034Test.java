import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhang on 2017/6/22.
 */
public class Solution034Test {
    @Test
    public void testSearchRange() throws Exception {

        assertArrayEquals(new int[]{3, 4}, new Solution034().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8));

        assertArrayEquals(new int[]{5, 5}, new Solution034().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 10));

        assertArrayEquals(new int[]{0, 0}, new Solution034().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 5));

        assertArrayEquals(new int[]{-1, -1}, new Solution034().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6));

        assertArrayEquals(new int[]{-1, -1}, new Solution034().searchRange(new int[]{}, 0));

        assertArrayEquals(new int[]{14, 16}, new Solution034().searchRange(new int[]{0,2,2,2,3,3,3,4,4,4,4,4,5,5,6,6,6}, 6));
    }

}