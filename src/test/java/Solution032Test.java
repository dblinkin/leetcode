import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhang on 2017/7/2.
 */
public class Solution032Test {
    @Test
    public void testLongestValidParentheses() throws Exception {

        assertEquals(0, new Solution032().longestValidParentheses("("));

        assertEquals(2, new Solution032().longestValidParentheses("()"));

        assertEquals(2, new Solution032().longestValidParentheses("())"));

        assertEquals(2, new Solution032().longestValidParentheses(")()"));

        assertEquals(2, new Solution032().longestValidParentheses("(()"));

        assertEquals(6, new Solution032().longestValidParentheses("()(()()()"));

        assertEquals(10, new Solution032().longestValidParentheses("()(()()()((()()()())"));

        assertEquals(22, new Solution032().longestValidParentheses("()(()()()((()()()())))"));

        assertEquals(8, new Solution032().longestValidParentheses("()(()()()((()()()()"));


    }

}