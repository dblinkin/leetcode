package offer;

public class Solution20 {

    // [Int][.unsignInt]e|E[Int]
    public boolean isNumber(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        int index = scanInteger(chars, 0);
        if (index == chars.length) {
            return true;
        }

        if (chars[index] != '.') {
            if (index == 0) {
                return false;
            }

            index = scanPowerInt(chars, index);
            if (index == chars.length) {
                return true;
            }
        } else {
            int start = index + 1;
            index = scanUnsignInteger(chars, start);
            if (start == index) {
                return false;
            }

            if (index == chars.length) {
                return true;
            }

            index = scanPowerInt(chars, index);
            if (index == chars.length) {
                return true;
            }
        }
        return false;
    }

    private int scanPowerInt(char[] chars, int start) {
        if (chars[start] != 'e' && chars[start] != 'E') {
            return start;
        }

        int index = scanInteger(chars, start + 1);
        if (index > start + 1) {
            return index;
        } else {
            return start;
        }
    }


    private int scanInteger(char[] chars, int start) {
        if (start >= chars.length) {
            return start;
        }

        if (chars[start] == '+' || chars[start] == '-') {
            int index = scanUnsignInteger(chars, start + 1);
            if (index > start + 1) {
                return index;
            } else {
                return start;
            }
        }

        return scanUnsignInteger(chars, start);
    }


    private int scanUnsignInteger(char[] chars, int start) {
        while (start < chars.length) {
            if ('0' <= chars[start] && chars[start] <= '9') {
                start++;
            } else {
                return start;
            }
        }
        return start;
    }

}
