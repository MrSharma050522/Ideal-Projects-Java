package Bit_Manipulation;

import java.util.Scanner;

public class ToggleBit {
    // Here Toggle means changing : 0 -> 1   OR   1 -> 0
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int pos = s.nextInt();
        int bitMask = 1 << pos;
        int newNumber = bitMask ^ n;
        System.out.println(newNumber);
    }
}
