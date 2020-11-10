package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution552Test {

    @Test
    public void isBalanced() {
        Solution552 solution552 = new Solution552();

        assertEquals(true, solution552.isBalanced(TreeNode.build(new Integer[]{})));
        assertEquals(true, solution552.isBalanced(TreeNode.build(new Integer[]{3})));
        assertEquals(true, solution552.isBalanced(TreeNode.build(new Integer[]{3, 9, 20})));
        assertEquals(false, solution552.isBalanced(TreeNode.build(new Integer[]{3, 9, null, 1, null, null, null, 2})));
        assertEquals(true, solution552.isBalanced(TreeNode.build(new Integer[]{3, 9, 20, null, null, 15, 7})));
        assertEquals(false, solution552.isBalanced(TreeNode.build(new Integer[]{1, 2, 2, 3, 3, null, null, 4, 4})));

    }
}