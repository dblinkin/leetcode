package offer;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class Solution34Test {

    @Test
    public void pathSum() {

        Solution34 solution34 = new Solution34();
        List<List<Integer>> result;
        TreeNode root;

        root = TreeNode.build(new Integer[]{});
        result = solution34.pathSum(root, 5);
        assertEquals(true, result.isEmpty());

        root = TreeNode.build(new Integer[]{5});
        result = solution34.pathSum(root, 5);
        assertArrayEquals(new Integer[]{5}, result.get(0).toArray());

        root = TreeNode.build(new Integer[]{5});
        result = solution34.pathSum(root, 6);
        assertEquals(true, result.isEmpty());

        root = TreeNode.build(new Integer[]{5, 4, 8, 11});
        result = solution34.pathSum(root, 20);
        assertArrayEquals(new Integer[]{5, 4, 11}, result.get(0).toArray());

        root = TreeNode.build(new Integer[]{5, 4, 8, 11});
        result = solution34.pathSum(root, 21);
        assertEquals(true, result.isEmpty());

        root = TreeNode.build(new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, null, 5, 1});
        result = solution34.pathSum(root, 22);
        assertArrayEquals(new Integer[]{5, 4, 11, 2}, result.get(0).toArray());
        assertArrayEquals(new Integer[]{5, 8, 4, 5}, result.get(1).toArray());



    }
}