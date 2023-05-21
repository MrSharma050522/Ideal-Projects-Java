package Recursion_Pepcoding;

import java.util.Scanner;

public class Print_Decreasing_Increasing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        increasing(n);
        System.out.println();
        decreasing(n);
    }
    public static void decreasing(int n ){
        if (n == 0 ){
            return;
        }
        System.out.print(n+" ");
        decreasing(n-1);
    }
    public static void increasing(int n ){
        if (n == 0 ){
            return;
        }
        increasing(n-1);
        System.out.print(n+" ");
    }

}
