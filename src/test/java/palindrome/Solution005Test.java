package palindrome;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhang on 2018/2/4.
 */
public class Solution005Test {

    Solution005 s = new Solution005();

    @Test
    public void testLongestPalindrome() throws Exception {

        assertEquals("a", s.longestPalindrome("a"));
        assertEquals("aa", s.longestPalindrome("aa"));
        assertEquals("aba", s.longestPalindrome("aba"));
        assertEquals("bab", s.longestPalindrome("babad"));
        assertEquals("bb", s.longestPalindrome("cbbd"));
    }

}