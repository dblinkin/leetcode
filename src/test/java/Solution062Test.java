import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhang on 2017/6/27.
 */
public class Solution062Test {

    @Test
    public void testUniquePaths() throws Exception {

        assertEquals(1, new Solution062().uniquePaths(2, 1));

        assertEquals(1, new Solution062().uniquePaths(1, 2));

        assertEquals(2, new Solution062().uniquePaths(2, 2));

        assertEquals(6, new Solution062().uniquePaths(3, 3));

        assertEquals(28, new Solution062().uniquePaths(3, 7));

        assertEquals(1886677760, new Solution062().uniquePaths(1000, 1000));
    }

}