package offer;

public class Solution582 {

    public String reverseLeftWords(String s, int n) {

        if (s == null || s.length() == 0) {
            return "";
        }

        if (n >= s.length()) {
            return s;
        }

        char[] chars = s.toCharArray();
        reverse(chars, 0, n - 1);
        reverse(chars, n, chars.length - 1);

        reverse(chars, 0, chars.length - 1);
        return new String(chars);
    }


    private void reverse(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[end];
            chars[end] = chars[start];
            chars[start] = temp;

            start++;
            end--;
        }
    }
}
