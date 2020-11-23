package offer;

public class Solution581 {

    public String reverseWords(String s) {

        if (s == null || s.length() == 0) {
            return "";
        }

        char[] chars = s.replaceAll("\\s+", " ").toCharArray();
        reverse(chars, 0, chars.length - 1);

        int start = 0;
        int end = start;

        while (start < chars.length) {
            while (end < chars.length && chars[end] != ' ') {
                end++;
            }

            if (start < end - 1) {
                reverse(chars, start, end - 1);
            }

            while (end < chars.length && chars[end] == ' ') {
                end++;
            }
            start = end;
        }
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
