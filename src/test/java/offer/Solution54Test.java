package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution54Test {

    @Test
    public void kthLargest() {
        Solution54 solution54 = new Solution54();

        assertEquals(3, solution54.kthLargest(TreeNode.build(new Integer[]{3}), 1));
        assertEquals(4, solution54.kthLargest(TreeNode.build(new Integer[]{3, 1, 4, null, 2}), 1));
        assertEquals(1, solution54.kthLargest(TreeNode.build(new Integer[]{3, 1, 4, null, 2}), 4));
        assertEquals(0, solution54.kthLargest(TreeNode.build(new Integer[]{3, 1, 4, null, 2}), 5));
        assertEquals(4, solution54.kthLargest(TreeNode.build(new Integer[]{5, 3, 6, 2, 4, null, null, 1}), 3));


    }
}