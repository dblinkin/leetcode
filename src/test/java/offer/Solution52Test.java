package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution52Test {

    @Test
    public void getIntersectionNode() {

        Solution52 solution52 = new Solution52();

        ListNode a;
        ListNode b;

        a = ListNode.build(new int[]{});
        b = ListNode.build(new int[]{});
        assertEquals(null, solution52.getIntersectionNode(a, b));

        a = ListNode.build(new int[]{2, 6, 4});
        b = ListNode.build(new int[]{1, 5});
        assertEquals(null, solution52.getIntersectionNode(a, b));

        a = ListNode.build(new int[]{4, 1, 8, 4, 5});
        b = ListNode.build(new int[]{5, 0, 1});
        ListNode tailB = b.getElementAt(2);
        tailB.next = a.getElementAt(2);
        assertEquals(a.getElementAt(2), solution52.getIntersectionNode(a, b));

        a = ListNode.build(new int[]{0, 9 ,1});
        b = ListNode.build(new int[]{3, 2, 4});
        ListNode tailA = a.getElementAt(2);
        tailA.next = b.getElementAt(1);
        assertEquals(b.getElementAt(1), solution52.getIntersectionNode(a, b));
    }
}