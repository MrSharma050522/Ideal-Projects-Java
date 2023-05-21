package Assignment_Solutions;/*
You are given a matrix Mat of m rows and n columns. The matrix is boolean so the elements of the matrix can
only be either 0 or 1. Now, if any row of the matrix contains a 1, then you need to fill that whole
row with 1. After doing the mentioned operation, you need to print the modified matrix.

2

5 4
1 0 0 0
0 0 0 0
0 1 0 0
0 0 0 0
0 0 0 1

1 1 1 1
0 0 0 0
1 1 1 1
0 0 0 0
1 1 1 1


1 2
0 0

Output:
1 1 1 1
0 0 0 0
1 1 1 1
0 0 0 0
1 1 1 1

0 0

Explanation:
Testcase1: rows = 5 and columns = 4
The given matrix is
1 0 0 0
0 0 0 0
0 1 0 0
0 0 0 0
0 0 0 1
Evidently, the first row contains a 1 so fill the whole row with 1. The third row also contains a 1 so that
row will be filled too. Finally, the last row contains a 1 and therefore it needs to be filled with 1 too.
The final matrix is
1 1 1 1
0 0 0 0
1 1 1 1
0 0 0 0
1 1 1 1
 */

import java.util.Scanner;
public class BooleanMatrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int testCases = s.nextInt();

        for (int z = 0; z < testCases; z++) {
            // input of row
            int row = s.nextInt();
            // input of col
            int col = s.nextInt();
            // input of matrix
            int[][] matrix = new int[row][col];
            for (int i = 0; i < row; i++) {
                int[] arr = new int[col];
                for (int j = 0; j < col; j++) {
                    int num = s.nextInt();
                    arr[j] = num;
                }
                matrix[i] = arr;
            }
            // calling of function
            int[][] modifiedMatrix = modifyMatrix(matrix);
            // print the matrix
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(modifiedMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public static int[][] modifyMatrix(int[][] matrix) {
        int row = matrix.length;
        int cols = matrix[0].length;
        int[][] modifiedMatrix = new int[row][cols];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 1) {
                    makeMatrixRowAsOne(modifiedMatrix, i, cols);
                }
            }
        }
        return modifiedMatrix;
    }

    public static void makeMatrixRowAsOne(int[][] modifiedMatrix, int currRow, int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }
        modifiedMatrix[currRow] = arr;
    }
}
