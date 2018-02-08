/**
 * Created by zhang on 2017/6/25.
 */
public class Solution167 {

    public int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {

            int middle = left + ((right - left) >> 1);
            if (middle == 0) {
                break;
            }

            int v = numbers[middle] + numbers[0];
            if (v > target) {
                right = middle - 1;
            } else if (v < target) {
                left = middle + 1;
            } else {
                return new int[]{0 + 1, middle + 1};
            }
        }

        int start = 0;
        int end = right;

        while (start < end) {

            int v = numbers[start] + numbers[end];
            if (v == target) {
                return new int[]{start + 1, end + 1};
            } else if (v > target) {
                end -- ;
            } else if (v < target) {
                start ++;
            }
        }
        return new int[]{-1, -1};

    }

    public int[] twoSum2(int[] numbers, int target){
        int[] res = new int[2];
        int i = 0;
        int j = numbers.length - 1;
        int mid = 0;
        while (i < j) {
            mid = i + (j-i)/2;
            if (numbers[mid] > target) {
                j = mid;
            } else if (numbers[mid] < target) {
                i = mid + 1;
            } else {
                break;
            }
        }
        // System.out.println(j); // found the first element greater than target
        i = 0;
        while (i < j) {
            if (numbers[i] + numbers[j] < target) {
                i++;
            } else if (numbers[i] + numbers[j] > target) {
                j--;
            } else {
                res[0] = i+1;
                res[1] = j+1;
                break;
            }
        }
        return res;
    }


}
