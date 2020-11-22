package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution13Test {

    @Test
    public void movingCount() {

        Solution13 solution13 = new Solution13();
        assertEquals(15, solution13.movingCount(16, 8, 4));

        assertEquals(3, solution13.movingCount(2, 3, 1));
        assertEquals(1, solution13.movingCount(3, 1, 0));

    }
}