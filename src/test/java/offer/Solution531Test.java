package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution531Test {

    @Test
    public void search() {

        Solution531 solution531 = new Solution531();
        assertEquals(1, solution531.search(new int[]{5,7,7,8,8,10}, 5));
        assertEquals(2, solution531.search(new int[]{5,7,7,8,8,10}, 7));
        assertEquals(2, solution531.search(new int[]{5,7,7,8,8,10}, 8));
        assertEquals(0, solution531.search(new int[]{5,7,7,8,8,10}, 9));
        assertEquals(1, solution531.search(new int[]{5,7,7,8,8,10}, 10));
    }
}