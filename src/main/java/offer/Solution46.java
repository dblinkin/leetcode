package offer;

import java.util.Arrays;

public class Solution46 {

    public int translateNum(int num) {
        if (num < 0) {
            return -1;
        }

        if (num == 0) {
            return 1;
        }

        int[] nums = new int[20];
        int count = 0;
        while (num != 0) {
            nums[count++] = num % 10;
            num /= 10;
        }

        nums = Arrays.copyOf(nums, count);
        int[] dp = new int[nums.length + 1];
        dp[nums.length] = 1;
        dp[nums.length - 1] = 1;

        for (int i = nums.length - 2; i >= 0; i--) {
            int f2 = nums[i + 1] * 10 + nums[i];
            if (10 <= f2 && f2 <= 25) {
                dp[i] = dp[i + 1] + dp[i + 2];
            } else {
                dp[i] = dp[i + 1];
            }
        }
        return dp[0];
    }

}
