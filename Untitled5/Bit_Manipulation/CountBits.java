package Bit_Manipulation;

import java.util.Scanner;

public class CountBits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in );
        int n = s.nextInt();
        int count=0;
        while(n!=0){
            n = n&(n-1);
            count++;
        }
        System.out.println("Number of 1's in n is: "+count);
    }
}
