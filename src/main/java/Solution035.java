/**
 * Created by zhang on 2017/6/21.
 */
public class Solution035 {

    public int searchInsert(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {

            int middle = left + ((right - left) >> 1);

            if (nums[middle] > target) {
                right = middle - 1;
            } else if (nums[middle] < target) {
                left = middle + 1;
            } else {
                return middle;
            }
        }

        return left;
    }

}
