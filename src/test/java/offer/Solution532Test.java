package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution532Test {

    @Test
    public void missingNumber() {
        Solution532 solution532 = new Solution532();
        assertEquals(2, solution532.missingNumber(new int[]{0, 1, 3}));
        assertEquals(8, solution532.missingNumber(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 9}));
    }
}