package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution26Test {

    @Test
    public void isSubStructure() {

        Solution26 solution26 = new Solution26();
        TreeNode a, b;

        a = TreeNode.build(new Integer[]{3, 4, 5, 1, 2});
        b = TreeNode.build(new Integer[]{4, 1});
        assertEquals(true, solution26.isSubStructure(a, b));

        a = TreeNode.build(new Integer[]{1, 2, 3});
        b = TreeNode.build(new Integer[]{3, 1});
        assertEquals(false, solution26.isSubStructure(a, b));

        a = TreeNode.build(new Integer[]{3, 4, 5, 1, 2});
        b = TreeNode.build(new Integer[]{4, 1, 2});
        assertEquals(true, solution26.isSubStructure(a, b));

        a = TreeNode.build(new Integer[]{3, 4, 5, 1, 2});
        b = TreeNode.build(new Integer[]{3, null, 5});
        assertEquals(true, solution26.isSubStructure(a, b));

        a = TreeNode.build(new Integer[]{3, 4, 5, 1, 2});
        b = TreeNode.build(new Integer[]{3, null, 5, null, null, 6});
        assertEquals(false, solution26.isSubStructure(a, b));

    }
}