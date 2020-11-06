package offer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution31Test {

    @Test
    public void testValidateStackSequences() throws Exception {

        Solution31 solution31 = new Solution31();

        assertEquals(true, solution31.validateStackSequences(new int[]{2, 1, 0}, new int[]{1, 2, 0}));

        assertEquals(true, solution31.validateStackSequences(new int[]{1, 2, 3, 4, 5}, new int[]{4, 5, 3, 2, 1}));

        assertEquals(false, solution31.validateStackSequences(new int[]{1, 2, 3, 4, 5, 6}, new int[]{4, 5, 3, 2, 1}));

        assertEquals(false, solution31.validateStackSequences(new int[]{1, 2, 3, 4, 5}, new int[]{4, 5, 3, 2, 1, 6}));



    }
}