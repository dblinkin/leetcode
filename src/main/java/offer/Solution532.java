package offer;

public class Solution532 {

    public int missingNumber(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] <= mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

}
