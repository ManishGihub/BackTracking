
// Q)Write a java program to print all the solutions to place n queens on nXn chessboard such that all the queens are safe

import java.util.ArrayList;
import java.util.List;

public class NQueens{

    public static boolean isSafe(int row,int col,char[][] board){
        //horizontal
        for(int i=0;i<board.length;i++){
            if(board[row][i] == 'Q'){
                return false;
            }
        }
        //Vertical
        for(int i=0;i<board[0].length;i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //upper left
        int r = row;
        for(int c=col;c>=0 && r>=0;c--,r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        //upper right
        r = row;
        for(int c=col;c<board.length && r>=0;c++,r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        //Lower Left
        r = row;
        for(int c = col;c>=0 && r<board.length;c--,r++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        //Lower right
        r = row;
        for(int c=col;c<board.length && r<board.length;c++,r++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        return true;
    }

    public static void saveBoard(char[][] board,List<List<String>> allBoards){
        String row = "";
        List<String> newBoard = new ArrayList<>();

        for(int i=0;i<board.length;i++){
            row = "";
            for(int j=0;j<board[0].length;j++){
                if(board[i][j] == 'Q'){
                    row+='Q';
                }else{
                    row+='.';
                }
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }

    public static void helper(char[][] board,List<List<String>> allBoards,int col){
        if(col == board.length){
            saveBoard(board,allBoards);
            return;
        }
        for(int row=0;row<board.length;row++){
            if(isSafe(row,col,board)){
                board[row][col] = 'Q';
                helper(board, allBoards, col+1);
                board[row][col] = '.';
            }
        }
    }

    public static List<List<String>> solveNqueens(int n){
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board,allBoards,0);
        
        return allBoards;
    }
    public static void main(String[] args) {
        System.out.println(solveNqueens(4));
    }
}

// [[..Q., Q..., ...Q, .Q..], [.Q.., ...Q, Q..., ..Q.]]
