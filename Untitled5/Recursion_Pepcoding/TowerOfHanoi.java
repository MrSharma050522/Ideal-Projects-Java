package Recursion_Pepcoding;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String src = "A";
        String dest = "B";
        String helper = "C";
        printInstruction(n,src,dest,helper);

    }
    public static void printInstruction(int n , String S , String D ,String H){
        if(n == 0 ){
            return;
        }
//        if(n == 1){
//            System.out.println("Transfer disk "+n+" form "+S+" to "+D);
//            return;
//        }
        printInstruction(n-1,S,H,D);
        System.out.println("Transfer disk "+n+" form "+S+" to "+D);
        printInstruction(n-1,H,D,S);
    }
}