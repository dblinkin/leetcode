/**
 * Created by zhang on 2017/6/19.
 */
public class Solution027 {

    public int removeElement(int[] nums, int val) {

        int aheadOffset = 0;
        for (int i = 0; i < nums.length; i++) {
            if (val == nums[i]) {
                aheadOffset++;
            } else {
                nums[i - aheadOffset] = nums[i];
            }
        }

        return nums.length - aheadOffset;

    }


}
