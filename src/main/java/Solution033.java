/**
 * Created by zhang on 2017/6/23.
 */
public class Solution033 {

    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int middle = left + ((right - left) >> 1);
            int v = nums[middle];

            if (v >= nums[left]) {

                if (v < target) {
                    left = middle + 1;
                } else if (v > target) {
                    if (target >= nums[left]) {
                        right = middle - 1;
                    } else {
                        left = middle + 1;
                    }
                } else {
                    return middle;
                }
            } else {

                if (v < target) {
                    if (target <= nums[right]) {
                        left = middle + 1;
                    } else {
                        right = middle - 1;
                    }
                } else if (v > target) {
                    right = middle - 1;
                } else {
                    return middle;
                }
            }
        }

        return -1;
    }


}
