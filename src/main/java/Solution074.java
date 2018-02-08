/**
 * Created by zhang on 2017/6/23.
 */
public class Solution074 {

    public boolean searchMatrix(int[][] matrix, int target) {

        if (matrix.length == 0) {
            return false;
        }

        int columns = matrix.length;
        int rows = matrix[0].length;

        int left = 0;
        int right = columns * rows - 1;

        while (left <= right) {

            int middle = left + ((right - left) >> 1);
            int v = matrix[middle / rows][middle % rows];
            if (v > target) {
                right = middle - 1;
            } else if (v < target) {
                left = middle + 1;
            } else {
                return true;
            }
        }
        return false;

    }

}
