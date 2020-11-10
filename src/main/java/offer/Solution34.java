package offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class Solution34 {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {

        if (root == null) {
            return Collections.emptyList();
        }

        List<List<Integer>> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        findPath(root.val, sum, stack, result);
        stack.pop();
        return result;
    }

    private void findPath(int curSum, int targetSum, Stack<TreeNode> stack, List<List<Integer>> result) {
        TreeNode node = stack.peek();
        if (node.left == null && node.right == null) {
            if (curSum == targetSum) {
                result.add(stack.stream().map(n -> n.val).collect(Collectors.toList()));
            }
            return;
        }

        if (node.left != null) {
            stack.push(node.left);
            findPath(curSum + node.left.val, targetSum, stack, result);
            stack.pop();
        }

        if (node.right != null) {
            stack.push(node.right);
            findPath(curSum + node.right.val, targetSum, stack, result);
            stack.pop();
        }
    }


}
