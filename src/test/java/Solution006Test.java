import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhang on 2018/2/4.
 */
public class Solution006Test {

    Solution006 s = new Solution006();

    @Test
    public void testConvert() throws Exception {
        assertEquals("", s.convert("", 1));
        assertEquals("A", s.convert("A", 1));
        assertEquals("aaabbb", s.convert("ababab", 2));
        assertEquals("PAHNAPLSIIGYIR", s.convert("PAYPALISHIRING", 3));
        assertEquals("PINALSIGYAHRPI", s.convert("PAYPALISHIRING", 4));
        assertEquals("PHASIYIRPLIGAN", s.convert("PAYPALISHIRING", 5));
    }

}