package offer;

public class Solution24 {

    public ListNode reverseList(ListNode head) {


        ListNode tail = null;
        ListNode temp = null;


        while (head != null) {
            tail = head;
            head = head.next;
            head.next = tail;

        }


    }
}
