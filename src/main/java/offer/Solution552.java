package offer;

public class Solution552 {

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        if (Math.abs(left - right) <= 1 && isBalanced(root.left) && isBalanced(root.right)) {
            return true;
        }
        return false;
    }

    private int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return Math.max(1 + maxDepth(root.left), 1 + maxDepth(root.right));
    }
}
