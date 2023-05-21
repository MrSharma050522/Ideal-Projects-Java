package Practice_Java;

import java.util.Scanner;

public class DiagonalElementOfMatrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[][] numbers = new int[n][n];
        // input
        // rows
        for (int i =0 ;i<n;i++){
            // colums
            for (int j= 0 ;j<n;j++){
                numbers[i][j] = s.nextInt();
            }
        }
        int sum = 0 ;
        int sum1 = 0 ;
        for(int i = 0 ;i<n;i++){
            for(int j = 0;j<n;j++){
                if(i==j){
                   sum += numbers[i][j];
                }
                if((i+j)==(n-1)){
                    sum1+=numbers[i][j];
                }
            }
        }
        System.out.println(sum+sum1);
    }
}
