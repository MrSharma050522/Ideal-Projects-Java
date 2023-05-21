package Bit_Manipulation;

import java.util.Scanner;

public class BinaryToDecimalConversion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
//        decimalToBinary(n);
        binaryToDecimal(n);

//        String binaryString =s.next();
//        int decimal = Integer.parseInt(binaryString,2);
//        System.out.println(decimal);
    }
    public static void decimalToBinary(int n){
        int[] binaryNumber = new int[32];
        int i = 0;
        while (n>0){
            binaryNumber[i] = n%2;
            n=n/2;
            i++;
        }
        for(int j = i-1;j>=0;j--){
            System.out.print(binaryNumber[j]);
        }

    }
    public static void binaryToDecimal(int binary ){
        int decimal = 0 ;
        int n = 0;
        while (true){
            if(binary==0){
                break;
            } else {
                int temp = binary%10;
                decimal += temp*Math.pow(2,n);
                binary = binary/10;
                n++;
            }
        }
        System.out.println(decimal);
    }
}
