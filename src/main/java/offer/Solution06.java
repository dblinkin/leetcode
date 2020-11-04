package offer;

import java.util.Stack;

public class Solution06 {

    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();

        int len = 0;
        while (head != null) {
            stack.push(head.val);
            head = head.next;
            len++;
        }

        int[] res = new int[len];
        int i = 0;
        while (!stack.isEmpty()) {
            res[i++] = stack.pop();
        }
        return res;
    }
}
