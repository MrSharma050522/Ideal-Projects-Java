import java.util.Scanner;

public class FibonacciSeriesSpecialOne {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = 1;
        int b = 1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        printFibonacciSeries(a,b,n);

    }
    public static void printFibonacciSeries(int a , int b , int n ){
        if(b >= n ){
            return;
        }
        int c = a + b;
        if(c <= n){
            System.out.print(c+" ");
        }
        printFibonacciSeries(b,c,n);
    }
}
