package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution19Test {

    @Test
    public void isMatch() {
        Solution19 solution19 = new Solution19();

        assertEquals(true, solution19.isMatch("aab", "c*a*b"));
        assertEquals(true, solution19.isMatch("ab", ".*"));
        assertEquals(false, solution19.isMatch("aa", "a"));
        assertEquals(true, solution19.isMatch("aa", "a*"));
        assertEquals(false, solution19.isMatch("mississippi", "mis*is*p*."));


    }
}