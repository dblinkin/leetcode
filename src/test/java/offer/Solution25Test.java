package offer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution25Test {

    @Test
    public void mergeTwoLists() {

        Solution25 solution25 = new Solution25();
        assertEquals("1->2->3->4", solution25.mergeTwoLists(ListNode.build(1, 3), ListNode.build(2, 4)).toString());
        assertEquals("1->3", solution25.mergeTwoLists(ListNode.build(1, 3), ListNode.build()).toString());
        assertEquals("1->2->3->4->5->6", solution25.mergeTwoLists(ListNode.build(1, 3, 5, 6), ListNode.build(2, 4)).toString());
    }
}