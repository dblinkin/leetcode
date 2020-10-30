package offer;

import org.junit.Test;

public class Solution07Test {

    @Test
    public void testBuildTree() throws Exception {
        Solution07 solution07 = new Solution07();
       /* Solution07.TreeNode root = solution07.buildTree(new int[]{3, 9, 20, 15, 7},
                new int[]{9, 3, 15, 20, 7});
        System.out.println(root);*/

        Solution07.TreeNode root1 = solution07.buildTree(new int[]{1,2, 3},
                new int[]{3, 2,1});
        System.out.println(root1);
    }
}