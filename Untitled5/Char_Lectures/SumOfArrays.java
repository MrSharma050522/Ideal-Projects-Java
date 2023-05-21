package Char_Lectures;

import java.util.Scanner;

public class SumOfArrays {
    /*
    Given an array , calculate its sum
     {1, 2, 4 ,5]
     sum = 15
     [ 2, 8,4, 90], sum = 104

     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size  = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0 ; i < size ; i++){
            int num = sc.nextInt();
            arr[i] = num ;
        }

        int sum = getSumOfArray(arr);
        System.out.println(sum);

    }
    public static int getSumOfArray(int[] arr){
        // size-> arr.length
        int sum = 0;
        for (int i = 0 ; i < arr.length ; i++ ){
            sum = sum + arr[i];
        }
        return sum;
    }
}
