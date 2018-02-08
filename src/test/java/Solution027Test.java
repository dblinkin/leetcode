import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by zhang on 2017/6/19.
 */
public class Solution027Test {

    @Test
    public void testRemoveElement() throws Exception {

        test(2, new int[]{2, 2}, new int[]{3, 2, 2, 3}, 3);

        test(1, new int[]{4}, new int[]{3, 3 , 4, 3, 3}, 3);

        test(0, new int[]{}, new int[]{3, 3, 3, 3}, 3);

        test(2, new int[]{2, 2}, new int[]{2, 2, 3, 3, 3, 3}, 3);

    }

    private void test(int newLen, int[] newArray, int[] array, int rmElement) {
        int len = new Solution027().removeElement(array, rmElement);
        assertEquals(newLen, len);
        assertArrayEquals(newArray, Arrays.copyOf(array, newLen));
    }

}