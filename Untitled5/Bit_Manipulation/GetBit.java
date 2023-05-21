package Bit_Manipulation;

import java.util.Scanner;

public class GetBit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int position = s.nextInt();
        int bitMast = 1 << position;
        if((bitMast&number)==0){
            System.out.println("Bit at position "+position+" is : ZERO ");
        }else {
            System.out.println("Bit at position "+position+" is : ONE ");
        }
    }
}
