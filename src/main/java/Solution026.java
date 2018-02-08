/**
 * Created by zhang on 2017/6/19.
 */
public class Solution026 {

    public int removeDuplicates(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return 1;
        }

        int aheadOffset = 0;
        int cur = nums[0];
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == cur) {
                aheadOffset++;
            } else {
                cur = nums[i];
                nums[i - aheadOffset] = nums[i];
            }
        }
        return nums.length - aheadOffset;
    }
}
