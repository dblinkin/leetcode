/**
 * Created by zhang on 2017/6/27.
 */
public class Solution162 {

    public int findPeakElement(int[] nums) {

        if (nums.length <= 1) {
            return 0;
        }

        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int middle = left + ((right - left) >> 1);

            if ((middle > 0 && middle < nums.length - 1)
                    && nums[middle] > nums[middle - 1] && nums[middle] > nums[middle + 1]) {
                return middle;
            }

            if (nums[middle + 1] > nums[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        if (left == 0 && nums[left] > nums[left + 1]) {
            return left;
        } else if(right == nums.length - 1 && nums[right] > nums[right - 1]){
            return right;
        }

        if ((left > 0 && left < nums.length - 1)
                && nums[left] > nums[left - 1] && nums[left] > nums[left + 1]) {
            return left;
        }

        return -1;

    }


}
