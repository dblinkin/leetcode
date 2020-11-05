package offer;

import java.util.*;
import java.util.stream.Collectors;

public class Solution323 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();

        queue.add(root);
        int level = 1;
        while (!queue.isEmpty()) {
            if ((level & 1) == 1) {
                List<Integer> r = new ArrayList<>();
                for (int i = queue.size(); i > 0; i--) {
                    TreeNode node = queue.remove();
                    r.add(node.val);
                    if (node.left != null) {
                        queue.add(node.left);
                    }
                    if (node.right != null) {
                        queue.add(node.right);
                    }
                }
                result.add(r);
            } else {
                Stack<Integer> s = new Stack<>();
                for (int i = queue.size(); i > 0; i--) {
                    TreeNode node = queue.remove();
                    s.push(node.val);
                    if (node.left != null) {
                        queue.add(node.left);
                    }
                    if (node.right != null) {
                        queue.add(node.right);
                    }
                }
                List<Integer> r = new ArrayList<>(s.size());
                while (!s.isEmpty()) {
                    r.add(s.pop());
                }
                result.add(r);
            }
            level++;
        }
        return result;
    }

}
