package offer;

public class Solution29 {

    public int[] spiralOrder(int[][] matrix) {

        if (matrix.length == 0) {
            return new int[0];
        }

        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;

        int[] result = new int[matrix.length * matrix[0].length];
        int i = 0;
        while (left <= right && top <= bottom) {

            for (int j = left; j <= right; j++) {
                result[i++] = matrix[top][j];
            }

            for (int j = top + 1; j <= bottom; j++) {
                result[i++] = matrix[j][right];
            }

            if (left < right && top < bottom) {
                for (int j = right - 1; j >= left ; j--) {
                    result[i++] = matrix[bottom][j];
                }
                for (int j = bottom - 1 ; j > top ; j--) {
                    result[i++] = matrix[j][left];
                }
            }

            left++;
            right--;
            top++;
            bottom--;

        }
        return result;
    }
}
