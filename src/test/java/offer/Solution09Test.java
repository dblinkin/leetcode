package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution09Test {

    @Test
    public void testQueue() throws Exception {
        Solution09.CQueue queue = new Solution09.CQueue();

        queue.appendTail(3);
        queue.appendTail(2);

        assertEquals(3, queue.deleteHead());
        queue.appendTail(4);

        assertEquals(2, queue.deleteHead());
        assertEquals(4, queue.deleteHead());
    }

}