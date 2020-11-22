package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution46Test {

    @Test
    public void translateNum() {

        Solution46 solution46 = new Solution46();

        assertEquals(1, solution46.translateNum(0));
        assertEquals(1, solution46.translateNum(1));
        assertEquals(5, solution46.translateNum(12258));
        assertEquals(2, solution46.translateNum(10000));
        assertEquals(3, solution46.translateNum(2147483646));
        assertEquals(27, solution46.translateNum(1234123123));
    }
}