package offer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution18Test {

    @Test
    public void deleteNode() {
        Solution18 solution18 = new Solution18();

        assertEquals("4->1->9", solution18.deleteNode(ListNode.build(4,5,1,9), 5).toString());
        assertEquals("4->5->9", solution18.deleteNode(ListNode.build(4,5,1,9), 1).toString());
        assertEquals("4->5->1->9", solution18.deleteNode(ListNode.build(4,5,1,9), 10).toString());

        assertEquals("4", solution18.deleteNode(ListNode.build(4), 10).toString());
        assertEquals(null, solution18.deleteNode(ListNode.build(4), 4));
        assertEquals(null, solution18.deleteNode(ListNode.build(), 10));

    }
}