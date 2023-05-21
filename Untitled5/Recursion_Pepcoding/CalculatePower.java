package Recursion_Pepcoding;

import java.util.Scanner;

public class CalculatePower {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        System.out.println(power(x,n));
        System.out.println((int)Math.pow(x,n));
    }
    public static int power(int x , int n ){
        if(n == 1){
            return x;
        }
        /*OR*/
//        if(n == 0){
//            return 1;
//        }
        return  x * power(x,n-1);
    }
}
