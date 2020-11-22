package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution12Test {

    @Test
    public void exist() {

        Solution12 solution12 = new Solution12();
        char[][] board;

        board = new char[][]{
                {'a', 'b', 'c', 'e'},
                {'s', 'f', 'c', 's'},
                {'a', 'd', 'e', 'e'}
        };
        assertEquals(false, solution12.exist(board, "abfb"));
        assertEquals(true, solution12.exist(board, "abcced"));
        assertEquals(true, solution12.exist(board, "abce"));
        assertEquals(true, solution12.exist(board, "bfce"));

        board = new char[][]{
                {'a', 'b',},
                {'c', 'd',},
        };
        assertEquals(false, solution12.exist(board, "abcd"));
        assertEquals(true, solution12.exist(board, "acdb"));
    }
}