package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution36Test {

    @Test
    public void testTreeToDoublyList() throws Exception {

        Solution36 solution36 = new Solution36();
        Node root = Node.build(new Integer[]{4, 2, 5, 1, 3});

        solution36.treeToDoublyList(root);

        System.out.println();


    }

}