package backtracking;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by zhang on 2017/7/3.
 */
public class Solution051Test {

    @Test
    public void testSolveNQueens() throws Exception {
        assertEquals(0, new Solution051().solveNQueens(0).size());
        assertEquals(1, new Solution051().solveNQueens(1).size());
        assertEquals(0, new Solution051().solveNQueens(2).size());
        assertEquals(0, new Solution051().solveNQueens(3).size());
        assertEquals(2, new Solution051().solveNQueens(4).size());
        assertEquals(10, new Solution051().solveNQueens(5).size());
        assertEquals(4, new Solution051().solveNQueens(6).size());
        assertEquals(365596, new Solution051().solveNQueens(14).size());
    }

}