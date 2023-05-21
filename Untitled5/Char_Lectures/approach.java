package Char_Lectures;

import java.util.Scanner;


public class approach {
    public static int sum(int a , int b ){
        int c = a + b;
        return  c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();

        int res = sum(x, y);
        int m = fun(input1,input2);

        System.out.println(res);
        System.out.println(m);
    }

    public static int fun(int input1 ,int  input2){
       // int res = input1 + input2;
        return input1 * input2;

    }
}