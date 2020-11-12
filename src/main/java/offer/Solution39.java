package offer;

public class Solution39 {

    public int majorityElement(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }

        partition(nums, 0, nums.length - 1);
        return nums[nums.length / 2];
    }

    private void partition(int[] nums, int start, int end) {
        int pivot = nums[start];
        int left = start + 1;
        int right = end;
        while (left < right) {

            while (left < right && nums[left] <= pivot) {
                left++;
            }
            while (left < right && nums[right] >= pivot) {
                right--;
            }

            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
        }

        nums[left] = pivot;
    }
}