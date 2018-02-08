import java.awt.*;

/**
 * Created by zhang on 2017/6/19.
 */
public class Solution021 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode n1 = l1;
        ListNode n2 = l2;

        ListNode head = new ListNode(0), result = head;

        outer:
        while (n1 != null && n2 != null) {

            while (n1.val < n2.val) {
                result.next = n1;
                result = result.next;
                n1 = n1.next;
                if (n1 == null) {
                    break outer;
                }
            }

            while (n1.val >= n2.val) {
                result.next = n2;
                result = result.next;
                n2 = n2.next;
                if (n2 == null) {
                    break outer;
                }
            }
        }

        if (n1 != null) {
            result.next = n1;
        }

        if (n2 != null) {
            result.next = n2;
        }
        return head.next;
    }

}
