import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhang on 2017/6/22.
 */
public class Solution278Test {
    @Test
    public void testFirstBadVersion() throws Exception {
        Solution278 s = new Solution278();

        s.badVersion = 3;
        assertEquals(3, s.firstBadVersion(10));
        assertEquals(3, s.firstBadVersion(100));
        assertEquals(3, s.firstBadVersion(1000));

        s.badVersion = 10;
        assertEquals(10, s.firstBadVersion(100));
    }

}