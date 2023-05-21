package Recursion_Pepcoding;

import java.util.Scanner;
// Print knight paths if it can cover all cell without repeating the cell
public class KnightsTour {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int r = s.nextInt();
        int c = s.nextInt();
        int[][] chess = new int[n][n];
        printKnightTourPaths(chess,r,c,1);


    }
    public static void printKnightTourPaths(int[][] chess , int r, int c, int move){
        if( r < 0 || c < 0 || r >= chess.length || c >= chess.length || chess[r][c] != 0 ){
            return;
        } else if (move == chess.length * chess.length){
            chess[r][c] = move;
            displayPath(chess);
            chess[r][c] = 0;
            return;
        }

        chess[r][c] = move;
        printKnightTourPaths(chess,r-2,c+1,move+1);
        printKnightTourPaths(chess,r-1,c+2,move+1);
        printKnightTourPaths(chess,r+1,c+2,move+1);
        printKnightTourPaths(chess,r+2,c+1,move+1);
        printKnightTourPaths(chess,r+2,c-1,move+1);
        printKnightTourPaths(chess,r+1,c-2,move+1);
        printKnightTourPaths(chess,r-1,c-2,move+1);
        printKnightTourPaths(chess,r-2,c-1,move+1);
        chess[r][c] = 0;
    }
    public static void displayPath(int[][] chess ){
        for(int i=0;i< chess.length;i++){
            for(int j =0;j< chess.length;j++){
                System.out.print(chess[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("________________________________________");
    }
}
/*
Input :
1. 5 0 0
2. 5 0 4
3. 5 1 1
4. 5 2 4
5. 5 4 2
6. 5 2 0
 */
