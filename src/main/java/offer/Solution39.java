package offer;

public class Solution39 {

    public int majorityElement(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }

        int start = 0;
        int end = nums.length - 1;
        int index = partition(nums, start, end);
        int target = nums.length / 2;
        while (index != target) {
            if (index > target) {
                end = index;
            } else if (index < target) {
                start = index;
            } else {
                return nums[index];
            }
            index = partition(nums, start, end);
        }
        return -1;
    }

    private int partition(int[] nums, int start, int end) {
        int pivot = nums[end];
        int left = start;
        int right = end - 1;
        while (left <= right) {
            while (left < right && nums[left] <= pivot) {
                left++;
            }

            while (left < right && nums[right] > pivot) {
                right--;
            }

            if (left < right) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
            }
        }

        int temp = nums[end];
        nums[end] = nums[left];
        nums[left] = temp;
        return left;
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

}