package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution45Test {

    @Test
    public void minNumber() {

        Solution45 solution45 = new Solution45();
        assertEquals("10", solution45.minNumber(new int[]{10}));
        assertEquals("102", solution45.minNumber(new int[]{10, 2}));
        assertEquals("3033459", solution45.minNumber(new int[]{3,30,34,5,9}));
        assertEquals("95969798998999", solution45.minNumber(new int[]{99, 98, 97, 96, 95, 9, 998}));


    }
}