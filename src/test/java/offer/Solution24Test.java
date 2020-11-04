package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution24Test {

    @Test
    public void reverseList() {
        Solution24 solution24 = new Solution24();
        assertEquals("1", ListNode.toString(solution24.reverseList(ListNode.build(1))));
        assertEquals("2->1", ListNode.toString(solution24.reverseList(ListNode.build(1, 2))));
        assertEquals("5->4->3->2->1", ListNode.toString(solution24.reverseList(ListNode.build(1, 2, 3, 4, 5))));
    }
}