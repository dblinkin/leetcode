package offer;

import java.util.Stack;

public class Solution31 {

    public boolean validateStackSequences(int[] pushed, int[] popped) {

        Stack<Integer> stack = new Stack<>();

        int j = 0;
        for (int i = 0; i < pushed.length; i++) {
            stack.push(pushed[i]);
            if (pushed[i] == popped[j]) {
                stack.pop();
                j++;
            }
        }

        while (!stack.isEmpty() && j < popped.length) {
            if (stack.pop() != popped[j++]) {
                return false;
            }
        }

        return stack.isEmpty() && j == popped.length;
    }

}
