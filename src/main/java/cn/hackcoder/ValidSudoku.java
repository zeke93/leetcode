package cn.hackcoder;

/**
 * Created by Thinsky on 16/3/16.
 */
public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        boolean[][] rowValid = new boolean[9][9];
        boolean[][] colValid = new boolean[9][9];
        boolean[][] subValid = new boolean[9][9];
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == '.') continue;
                int index = board[row][col] - '1';
                if (rowValid[row][index] || colValid[col][index] || subValid[(row / 3) * 3 + col / 3][index])
                    return false;
                rowValid[row][index] = colValid[col][index] = subValid[(row / 3) * 3 + col / 3][index] = true;

            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
