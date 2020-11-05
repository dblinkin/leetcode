package offer;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    public static TreeNode build(Integer[] values) {
        return build0(values, 0);
    }

    private static TreeNode build0(Integer[] values, int index) {
        if (index > values.length) {
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

}
