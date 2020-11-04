package offer;

public class Solution24 {

    public ListNode reverseList(ListNode head) {

        ListNode tail = null;
        ListNode cur = head;

        while (head != null) {
            cur = head;
            head = head.next;

            cur.next = tail;
            tail = cur;
        }
        return cur;
    }
}
