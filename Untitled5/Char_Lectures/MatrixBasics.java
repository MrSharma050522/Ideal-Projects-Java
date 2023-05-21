package Char_Lectures;/*
Example :

arr : 1 2 3 4
sec element : arr[1]


1 2 3 4
5 6 7 8
9 10 11 12
matrix also follows 0 based indexing
Access the elements :
1st row sec col : DiagonalElementOfMatrix[0][1]
2nd row 3rd col : DiagonalElementOfMatrix[1][2]



fir row : 1 2 3 4 -> 0th row
sec row : 5 6 7 8 -> 1st row
sec col : 2 6 10 -> 0th col

matrix is a combination of arrays .
matrix : collection of rows and columns

int[] arr = new int[size]
int[][] matrix = new int[row][col]

 */


import java.util.Scanner;

public class MatrixBasics {
    public static void main(String[] args) {
        /*
        1.Take matrix as an input
        2.How to access matrix element
         */
        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        int col = s.nextInt();
        int [][] matrix = new int[row][col];
        /*
        1 2 3 4
        5 6 7 8
        9 10 11 12
         */
       for (int i = 0 ; i < row ; i++){
           int [] arr = new int[col];
           for (int j = 0 ; j < col ; j++){
               int num = s.nextInt();
               arr[j] = num ;
           }
           matrix[i] = arr;

       }
       int [][] transpose = transpose(matrix);
       print(transpose);

    }
    /*
    matrix =
    1 2 3
    4 5 6
    7 8 9
    row = matrix.length = 3
    col = matrix[0].length = 3
     */

    public static void print(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;

        for ( int i = 0 ; i < rows ;i++){
            for ( int j = 0 ; j < cols ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


    }
    /*
    Given a square  matrix , do its transpose [ rows == columns ]
    1 2 3 4             DiagonalElementOfMatrix[1][3]=8
    5 6 7  8            DiagonalElementOfMatrix[2][0]=9
    9 10 11 12          DiagonalElementOfMatrix[3][2]=15    i , j
    13 14 15 16
    transpose of this matrix is :

    1 5 9 13             DiagonalElementOfMatrix[3][1]=8
    2 6 10 14            DiagonalElementOfMatrix[0][2]=9
    3 7 11 15          DiagonalElementOfMatrix[2][3]=15  j , i rows and columns are reversed
    4 8 12 16
    Do this for non - square matrix as well .



     */
    public static int[][] transpose(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;

        int[][] transposeMatrix = new int[row][col];
        for (int i = 0 ; i < row ; i++){
            for ( int j = 0 ; j < col; j++){
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        return transposeMatrix;

    }

}
