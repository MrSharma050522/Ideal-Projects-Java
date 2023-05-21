package Recursion_Pepcoding;

import java.util.Scanner;

public class PowerInLogTC {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        System.out.println(calculate(x,n));
    }
    public static int calculate(int x , int n ){
        if(n == 0){
            return 1;
        }
        int pow = calculate(x,n/2);
        int res = pow * pow;
        if(n % 2 == 1){
            res = res * x ;
        }
        return res;
    }
}
