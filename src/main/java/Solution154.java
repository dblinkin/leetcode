/**
 * Created by zhang on 2017/6/25.
 */
public class Solution154 {

    public int findMin(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return nums[0];
        }


        int left = 0;
        int right = nums.length - 1;
        int pivot = nums[right];

        while (left <= right) {
            int middle = left + ((right - left) >> 1);
            int m = nums[middle];
            if (m > pivot) {
                left = middle + 1;
            } else if (m < pivot) {
                right = middle - 1;
                pivot = m;
            } else {
                right --;
                if (right > 0) {
                    pivot = nums[right];
                }
            }
        }

        return nums[left];

    }
}
