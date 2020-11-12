package offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Node {
    int val;
    offer.Node left;
    offer.Node right;

    Node(int x) {
        val = x;
    }

    public Integer[] toArray() {
        return toArray(this);
    }

    @Override
    public String toString() {
//        return Arrays.toString(toArray(this));
        return String.valueOf(val);
    }

    public static offer.Node build(Integer[] values) {
        return build0(values, 0);
    }

    private static offer.Node build0(Integer[] values, int index) {
        if (index >= values.length) {
            return null;
        }

        if (values[index] == null) {
            return null;
        }

        offer.Node root = new offer.Node(values[index]);
        root.left = build0(values, 2 * index + 1);
        root.right = build0(values, 2 * index + 2);
        return root;
    }

    private static Integer[] toArray(offer.Node root) {
        if (root == null) {
            return new Integer[0];
        }

        Queue<Node0> queue = new LinkedList<>();
        List<Node0> nodes = new ArrayList<>();

        queue.add(new Node0(root, 0));
        while (!queue.isEmpty()) {
            Node0 node = queue.remove();
            nodes.add(node);
            if (node.treeNode.left != null) {
                queue.add(new Node0(node.treeNode.left, 2 * node.index + 1));
            }
            if (node.treeNode.right != null) {
                queue.add(new Node0(node.treeNode.right, 2 * node.index + 2));
            }
        }

        if (nodes.isEmpty()) {
            return new Integer[0];
        }

        Node0 last = nodes.get(nodes.size() - 1);
        Integer[] result = new Integer[last.index + 1];
        for (Node0 node : nodes) {
            result[node.index] = node.treeNode.val;
        }
        return result;
    }

    private static class Node0 {

        private offer.Node treeNode;

        private int index;

        public Node0(offer.Node node, int index) {
            this.treeNode = node;
            this.index = index;
        }
    }

    private static void toArray(offer.Node node, int height) {

    }

}
