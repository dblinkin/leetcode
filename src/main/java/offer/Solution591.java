package offer;

public class Solution591 {
    
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        if (k <= 0 || k > nums.length) {
            return new int[0];
        }

        int[] max = new int[nums.length - k + 1];

        int m = Integer.MIN_VALUE;

        for (int i = 0; i < 100; i++) {
        }
        return null;

    }
}
