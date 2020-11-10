package offer;

public class Solution531 {

    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }

        return getRightIndex(nums, target) - getRightIndex(nums, target - 1);
    }

    private int getRightIndex(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }

}
