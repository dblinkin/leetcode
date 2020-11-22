package offer;

public class Arrays {

    public static void quickSort(int[] nums) {
        quickSort0(nums, 0, nums.length - 1);
    }

    private static void quickSort0(int[] nums, int start, int end) {

        if (nums == null || nums.length == 0) {
            return;
        }


        int mid = partition0(nums, start, end);
        quickSort0(nums, start, mid - 1);
        quickSort0(nums, mid + 1, end);
    }

    private static int partition0(int[] nums, int start, int end) {
        int pivot = nums[end];
        int left = start;
        int right = end - 1;
        while (left <= right) {
            while (left <= right && nums[left] < pivot) {
                left++;
            }

            while (left <= right && nums[right] >= pivot) {
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


    private static int partition(int[] nums, int start, int end) {
        int pivot = nums[start];
        int left = start + 1;
        int right = end;
        while (left <= right) {

            while (left <= right && nums[left] <= pivot) {
                left++;
            }

            while (left <= right && nums[right] > pivot) {
                right--;
            }

            if (left < right) {
                swap(nums, left, right);
            }
        }

        swap(nums, start, right);
        return right;
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void swap(char[] a, int i, int j) {
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
