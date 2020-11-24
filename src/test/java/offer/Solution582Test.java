package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution582Test {

    @Test
    public void testReverseLeftWords() throws Exception {

        Solution582 solution582 = new Solution582();

        assertEquals("", solution582.reverseLeftWords("", 2));
        assertEquals("ab", solution582.reverseLeftWords("ab", 2));
        assertEquals("cdefgab", solution582.reverseLeftWords("abcdefg", 2));
        assertEquals("umghlrlose", solution582.reverseLeftWords("lrloseumgh", 6));

    }
}