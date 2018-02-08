import static org.junit.Assert.*;

/**
 * Created by zhang on 2017/6/19.
 */
public class Solution021Test {

    @org.junit.Test
    public void testMergeTwoLists() throws Exception {

        Solution021.ListNode n1 = newNode(1), head1 = n1;
        for (int i = 3; i < 10; i += 2) {
            Solution021.ListNode n = appendNode(n1, i);
            n1 = n;
        }
        print(head1);

        Solution021.ListNode n2 = newNode(2), head2 = n2;
        for (int i = 4; i <= 10; i += 2) {
            Solution021.ListNode n = appendNode(n2, i);
            n2 = n;
        }
        print(head2);

        Solution021.ListNode result = new Solution021().mergeTwoLists(head1, head2);
        print(result);

        for (int i = 1; i < 10; i++) {
            assertEquals(i, result.val);
            result = result.next;
        }
    }

    Solution021.ListNode appendNode(Solution021.ListNode node, int v) {
        Solution021.ListNode n = new Solution021.ListNode(v);
        node.next = n;
        return n;
    }

    Solution021.ListNode newNode(int v) {
        return new Solution021.ListNode(v);
    }

    void print(Solution021.ListNode n) {
        StringBuilder res = new StringBuilder();
        while (n != null) {
            res.append(n.val).append(',');
            n = n.next;

        }
        System.out.println(res);
    }

}