package offer;

public class Solution33 {

    public boolean verifyPostorder(int[] postorder) {

        if (postorder.length == 0) {
            return true;
        }

        return verify0(postorder, 0, postorder.length - 1);
    }

    private boolean verify0(int[] postorder, int start,  int end) {
        if (start >= end) {
            return true;
        }

        int root = postorder[end];
        int separator = end;
        for (int i = start; i < end ; i++) {
            if (postorder[i] == root) {
                return false;
            }

            if (postorder[i] > root) {
                separator = i;
                break;
            }
        }

        int temp = separator;
        while (temp < end) {
            if (postorder[temp++] <= root) {
                return false;
            }
        }

        return verify0(postorder, start, separator - 1) && verify0(postorder, separator, end - 1);
    }
}
