package Bit_Manipulation;

import java.util.Scanner;

public class UpdateBit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int operation = s.nextInt(); // operation = 1: set operation = 0:clear bit
        int n = s.nextInt(); // 0101 -> 0111 -> dec 7
        int pos = s.nextInt();

        int bitMask = 1<<pos;
        if(operation == 1){
            int number = bitMask | n;
            System.out.println(number);
        } else {
            int notBitMask = ~bitMask;
            int number = notBitMask & n ;
            System.out.println(number);
        }
    }
}
