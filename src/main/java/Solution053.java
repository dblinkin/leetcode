/**
 * Created by zhang on 2017/6/26.
 */
public class Solution053 {

    public int maxSubArray(int[] nums) {

        return 0;

    }

    public int maxSubArray2(int[] nums) {

        int max = nums[0];
        int last = nums[0];
        for (int i = 1; i < nums.length; i++) {

            int s = last + nums[i];
            last = nums[i] > s ? nums[i] : s;
            max = last > max ? last : max;
        }

        return max;

    }
}
