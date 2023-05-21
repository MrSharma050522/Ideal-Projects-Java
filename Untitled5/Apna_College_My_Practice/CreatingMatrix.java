package Apna_College_My_Practice;

import java.util.Scanner;

public class CreatingMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int cols = sc.nextInt();
        // Initialisation of a matrix
        int[][] matrix = new int[row][cols];
        for (int i = 0 ; i < row ; i++){
            for (int j = 0 ; j < cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        // Print a matrix
        for (int i = 0 ; i < row ; i++){
            for (int j = 0 ; j < cols ; j++){
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
        // Sum of the matrix
        int sum = 0 ;
        for (int i = 0 ; i < row; i++){
            for (int j = 0 ; j < cols; j++){
                sum += matrix[i][j];
            }
        }
        System.out.print(sum);
    }




}
