package binarysearch;

/**
 * Created by zhang on 2018/2/4.
 */
public class Solution004 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        return 0d;
    }

    private int findMedian(int[] a, int aStart, int aEnd, int[] b, int bStart, int bEnd) {

        int aMiddle = aStart + (aEnd - aStart) / 2;
        int bMiddle = bStart + (bEnd - bStart) / 2;

        if (a[aMiddle] > b[bMiddle]) {
            findMedian(a, aStart, aMiddle, b, bMiddle, bEnd);
        } else {
            findMedian(a, aMiddle, aEnd, b, bStart, bEnd);
        }
        return 0;
    }

    private double getMedian(int[] a, int aStart, int aEnd, int[] b, int bStart, int bEnd) {

        int[] less;
        return 0d;


    }

}
