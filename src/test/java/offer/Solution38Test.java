package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution38Test {

    @Test
    public void testPermutation() throws Exception {

        String[] result ;
        Solution38 solution38 = new Solution38();

        result = solution38.permutation("ab");
        assertEquals(result.length, 2);

        result = solution38.permutation("");
        assertEquals(result.length, 0);

        result = solution38.permutation("a");
        assertEquals(result.length, 1);

        result = solution38.permutation("abc");
        assertEquals(result.length, 6);

        result = solution38.permutation("abcd");
        assertEquals(result.length, 24);

        result = solution38.permutation("abcde");
        assertEquals(result.length, 120);

        result = solution38.permutation("aab");
        assertEquals(result.length, 3);

    }
}