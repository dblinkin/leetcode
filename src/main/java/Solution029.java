/**
 * Created by zhang on 2017/6/19.
 */
public class Solution029 {

    public int divide(int dividend, int divisor) {

        if (divisor == 0 || (dividend == Integer.MIN_VALUE && divisor == -1)) {
            return Integer.MAX_VALUE;
        }

        boolean positive = ((dividend ^ divisor) & 0x80000000) != 0;

        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);

        int result = 0;

        long tempDivisor = absDivisor;
        while (absDividend >= tempDivisor) {
            int tempResult = 1;

            while (absDividend > tempDivisor) {
                tempDivisor <<= 1;
                tempResult <<= 1;
            }

            if (tempDivisor > absDividend) {
                tempDivisor >>= 1;
                tempResult >>>= 1;
            }

            absDividend -= tempDivisor;
            tempDivisor = absDivisor;
            result += tempResult;
        }

        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }

        return positive ? -result : result;
    }

}
