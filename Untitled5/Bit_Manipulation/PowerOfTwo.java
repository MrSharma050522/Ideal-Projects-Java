package Bit_Manipulation;

import java.util.Scanner;

public class PowerOfTwo {
    // To find if a number is a power of 2 or not
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if((n!= 0) && (n & (n - 1))==0){
            System.out.println("This number can be expressed in power of 2 ");
        } else {
            System.out.println("This number cannot be expressed in power of 2 ");
        }
    }
}
