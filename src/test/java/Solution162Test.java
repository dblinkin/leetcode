import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhang on 2017/6/27.
 */
public class Solution162Test {

    @Test
    public void testFindPeakElement() throws Exception {

        assertEquals(0, new Solution162().findPeakElement(new int[]{1}));

        assertEquals(1, new Solution162().findPeakElement(new int[]{1, 2}));

        assertEquals(2, new Solution162().findPeakElement(new int[]{1, 2, 3}));

        assertEquals(0, new Solution162().findPeakElement(new int[]{3, 2, 1}));

        assertEquals(2, new Solution162().findPeakElement(new int[]{1, 2, 3, 1}));

        assertEquals(1, new Solution162().findPeakElement(new int[]{3, 4, 3, 2, 1}));

        assertEquals(6, new Solution162().findPeakElement(new int[]{1, 2, 3, 2, 1, 5, 7, 3, 5}));
    }

}