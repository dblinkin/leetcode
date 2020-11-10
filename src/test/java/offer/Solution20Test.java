package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution20Test {

    @Test
    public void isNumber() {
        Solution20 solution20 = new Solution20();

        assertEquals(false, solution20.isNumber("e9"));

        assertEquals(false, solution20.isNumber(""));
        assertEquals(false, solution20.isNumber("."));
        assertEquals(false, solution20.isNumber("e"));
        assertEquals(false, solution20.isNumber("+"));

        assertEquals(true, solution20.isNumber(".123"));
        assertEquals(true, solution20.isNumber("123."));
        assertEquals(true, solution20.isNumber("123.123"));


        assertEquals(true, solution20.isNumber("+100"));
        assertEquals(true, solution20.isNumber("5e2"));
        assertEquals(true, solution20.isNumber("-123"));
        assertEquals(true, solution20.isNumber("3.1416"));
        assertEquals(true, solution20.isNumber("-1E-16"));
        assertEquals(true, solution20.isNumber("0123"));
        assertEquals(false, solution20.isNumber("12e"));
        assertEquals(false, solution20.isNumber("1a3.14"));
        assertEquals(false, solution20.isNumber("1.2.3"));
        assertEquals(false, solution20.isNumber("+-5"));
        assertEquals(false, solution20.isNumber("12e+5.4"));


    }
}