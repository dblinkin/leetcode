/**
 * Created by zhang on 2018/2/4.
 */
public class Solution006 {

    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        int step = numRows + (numRows - 2);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= (step / 2); i++) {
            for (int j = i; j < s.length(); j += step) {
                result.append(s.charAt(j));

                int index = (step - i) + (j - i);
                if (i != 0 && i != (step / 2) && index < s.length()) {
                    result.append(s.charAt(index));
                }
            }
        }
        return result.toString();
    }


}
