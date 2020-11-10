package offer;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public ListNode getElementAt(int index) {
        return ListNode.getElementAt(this, index);
    }

    @Override
    public String toString() {
        return ListNode.toString(this);
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

    public static ListNode getElementAt(ListNode head, int index) {
        if (index < 0) {
            return null;
        }

        for (int i = 0; i < index; i++) {
            if (head.next == null) {
                return null;
            } else {
                head = head.next;
            }
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
