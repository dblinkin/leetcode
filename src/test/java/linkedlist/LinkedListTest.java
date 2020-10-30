package linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void testAdd() throws Exception {
    }

    @Test
    public void testDescElement() throws Exception {
        LinkedList list = new LinkedList(1, 2, 3, 4, 5, 6, 7, 8);
        assertEquals(list.descKthElement(0), 0);
        assertEquals(list.descKthElement(1), 8);
        assertEquals(list.descKthElement(2), 7);
        assertEquals(list.descKthElement(3), 6);
        assertEquals(list.descKthElement(4), 5);
        assertEquals(list.descKthElement(5), 4);
        assertEquals(list.descKthElement(6), 3);
        assertEquals(list.descKthElement(7), 2);
        assertEquals(list.descKthElement(8), 1);
        assertEquals(list.descKthElement(9), 1);
    }

    @Test
    public void testReverse() throws Exception {

        LinkedList list = new LinkedList(1, 2, 3, 4);
        System.out.println(list.reverse().toString());

    }

    @Test
    public void testRemoveDescKthElement() throws Exception {
        LinkedList list = new LinkedList(1, 2, 3, 4, 5, 6, 7, 8);
        list.removeDescKthElement(2);
        System.out.println(list.toString());

    }

    @Test
    public void testMergeSort() throws Exception {
        LinkedList l1 = new LinkedList(1, 3,20);
        LinkedList l2 = new LinkedList(2, 4, 5,7,8);
        System.out.println(l1.mergeSort(l2));
    }
}