package offer;

public class Solution36 {

    public Node treeToDoublyList(Node root) {
        if (root == null) {
            return null;
        }

        Nodes nodes = new Nodes();
        convert(root, nodes);
        Node head = nodes.head;
        Node tail = nodes.tail;
        head.left = tail;
        tail.right = head;
        return head;
    }

    private void convert(Node root, Nodes nodes) {

        if (root == null) {
            nodes.head = null;
            nodes.tail = null;
            return;
        }

        Nodes leftNodes = new Nodes();
        convert(root.left, leftNodes);
        Nodes rightNodes = new Nodes();
        convert(root.right, rightNodes);

        root.left = null;
        root.right = null;

        if (leftNodes.head == null) {
            nodes.head = root;
        } else {
            nodes.head = leftNodes.head;
        }

        if (leftNodes.tail != null) {
            root.left = leftNodes.tail;
            leftNodes.tail.right = root;
        }

        if (rightNodes.tail == null) {
            nodes.tail = root;
        } else {
            nodes.tail = rightNodes.tail;
        }

        if (rightNodes.head != null) {
            root.right = rightNodes.head;
            rightNodes.head.left = root;
        }

    }

    private static class Nodes {
        Node head;
        Node tail;

        public Nodes() {
        }

        public Nodes(Node head, Node tail) {
            this.head = head;
            this.tail = tail;
        }
    }
}
