package offer;

import java.util.Arrays;

public class Solution07 {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) {
            return null;
        }

        return build(preorder, 0, preorder.length - 1,
                inorder, 0, inorder.length - 1);
    }


    public TreeNode build(int[] preOrder, int preStart, int preEnd,
                          int[] inOrder, int inStart, int inEnd) {
        if (preStart == preEnd) {
            return new TreeNode(preOrder[preStart]);
        }

        TreeNode rootNode = new TreeNode(preOrder[preStart]);
        int rootIndex = -1;
        for (int i = inStart; i <= inEnd; i++) {
            if (inOrder[i] == rootNode.val) {
                rootIndex = i;
            }
        }

        int leftSize = rootIndex - inStart;
        if (leftSize > 0) {
            rootNode.left = build(preOrder, preStart +1, preStart + leftSize,
                    inOrder, inStart, rootIndex - 1);
        }

        int rightSize = inEnd - rootIndex;
        if (rightSize > 0) {
            rootNode.right = build(preOrder, preStart + leftSize + 1, preStart + leftSize + rightSize,
                    inOrder, rootIndex + 1, inEnd);
        }

        return rootNode;
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
