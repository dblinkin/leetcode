package offer;

public class Solution39 {

    public int majorityElement(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }

        partition0(nums, 0, nums.length - 1);
        return nums[nums.length / 2];
    }

    private void partition0(int[] nums, int start, int end) {
        int key = nums[start];
        int left = start;
        int right = end;
        while (left < right) {

            while (left < right && nums[right] >= key) {
                right--;
            }

            nums[left] = nums[right];

            while (left < right && nums[left] <= key) {
                left++;
            }

            nums[right] = nums[left];
        }
        nums[left] = key;
    }

    private void partition(int[] nums, int start, int end) {
        int pivot = nums[start];
        int left = start+1;
        int right = end;
        while (left < right) {
            while (left < right && nums[right] >= pivot) {
                right--;
            }

            while (left < right && nums[left] <= pivot) {
                left++;
            }

            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
        }

        int temp = nums[right];
        nums[right] = nums[start];
        nums[start] = temp;
    }



}