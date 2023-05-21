package Bit_Manipulation;

import java.util.Scanner;

public class SetBit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int position = s.nextInt();
        int bitMask = 1 << position;
        int number = bitMask | n;
        System.out.println(number);
    }
}
