package offer;

public class Solution102 {

    public int numWays(int n) {
        if (n == 0) {
            return 0;
        }

        if (n <= 2) {
            return n;
        }

        int one = 1, two = 2;
        int result = 0;
        for (int i = 3; i <= n; i++){
            result = one + two;
            if (result > 1000000007) {
                result -= 1000000007;
            }
            one = two;
            two = result;
        }
        return result;
    }

}
