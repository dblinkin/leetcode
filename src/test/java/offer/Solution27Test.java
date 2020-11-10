package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution27Test {

    @Test
    public void mirrorTree() {

        Solution27 solution27 = new Solution27();
        TreeNode a;

        a = TreeNode.build(new Integer[]{4, 2, 7, 1, 3, 6, 9});
        assertArrayEquals(new Integer[]{4, 7, 2, 9, 6, 3, 1}, solution27.mirrorTree(a).toArray());

        a = TreeNode.build(new Integer[]{4, 2, 7, 1});
        assertArrayEquals(new Integer[]{4, 7, 2, null, null, null, 1}, solution27.mirrorTree(a).toArray());

    }
}