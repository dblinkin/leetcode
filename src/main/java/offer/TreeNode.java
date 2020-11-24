package offer;

import java.util.*;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    public Integer[] toArray() {
        return toArray(this);
    }

    @Override
    public String toString() {
        return java.util.Arrays.toString(toArray(this));
    }

    public static TreeNode build(Integer[] values) {
        return build0(values, 0);
    }

    private static TreeNode build0(Integer[] values, int index) {
        if (index >= values.length) {
            return null;
        }

        if (values[index] == null) {
            return null;
        }

        TreeNode root = new TreeNode(values[index]);
        root.left = build0(values, 2 * index + 1);
        root.right = build0(values, 2 * index + 2);
        return root;
    }

    private static Integer[] toArray(TreeNode root) {
        if (root == null) {
            return new Integer[0];
        }

        Queue<Node> queue = new LinkedList<>();
        List<Node> nodes = new ArrayList<>();

        queue.add(new Node(root, 0));
        while (!queue.isEmpty()) {
            Node node = queue.remove();
            nodes.add(node);
            if (node.treeNode.left != null) {
                queue.add(new Node(node.treeNode.left, 2 * node.index + 1));
            }
            if (node.treeNode.right != null) {
                queue.add(new Node(node.treeNode.right, 2 * node.index + 2));
            }
        }

        if (nodes.isEmpty()) {
            return new Integer[0];
        }

        Node last = nodes.get(nodes.size() - 1);
        Integer[] result = new Integer[last.index + 1];
        for (Node node : nodes) {
            result[node.index] = node.treeNode.val;
        }
        return result;
    }

    private static class Node {

        private TreeNode treeNode;

        private int index;

        public Node(TreeNode node, int index) {
            this.treeNode = node;
            this.index = index;
        }
    }

    private static void toArray(TreeNode node, int height) {

    }

}
