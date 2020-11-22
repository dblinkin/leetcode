package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution48Test {

    @Test
    public void lengthOfLongestSubstring() {

        Solution48 solution48 = new Solution48();

        assertEquals(3, solution48.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, solution48.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, solution48.lengthOfLongestSubstring("pwwkew"));
    }
}