import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by zhang on 2017/6/19.
 */
public class Solution026Test {

    @Test
    public void testRemoveDuplicates() throws Exception {

        test(2, new int[]{1, 2}, new int[]{1, 1, 2});

        test(4, new int[]{1, 2, 3, 4}, new int[]{1, 1, 2, 2, 3, 4});

        test(3, new int[]{1, 2, 3}, new int[]{1, 1, 2, 2, 3, 3, 3});

        test(4, new int[]{1, 2, 3, 4}, new int[]{1, 1, 2, 3, 3, 4});
    }

    private void test(int newLen, int[] newArray, int[] array) {
        int len = new Solution026().removeDuplicates(array);
        assertEquals(newLen, len);
        assertArrayEquals(newArray, Arrays.copyOf(array, newLen));
    }


}