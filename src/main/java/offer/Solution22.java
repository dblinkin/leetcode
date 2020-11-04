package offer;

public class Solution22 {


    public ListNode getKthFromEnd(ListNode head, int k) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode start = dummy;
        ListNode end = dummy;

        for (int i = 0; i < k + 1; i++) {
            if (end == null) {
                return null;
            }
            end = end.next;
        }

        while (end != null) {
            end = end.next;
            start = start.next;
        }

        return start.next;
    }

}
