/**
 * Created by zhang on 2017/6/22.
 */
public class Solution066 {

    public int[] plusOne(int[] digits) {



        int last = digits[digits.length - 1] + 1;
        if (last < 10) {
            digits[digits.length - 1] = last;
            return digits;
        }

        digits[digits.length - 1] = 0;
        int carry = 1;
        for (int j = digits.length - 2; j >= 0 ; j--) {

            int temp = digits[j] + carry;

            if (temp < 10) {
                digits[j] = temp;
                carry = 0;
                break;
            } else {
                digits[j] = 0;
                carry = 1;
            }
        }

        if (carry == 0) {
            return digits;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        for (int i = 1; i <= digits.length; i++) {
            result[i] = 0;
        }

        return result;
    }


}
