package offer;

public class Solution26 {


    public boolean isSubStructure(TreeNode a, TreeNode b) {
        if (a == null || b == null) {
            return false;
        }

        return isSubTree(a, b) || isSubStructure(a.left, b) || isSubStructure(a.right, b);
    }


    private boolean isSubTree(TreeNode a, TreeNode b) {
        if (b == null) {
            return true;
        }

        if (a == null) {
            return false;
        }

        return a.val == b.val && isSubTree(a.left, b.left) && isSubTree(a.right, b.right);
    }


}
