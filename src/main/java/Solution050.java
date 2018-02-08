/**
 * Created by zhang on 2017/6/22.
 */
public class Solution050 {

    public double myPow(double x, int n) {

        if (n == 0) {
            return 1;
        }

        boolean negative = n < 0;

        long p = Math.abs((long)n);
        double[] pow = new double[32];
        pow[0] = x;

        long temp = 1;
        int i = 0;
        while (temp < p) {
            pow[++i] = pow[i - 1] * pow[i - 1];
            temp <<= 1;
            if (temp < 0) {
                break;
            }
        }

        if (temp == p) {
            return negative ? 1 / pow[i] : pow[i];
        }

        double result = 1.0d;
        while (p > 0) {
            temp >>>= 1;
            i --;
            if (p - temp >= 0) {
                result *= pow[i];
                p -= temp;
            }
        }

        return negative ? 1 / result : result;
    }


}
