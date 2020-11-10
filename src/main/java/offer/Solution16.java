package offer;

public class Solution16 {

    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }

        if (isZero(x) && n < 0) {
            return 0.0d;
        }

        if (n > 0) {
            return positivePow(x, n);
        } else {
            return 1.0d / positivePow(x, -n);
        }
    }

    private boolean isZero(double x) {
        return -0.00000001 < x && x < 0.00000001;
    }

    // n > 0
    private double positivePow(double x, int n) {

        if (n == 0) {
            return 1;
        }

        if (n == 1 || n == -1) {
            return x;
        }

        if ((n & 1) == 0) {
            double result = positivePow(x, n >> 1);
            return result * result;
        } else {
            double result = positivePow(x, (n - 1) >> 1);
            return x * result * result;
        }
    }

}
