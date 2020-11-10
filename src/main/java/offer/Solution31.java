package offer;

import java.util.Stack;

public class Solution31 {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if (pushed.length != popped.length) {
            return false;
        }

        Stack<Integer> stack = new Stack<>();

        int j = 0;
        for (int i = 0; i < pushed.length; i++) {
            stack.push(pushed[i]);
            while (!stack.isEmpty() && stack.peek() == popped[j]) {
                stack.pop();
                j++;
            }
        }

        while (!stack.isEmpty()) {
            if (stack.pop() != popped[j++]) {
                return false;
            }
        }

        return true;
    }

}
