package Practice_Java;

import java.util.*;

public class PracticeOnBasicArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        for (int i = 0 ; i < matrix.length; i++){
            for ( int j = 0 ; j < matrix[0].length; j++){
                System.out.println("Please Enter the value of index "+i+j);
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0 ; i < matrix.length; i++){
            for ( int j = 0 ; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
