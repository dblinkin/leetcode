package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution321Test {

    @Test
    public void levelOrder() {
        Solution321 solution321 = new Solution321();
        TreeNode root = TreeNode.build(new Integer[]{3, 9, 20, null, null, 15, 7});
        assertArrayEquals(new int[]{3, 9, 20, 15, 7}, solution321.levelOrder(root));

        root = TreeNode.build(new Integer[]{3, null, 20});
        assertArrayEquals(new int[]{3, 20}, solution321.levelOrder(root));

    }
}