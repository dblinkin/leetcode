package offer;

import java.util.Arrays;

public class Solution11 {

    public int minArray(int[] numbers) {
        if (numbers.length == 0) {
            return -1;
        }

        if (numbers.length == 1) {
            return numbers[0];
        }

        int left = 0;
        int right = numbers.length - 1;

        while (left + 1 < right) {
            int mid = left + ((right - left) >> 1);

            if (numbers[mid] > numbers[right]) {
                left = mid;
            } else if (numbers[mid] < numbers[right]) {
                right = mid;
            } else {
                right--;
            }
        }

        return Math.min(numbers[left], numbers[right]);
    }

}
