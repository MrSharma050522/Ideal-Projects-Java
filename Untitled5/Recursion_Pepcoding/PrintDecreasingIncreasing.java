package Recursion_Pepcoding;

import java.util.Scanner;

public class PrintDecreasingIncreasing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        decreasingIncreasing(n);
    }
    public static void decreasingIncreasing(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        decreasingIncreasing(n-1);
        System.out.print(n+" ");
    }
}
