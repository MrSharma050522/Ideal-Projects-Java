package Bit_Manipulation;

import java.util.Scanner;

public class ClearBit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int pos = s.nextInt();
        int bitMask = 1<<pos;
        int notBitMask = ~(bitMask);
        int number = notBitMask & n ;
        System.out.println(number);
    }
}
