package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution17Test {

    @Test
    public void printNumbers() {
        Solution17 solution17 = new Solution17();

        int[] r;
        r = solution17.printNumbers(2);
        assertEquals(99, r.length);
        for (int i = 0; i < 99; i++) {
            assertEquals(i + 1, r[i]);
        }

        r = solution17.printNumbers(6);
        assertEquals(999999, r.length);
        for (int i = 0; i < 999999; i++) {
            assertEquals(i + 1, r[i]);
        }

        r = solution17.printNumbers(9);
        assertEquals(99999999, r.length);
        for (int i = 0; i < 9999999; i++) {
            assertEquals(i + 1, r[i]);
        }

    }
}