package offer;

public class Solution20 {

    private int index = 0;

    // [Int][.unsignInt]e|E[Int]
    public boolean isNumber(String s) {
        index = 0;

        if (s == null || s.length() == 0) {
            return false;
        }

        s = s.trim() + "#"; // 加入结束符合
        char[] chars = s.toCharArray();
        boolean isNumber = scanInteger(chars);

        if (chars[index] == '.') {
            index++;
            boolean hasDecimalPart = scanUnsignInteger(chars);

            // 有三种情况都是正确的
            // 123.  123.0
            // .123  0.123
            // 123.4
            isNumber = (isNumber || hasDecimalPart);
        }

        if (chars[index] == 'e' || chars[index] == 'E') {
            index++;
            boolean hasPower = scanInteger(chars);
            isNumber = isNumber && hasPower;
        }

        return isNumber && chars[index] == '#';
    }

    private boolean scanInteger(char[] chars) {
        if (index >= chars.length) {
            return false;
        }

        if (chars[index] == '+' || chars[index] == '-') {
            index++;
            return scanUnsignInteger(chars);
        }

        return scanUnsignInteger(chars);
    }


    private boolean scanUnsignInteger(char[] chars) {
        int start = index;
        while (index < chars.length) {
            if ('0' <= chars[index] && chars[index] <= '9') {
                index++;
            } else {
                break;
            }
        }
        if (index > start) {
            return true;
        }

        return false;
    }

}
