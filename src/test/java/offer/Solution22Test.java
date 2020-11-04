package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution22Test {

    @Test
    public void testGetKthFromEnd() throws Exception {

        Solution22 solution22 = new Solution22();
        ListNode head = ListNode.build(1, 2, 3, 4, 5);
        assertEquals("4->5", ListNode.toString(solution22.getKthFromEnd(head, 2)));

        assertEquals("5", ListNode.toString(solution22.getKthFromEnd(head, 1)));

        assertEquals("1->2->3->4->5", ListNode.toString(solution22.getKthFromEnd(head, 5)));

        assertEquals("", ListNode.toString(solution22.getKthFromEnd(head, 6)));
    }
}