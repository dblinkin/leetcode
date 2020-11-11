package offer;

public class Solution36 {

    public Node treeToDoublyList(Node root) {

        if (root == null) {
            return null;
        }

        Nodes nodes = treeToDoublyList0(root);

        Node head = nodes.head;
        return null;

    }

    private Nodes treeToDoublyList0(Node root) {
        if (root == null) {
            return Nodes.EMPTY;
        }

        Nodes nodesLeft = treeToDoublyList0(root.left);
        if (nodesLeft.tail != null) {
            nodesLeft.tail.right = root;
            root.left = nodesLeft.tail;
        }

        Nodes nodesRight = treeToDoublyList0(root.right);
        if (nodesRight.head != null) {
            root.right = nodesRight.head;
            nodesRight.head.left = root;
        }

        Node head = nodesLeft.head == null ? root : nodesLeft.head;
        Node tail = nodesLeft.tail == null ? root : nodesLeft.tail;
        return new Nodes(head, tail);
    }

    private void convert(Node root, Nodes nodes) {

        if (root == null) {
            nodes.head = null;
            nodes.tail = null;
            return;
        }

        Nodes leftNodes = new Nodes();
        convert(root.left, );


    }


    private static class Nodes {
        Node head;
        Node tail;

        private static final Nodes EMPTY = new Nodes(null, null);

        public Nodes() {
        }

        public Nodes(Node head, Node tail) {
            this.head = head;
            this.tail = tail;
        }
    }
}
