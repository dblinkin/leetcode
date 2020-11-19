package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArraysTest {

    @Test
    public void testQuickSort() throws Exception {

        int[] a;

        a = new int[]{4, 6};
        Arrays.quickSort(a);
        System.out.println(a);



    }
}