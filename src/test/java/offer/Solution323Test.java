package offer;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class Solution323Test {

    @Test
    public void levelOrder() {
        TreeNode root = TreeNode.build(new Integer[]{3, 9, 20, null, null, 15, 7});
        Solution323 solution323 = new Solution323();
        List<List<Integer>> r = solution323.levelOrder(root);

        assertArrayEquals(new int[]{3}, r.get(0).stream().mapToInt(Integer::valueOf).toArray());
        assertArrayEquals(new int[]{20, 9}, r.get(1).stream().mapToInt(Integer::valueOf).toArray());
        assertArrayEquals(new int[]{15, 7}, r.get(2).stream().mapToInt(Integer::valueOf).toArray());
    }
}