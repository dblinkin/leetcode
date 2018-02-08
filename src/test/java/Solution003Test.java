import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhang on 2017/6/21.
 */
public class Solution003Test {
    @Test
    public void testLengthOfLongestSubstring() throws Exception {
        assertEquals(3, new Solution003().lengthOfLongestSubstring("abcabcbb"));

        assertEquals(1, new Solution003().lengthOfLongestSubstring("bbbbb"));

        assertEquals(3, new Solution003().lengthOfLongestSubstring("pwwkew"));

        assertEquals(3, new Solution003().lengthOfLongestSubstring("dvdf"));

        assertEquals(18, new Solution003().lengthOfLongestSubstring("abcdefghijklmnopqz"));
    }

}