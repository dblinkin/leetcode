import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhang on 2017/6/25.
 */
public class Solution081Test {
    @Test
    public void testSearch() throws Exception {
        assertEquals(true, new Solution081().search(new int[]{4, 5, 6, 7, 0 , 1, 2}, 2));

        assertEquals(true, new Solution081().search(new int[]{4, 5, 6, 7, 0 , 1, 2}, 4));

        assertEquals(true, new Solution081().search(new int[]{4, 5, 6, 7, 0 , 1, 2}, 1));

        assertEquals(false, new Solution081().search(new int[]{4, 5, 6, 7, 0 , 1, 2}, 3));

        assertEquals(true, new Solution081().search(new int[]{2, 2, 2, 2, 2 , 1, 2}, 1));

        assertEquals(true, new Solution081().search(new int[]{2, 2, 2, 2, 2 , 1, 2}, 2));

        assertEquals(false, new Solution081().search(new int[]{2, 2, 2, 2, 2 , 1, 2}, 3));

        assertEquals(true, new Solution081().search(new int[]{5, 6, 2, 5, 5, 5, 5}, 2));
    }

}