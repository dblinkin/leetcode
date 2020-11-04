package offer;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }


    public static ListNode build(int... values) {
        if (values.length == 0) {
            return null;
        }


        ListNode head = new ListNode(values[0]);
        ListNode start = head;
        for (int i = 1; i < values.length; i++) {
            start.next = new ListNode(values[i]);
            start = start.next;
        }
        return head;
    }

    public static String toString(ListNode head) {
        if (head == null) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        while (head != null) {
            if (head.next != null) {
                result.append(head.val).append("->");
            } else {
                result.append(head.val);
            }
            head = head.next;
        }

        return result.toString();
    }
}
