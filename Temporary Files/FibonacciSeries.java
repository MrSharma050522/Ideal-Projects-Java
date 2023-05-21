/*

shubham kucheria
just now
1. Find 30 elements of fibbonaci series using recursion.


 */

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(fibonacciSeries(i)+" ");
        }

    }
    public static int fibonacciSeries( int n){
        if(n == 0 || n == 1){
            return n ;
        }
        return fibonacciSeries(n-2) + fibonacciSeries(n-1);
    }
}
