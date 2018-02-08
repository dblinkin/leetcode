/**
 * Created by zhang on 2017/6/22.
 */
public class Solution069 {

    public int mySqrt(int x) {

        int left = 0;
        int right = x;

        while (left <= right) {
            int middle = left + ((right - left) >> 1);

            long m2 = (long)middle * (long) middle;
            if (m2 < 0 || m2 > x) { // <0 表溢出
                right = middle - 1;
            }else if (m2 < x) {
                left = middle + 1;
            } else {
                return middle;
            }
        }

        if (left > 0) {
            left--;
        }

        return left;
    }


}
