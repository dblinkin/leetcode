package offer;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class Solution322Test {

    @Test
    public void levelOrder() {

        TreeNode root = TreeNode.build(new Integer[]{3, 9, 20, null, null, 15, 7});
        Solution322 solution322 = new Solution322();
        List<List<Integer>> r = solution322.levelOrder(root);

        assertArrayEquals(new int[]{3}, r.get(0).stream().mapToInt(Integer::valueOf).toArray());
        assertArrayEquals(new int[]{9, 20}, r.get(1).stream().mapToInt(Integer::valueOf).toArray());
        assertArrayEquals(new int[]{15, 7}, r.get(2).stream().mapToInt(Integer::valueOf).toArray());
    }
}