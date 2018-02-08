/**
 * Created by zhang on 2017/6/22.
 */
public class Solution034 {

    public int[] searchRange(int[] nums, int target) {

        int[] ans = new int[]{-1, -1};
        int left = 0;
        int right = nums.length - 1;

        while (left  <= right) {
            int middle = left + ((right - left) >> 1);
            int v = nums[middle];
            if (v >= target) {
                right = middle - 1;
            } else if (v < target) {
                left = middle + 1;
            }
        }

        if (left > (nums.length -1) || nums[left] != target) {
            return ans;
        }

        ans[0] = left;

        left = 0;
        right = nums.length - 1;

        while (left <= right) {
            int middle = left + ((right - left) >> 1);
            int v = nums[middle];
            if (v > target) {
                right = middle - 1;
            } else if (v <= target) {
                left = middle + 1;
            }
        }

        if (nums[left - 1] == target) {
            ans[1] = left - 1;
        }

        return ans;

    }

    public int[] searchRange2(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;


        while (left  <= right) {

            if (target == nums[left] && target == nums[right]) {
                return new int[]{left, right};
            }

            int middle = left + ((right - left) >> 1);
            int v = nums[middle];
            if (v > target) {
                right = middle - 1;
            } else if (v < target) {
                left = middle + 1;
            } else {
                if (nums[right] != target) {
                    --right;
                } else if(nums[left] != target){
                    ++left;
                }
            }

        }
        return new int[]{-1, -1};
    }

}
