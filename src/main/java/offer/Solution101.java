package offer;

public class Solution101 {

    public int fib(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        int one = 0, two = 1;
        int result = 0;
        for (int i = 2; i <= n; i++){
            result = one + two;
            one = two;
            two = result;
        }
        return Math.abs(result) % 1000000007;
    }

}
