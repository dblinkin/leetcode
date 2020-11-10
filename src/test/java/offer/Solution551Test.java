package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution551Test {

    @Test
    public void maxDepth() {

        Solution551 solution551 = new Solution551();
        TreeNode root;

        root = TreeNode.build(new Integer[]{});
        assertEquals(0, solution551.maxDepth(root));

        root = TreeNode.build(new Integer[]{3});
        assertEquals(1, solution551.maxDepth(root));

        root = TreeNode.build(new Integer[]{3, 9});
        assertEquals(2, solution551.maxDepth(root));

        root = TreeNode.build(new Integer[]{3, 9, 20, null, null, 15, 7});
        assertEquals(3, solution551.maxDepth(root));

    }
}