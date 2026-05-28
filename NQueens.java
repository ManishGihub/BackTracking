//Write a java program to print all the solutions to place n queens on nXn chessboard such that all the queens are safe

import java.util.ArrayList;
import java.util.List;

public class NQueens{
    public boolean isSafe(int row,int col,char[][] board){
        //horizontal
        for(int j=0;j<board.length;j++){
            if(board[row][j] == 'Q'){
                return false;
            }
        }
        //vertical
        for(int i=0;i<board.length;i++){
            if(board[j][row] == 'Q'){
                return false;
            }
        }

    }

    public void helper(char[][] board, List<List<String>> allBoards,int col){
        if(col == board.length){
            saveBoard(board, allBoards);
            return;
        }

        for(int row = 0;row<board.length; row++){
            if(isSafe(row,col,board)){
                board[row][col] = 'Q';
                helper(board, allBoards, col+1);
                board[row][col] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n){
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new board[n][n]; 

        helper(board, allBoards, 0);
    }
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
