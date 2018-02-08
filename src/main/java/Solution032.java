/**
 * Created by zhang on 2017/7/2.
 */
public class Solution032 {

    public int longestValidParentheses(String s) {

        if (s == null || s.length() < 2) {
            return 0;
        }

        int[] dp = new int[s.length()];
        Stack stack = new Stack(s.length());

        dp[0] = 0;
        stack.push(0);
        char[] chars = s.toCharArray();

        for (int i = 1; i < chars.length; i++) {

            if (chars[i] == ')' && !stack.isEmpty() && chars[stack.peek()] == '(') {
                stack.pop();
                dp[i] = Math.max(dp[i - 1], i - (stack.isEmpty() ? -1 : stack.peek()));
            } else {
                stack.push(i);
                dp[i] = dp[i - 1];
            }
        }

        return dp[s.length() - 1];


    }

    public static class Stack {

        int top;

        int[] a;

        Stack(int n) {
            a = new int[n];
            top = -1;
        }

        public int pop() {
            return a[top--];
        }

        public int peek() {
            return a[top];
        }

        public void push(int c) {
            a[++top] = c;
        }

        public boolean isEmpty() {
            return top == -1;
        }
    }

    public int longestValidParentheses2(String s) {
        int[] dp = new int[s.length()];
        char[] sc = s.toCharArray();
        int res = 0;
        for(int i = 1; i<s.length(); ++i){
            if(sc[i]==')' && dp[i-1]!=i){
                if(sc[i-dp[i-1]-1]=='('){
                    dp[i] = 2+dp[i-1]+(i-dp[i-1]>1? dp[i-dp[i-1]-2]:0);
                    res = Math.max(res, dp[i]);
                }
            }
        }
        return res;
    }

}
