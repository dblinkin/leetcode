/**
 * Created by zhang on 2017/6/25.
 */
public class Solution081 {

    public boolean search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int middle = left + ((right - left) >> 1);

            int v = nums[middle];

            if (v == target) {
                return true;
            }

            if (v > nums[left]) {
                if (target >= nums[left] && target < v) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }

            } else if (v < nums[left]) {
                if (target > v && target <= nums[right]) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }

            } else {
                left += 1;
            }
        }
        return false;

    }


}
