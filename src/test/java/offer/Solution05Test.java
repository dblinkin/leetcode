package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution05Test {

    @Test
    public void replaceSpace() {
        Solution05 solution05 = new Solution05();
        assertEquals("We%20are%20happy.", solution05.replaceSpace("We are happy."));
        assertEquals("", solution05.replaceSpace(""));
        assertEquals("%20", solution05.replaceSpace(" "));
        assertEquals("We%_are_happy.", solution05.replaceSpace("We%_are_happy."));
    }
}