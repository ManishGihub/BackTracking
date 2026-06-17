import java.util.Arrays;

// Write a program to solve a Sudoku puzzle by filling the empty cells.

// A sudoku solution must satisfy all of the following rules:

// 1.Each of the digits 1-9 must occur exactly once in each row.
// 2.Each of the digits 1-9 must occur exactly once in each column.
// 3.Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.
// The '.' character indicates empty cells.

public class Sudoku {

    public static boolean isSafe(char[][] board, int row, int col, int number) {

        for (int i = 0; i < 9; i++) {
            if (board[i][col] == (char) (number + '0')) {
                return false;
            }

            if (board[row][i] == (char) (number + '0')) {
                return false;
            }
        }

        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == (char) (number + '0')) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean helper(char[][] board, int row, int col) {

        if (row == 9) {
            return true;
        }

        int nrow, ncol;

        if (col != 8) {
            nrow = row;
            ncol = col + 1;
        } else {
            nrow = row + 1;
            ncol = 0;
        }

        if (board[row][col] != '.') {
            return helper(board, nrow, ncol);
        }

        for (int i = 1; i <= 9; i++) {
            if (isSafe(board, row, col, i)) {

                board[row][col] = (char) (i + '0');

                if (helper(board, nrow, ncol)) {
                    return true;
                }

                board[row][col] = '.';
            }
        }

        return false;
    }

    public static void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }

    public static void printBoard(char[][] board) {
        System.out.print("[");
        for (int i = 0; i < 9; i++) {
            System.out.print(Arrays.toString(board[i]));
            if (i < 8) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {

        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        solveSudoku(board);

        printBoard(board);
    }
}

// Output
// [[5, 3, 4, 6, 7, 8, 9, 1, 2],
//  [6, 7, 2, 1, 9, 5, 3, 4, 8],
//  [1, 9, 8, 3, 4, 2, 5, 6, 7],
//  [8, 5, 9, 7, 6, 1, 4, 2, 3],
//  [4, 2, 6, 8, 5, 3, 7, 9, 1],
//  [7, 1, 3, 9, 2, 4, 8, 5, 6],
//  [9, 6, 1, 5, 3, 7, 2, 8, 4],
//  [2, 8, 7, 4, 1, 9, 6, 3, 5],
//  [3, 4, 5, 2, 8, 6, 1, 7, 9]]
