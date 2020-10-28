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
        assertEquals(list.descElement(0), 0);
        assertEquals(list.descElement(1), 8);
        assertEquals(list.descElement(2), 7);
        assertEquals(list.descElement(3), 6);
        assertEquals(list.descElement(4), 5);
        assertEquals(list.descElement(5), 4);
        assertEquals(list.descElement(6), 3);
        assertEquals(list.descElement(7), 2);
        assertEquals(list.descElement(8), 1);
        assertEquals(list.descElement(9), 1);
    }

    @Test
    public void testReverse() throws Exception {

        LinkedList list = new LinkedList(1, 2, 3, 4);
        System.out.println(list.reverse().toString());

    }
}