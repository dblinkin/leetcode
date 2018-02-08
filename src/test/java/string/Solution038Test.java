package string;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhang on 2018/2/4.
 */
public class Solution038Test {

    Solution038 s = new Solution038();

    @Test
    public void testCountAndSay() throws Exception {

        assertEquals("1", s.countAndSay(0));
        assertEquals("1", s.countAndSay(1));
        assertEquals("11", s.countAndSay(2));
        assertEquals("21", s.countAndSay(3));
        assertEquals("1211", s.countAndSay(4));
        assertEquals("111221", s.countAndSay(5));
        assertEquals("312211", s.countAndSay(6));
        assertEquals("111312211312111322212321121113121112131112132112311321322112" +
                "11131221131211221321123113213221123113112221131112311332211211131" +
                "22113121113221112131221123113111231121123222112132113213221133112" +
                "13212312311211131122211213211331121321123123211231131122211211131" +
                "22113121113123112112322111213211322211312113211", s.countAndSay(20));
    }

}