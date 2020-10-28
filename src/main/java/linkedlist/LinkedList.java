package linkedlist;

public class LinkedList {

    private ListNode head;

    public LinkedList(ListNode head) {
        this.head = head;
    }

    public LinkedList(int... vals) {
        this.head = newList(vals);
    }

    public LinkedList add(LinkedList l1, LinkedList l2) {
        ListNode head = add(l1.head, l2.head);
        return new LinkedList(head);
    }

    public void removeDescKthElemnt(int k) {
        ListNode end = this.head;
        for (int i = 0; i < k; i++) {
            if (end != null) {
                end = end.next;
            }
        }

        ListNode start = this.head;
        while (end != null) {
            end = end.next;
            start = start.next;
        }



    }

    public LinkedList reverse() {
        ListNode before = null;
        ListNode cur = this.head;

        while (cur != null) {
            ListNode next = cur.next;
            cur.next = before;
            before = cur;
            cur = next;
        }
        return new LinkedList(before);
    }


    public int descKthElement(int k) {
        ListNode end = this.head;
        for (int i = 0; i < k; i++) {
            if (end != null) {
                end = end.next;
            }
        }

        ListNode begin = this.head;
        while (end != null) {
            end = end.next;
            begin = begin.next;
        }

        return begin.val;
    }

    @Override
    public String toString() {
        return toString(this.head);
    }

    public static void main(String[] args) {
        ListNode n1 = newList(2, 9, 5, 5, 5, 5);
        System.out.println(toString(n1));
        ListNode n2 = newList(5, 6, 4, 4, 4, 4);
        System.out.println(toString(n2));
        ListNode n = add(n1, n2);
        System.out.println(toString(n));
    }

    private static String toString(ListNode head) {
        StringBuilder result = new StringBuilder();
        while (head != null) {
            if (head.next == null) {
                result.append(head.val);
            } else {
                result.append(head.val).append("->");
            }
            head = head.next;
        }
        return result.toString();
    }

    private static ListNode add(ListNode n1, ListNode n2) {
        ListNode before = new ListNode(0);
        ListNode head = before;
        int carry = 0;
        while (n1 != null || n2 != null) {
            int v1 = n1 == null ? 0 : n1.val;
            int v2 = n2 == null ? 0 : n2.val;
            int v = v1 + v2 + carry;
            if (v >= 10) {
                carry = 1;
                v = v - 10;
            } else {
                carry = 0;
            }
            ListNode node = new ListNode(v);
            before.next = node;
            before = node;

            if (n1 != null) {
                n1 = n1.next;
            }
            if (n2 != null) {
                n2 = n2.next;
            }
        }

        if (carry != 0) {
            ListNode node = new ListNode(carry);
            before.next = node;
        }

        return head.next;
    }


    private static ListNode newList(int... vals) {
        ListNode before = new ListNode(0);
        ListNode head = before;
        for (int val : vals) {
            ListNode node = new ListNode(val);
            before.next = node;
            before = node;
        }
        return head.next;
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
