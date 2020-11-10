package offer;

public class Solution05 {

    public String replaceSpace(String s) {

        char[] cs = s.toCharArray();

        int wsCount = 0;
        for (int i = 0; i < cs.length; i++) {
            if (cs[i] == ' ') {
                wsCount++;
            }
        }

        char[] after = new char[cs.length + 2 * wsCount];
        int j = after.length;
        for (int i = cs.length - 1; i >= 0 ; i--) {
            if (cs[i] == ' ') {
                after[--j] = '0';
                after[--j] = '2';
                after[--j] = '%';
            } else {
                after[--j] = cs[i];
            }
        }

        return new String(after);
    }

}
