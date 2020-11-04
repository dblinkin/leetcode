package offer;

public class Solution18 {

    public ListNode deleteNode(ListNode head, int val) {

        ListNode prev = new ListNode(0);
        prev.next = head;
        ListNode dummy = prev;

        while (head != null) {
            if (head.val == val) {
                prev.next = head.next;
                head.next = null;
                break;
            } else {
                head = head.next;
                prev = prev.next;
            }
        }
        return dummy.next;

    }
}
