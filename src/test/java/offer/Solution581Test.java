package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution581Test {

    @Test
    public void testReverseWords() throws Exception {

        Solution581 solution581 = new Solution581();

        assertEquals("t", solution581.reverseWords("t"));
        assertEquals("tb", solution581.reverseWords("tb"));
        assertEquals("the sky is blue", solution581.reverseWords("blue is sky the"));
        assertEquals("world! hello", solution581.reverseWords("  hello world!  "));
        assertEquals("example good a", solution581.reverseWords("a good   example"));


    }
}