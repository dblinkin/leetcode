import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhang on 2017/6/23.
 */
public class Solution033Test {

    @Test
    public void testSearch() throws Exception {

        assertEquals(-1, new Solution033().search(new int[]{}, 4));

        assertEquals(0, new Solution033().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 4));

        assertEquals(6, new Solution033().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 2));

        assertEquals(2, new Solution033().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 6));

        assertEquals(-1, new Solution033().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));

        assertEquals(-1, new Solution033().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 8));

    }

}