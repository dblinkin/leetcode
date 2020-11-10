package offer;

import java.util.ArrayList;
import java.util.List;

public class Solution54 {

    public int kthLargest(TreeNode root, int k) {
        if (root == null || k == 0) {
            return -1;
        }

        List<Integer> result = new ArrayList<>();
        visit(root, result, k);

        if (k > result.size()) {
            return 0;
        }
        return result.get(k-1);
    }

    private void visit(TreeNode root, List<Integer> result, int k) {
        if (result.size() >= k) {
            return;
        }

        if (root.right != null) {
            visit(root.right, result, k);
        }
        result.add(root.val);
        if (root.left != null) {
            visit(root.left, result, k);
        }
    }

}
