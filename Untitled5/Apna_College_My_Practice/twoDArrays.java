package Apna_College_My_Practice;

import java.util.Scanner;

public class twoDArrays {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int rows = s.nextInt();
//        int cols = s.nextInt();
//        int[][] numbers = new int[rows][cols];
//        // input
//        // rows
//        for (int i =0 ;i<rows;i++){
//            // colums
//            for (int j= 0 ;j<cols;j++){
//                numbers[i][j] = s.nextInt();
//            }
//        }
//        // output
//        for (int i =0 ;i<rows;i++){
//            for (int j= 0 ;j<cols;j++){
//                System.out.print(numbers[i][j]+" ");
//            }
//            System.out.println();
//        }
        /*
        Take a matrix as input from the user . Search for a given number x and
        print the indices at which it occurs .
         */
//        Scanner s = new Scanner(System.in);
//        int rows = s.nextInt();
//        int cols = s.nextInt();
//        int[][] numbers = new int[rows][cols];
//        // input
//        // rows
//        for (int i =0 ;i<rows;i++){
//            // colums
//            for (int j= 0 ;j<cols;j++){
//                numbers[i][j] = s.nextInt();
//            }
//        }
//        int x = s.nextInt();
//        for(int i = 0 ;i<rows;i++){
//            for (int j = 0 ;j<cols;j++){
//                // compare with x
//                if(numbers[i][j]==x){
//                    System.out.println("x found at location (" +i+ "," +j+ ")");
//                }
//            }
//        }
        /*
        1.For a given matrix of N x M, print its transpose.
         */
//        Scanner s = new Scanner(System.in);
//        int N = s.nextInt();
//        int M = s.nextInt();
//        int[][] matrix = new int[N][M];
//        for (int i =0 ;i<N;i++){
//            for(int j =0 ;j<M;j++){
//                matrix[i][j] = s.nextInt();
//            }
//        }
//        System.out.println("The transpose is :");
//        for (int j =0 ;j<M;j++){
//            for(int i =0 ;i<N;i++){
//                System.out.print(matrix[i][j]+" ");
//
//            }
//            System.out.println();
//        }
        /*
        2.Print the spiral order matrix as output for a given matrix of numbers.
         */
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        int cols = s.nextInt();
        int[][] spiralMatrix = new int[rows][cols];
        for(int i =0 ;i<rows;i++){
            for (int j =0;j<cols;j++){
                spiralMatrix[i][j] = s.nextInt();
            }
        }
        System.out.println("The spiral order matrix is:");
        int rowStart = 0;
        int rowEnd = rows-1;
        int colStart = 0;
        int colEnd = cols-1;
        // To print the spiral order
        while(rowStart <= rowEnd && colStart <= colEnd){
            // 1
            for (int col = colStart;col<=colEnd;col++){
                System.out.print(spiralMatrix[rowStart][col]+" ");
            }
            rowStart++;
            //2
            for(int row=rowStart;row<=rowEnd;row++){
                System.out.print(spiralMatrix[row][colEnd]+" ");
            }
            colEnd--;
            //3
            for (int col = colEnd;col>=colStart;col-- ){
                System.out.print(spiralMatrix[rowEnd][col]+" ");
            }
            rowEnd--;
            //4
            for (int row = rowEnd;row>=rowStart;row--){
                System.out.print(spiralMatrix[row][colStart]+" ");
            }
            colStart++;
            System.out.println();
        }




    }
}
