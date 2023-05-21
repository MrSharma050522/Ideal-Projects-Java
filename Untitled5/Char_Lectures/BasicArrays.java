package Char_Lectures;

import java.util.Scanner;

public class BasicArrays {


    public static void main(String[] runTimeArgumets) {
        Scanner sc = new Scanner(System.in);
        int[][] b = new int[2][3];

        for(int i =0;i< b.length;i++){
            for(int j=0 ; j <b[0].length;j++){
                System.out.println("PLease enter the value for index "+i+j);
                b[i][j] = sc.nextInt();
            }
        }

        for(int i =0;i< b.length;i++){
            for(int j=0 ; j <b[0].length;j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
