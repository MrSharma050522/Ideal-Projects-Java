package Recursion_Pepcoding;

import java.util.Scanner;

public class NQueens {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] chess = new int[n][n];
        placingNQueens(chess,"",0);
    }
    public static void placingNQueens(int[][] chess,String str , int i ){
        if(i == chess.length){
            System.out.println(str+".");
            return;
        }

        for(int j = 0 ;j < chess.length;j++){
            if(isItASafePlaceForQueen(chess, i, j)) {
                chess[i][j] = 1;
                placingNQueens(chess, str + i + "-" + j + ",", i + 1);
                chess[i][j] = 0;
            }
        }
    }
    public static boolean isItASafePlaceForQueen(int[][] chess , int row , int col ){
        for(int i = row-1, j = col; i>=0;i--){
            if (chess[i][j] == 1) {
                return false;
            }
        }
        for(int i = row-1, j = col-1; i >= 0 && j >= 0;i--,j--){
            if (chess[i][j] == 1) {
                return false;
            }
        }
        for(int i = row-1, j = col+1; i >= 0 && j < chess.length;i--,j++){
            if (chess[i][j] == 1) {
                return false;
            }
        }
        return true;

    }
}
