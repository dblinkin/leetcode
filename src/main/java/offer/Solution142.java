package offer;

public class Solution142 {

    public int cuttingRope(int n) {
        if (n < 2) {
            return -1;
        }

        if (n < 4) {
            return n - 1;
        }

        long result;

        int power3 = n / 3;
        int remainder = n % 3;
        int p = 1000000007;
        if (remainder == 0) {
            result = power(3, power3, p);
        } else if (remainder == 1) {
            result = 4 * power(3, power3 - 1, p);
        } else {
            result = 2 * power(3, power3, p);
        }

        return (int) (result % p);
    }

    private long power(int n, int p, int mod) {
        if (p == 0) {
            return 1;
        }

        if (p == 1) {
            return n;
        }

        long half = power(n, p / 2, mod);
        if ((p & 1) == 0) {
            return (half * half) % mod;
        }else {
            return (n * half * half) % mod;
        }
    }



}
