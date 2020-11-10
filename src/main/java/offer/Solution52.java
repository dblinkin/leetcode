package offer;

public class Solution52 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode head1 = headA;
        ListNode head2 = headB;

        int len1 = len(headA);
        int len2 = len(headB);

        if (len1 > len2) {
            for (int i = 0; i < len1 - len2; i++) {
                head1 = head1.next;
            }
        } else {
            for (int i = 0; i < len2 - len1; i++) {
                head2 = head2.next;
            }
        }

        while (head1 != null && head2 != null && head1 != head2) {
            head1 = head1.next;
            head2 = head2.next;
        }

        if (head1 == head2) {
            return head1;
        }
        return null;
    }

    private int len(ListNode head) {
        int len = 0;
        while (head != null) {
            head = head.next;
            len++;
        }
        return len;
    }


}
