package offer;

public class Solution12 {

    public boolean exist(char[][] board, String word) {

        if (board == null || board.length == 0 || word == null || word.length() == 0) {
            return false;
        }

        boolean[][] visit = new boolean[board.length][board[0].length];

        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[0].length; column++) {
                boolean find = isExist(board, row, column, word.toCharArray(), 0, visit);
                if (find) {
                    return true;
                }
            }
        }

        return false;
    }


    private boolean isExist(char[][] board, int row, int column, char[] word, int i, boolean[][] visit) {
        if (row < 0 || row > board.length - 1 || column < 0 || column > board[0].length - 1) {
            return false;
        }

        if (visit[row][column]) {
            return false;
        }

        if (word[i] == board[row][column]) {
            if (i == word.length - 1) {
                return true;
            } else {
                visit[row][column] = true;
                boolean find = isExist(board, row, column - 1, word, i + 1, visit) ||
                        isExist(board, row, column + 1, word, i + 1, visit) ||
                        isExist(board, row - 1, column, word, i + 1, visit) ||
                        isExist(board, row + 1, column, word, i + 1, visit);
                if (!find) {
                    visit[row][column] = false;
                }
                return find;
            }
        }
        return false;
    }
}
