package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution28Test {

    @Test
    public void isSymmetric() {

        Solution28 solution28 = new Solution28();

        assertEquals(true, solution28.isSymmetric(TreeNode.build(new Integer[]{})));
        assertEquals(false, solution28.isSymmetric(TreeNode.build(new Integer[]{1, 2})));
        assertEquals(true, solution28.isSymmetric(TreeNode.build(new Integer[]{1, 2, 2})));
        assertEquals(true, solution28.isSymmetric(TreeNode.build(new Integer[]{1, 2, 2, 3, null, null, 3})));
        assertEquals(true, solution28.isSymmetric(TreeNode.build(new Integer[]{1, 2, 2, 3, 4, 4, 3})));
        assertEquals(false, solution28.isSymmetric(TreeNode.build(new Integer[]{1, 2, 2, null, 3, null, 3})));
    }
}