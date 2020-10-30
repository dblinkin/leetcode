package offer;

import java.util.Stack;

public class Solution09 {

    public static class CQueue {
        private Stack<Integer> addStack;
        private Stack<Integer> removeStack;

        public CQueue() {
            this.addStack = new Stack<>();
            this.removeStack = new Stack<>();
        }

        public void appendTail(int value) {
            this.addStack.push(value);
        }

        public int deleteHead() {
            if (this.removeStack.isEmpty() && this.addStack.isEmpty()) {
                return -1;
            }

            if (this.removeStack.isEmpty()) {
                while (!this.addStack.isEmpty()) {
                    this.removeStack.push(this.addStack.pop());
                }
            }
            return this.removeStack.pop();
        }
    }
}
