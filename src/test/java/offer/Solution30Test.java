package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution30Test {

    @Test
    public void test() {
        Solution30.MinStack minStack = new Solution30.MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        assertEquals(-3, minStack.min());
        minStack.pop();
        assertEquals(0, minStack.top());
        assertEquals(-2, minStack.min());
        minStack.pop();
        minStack.pop();
        assertEquals(0, minStack.min());
    }

}