import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(fibonacci(n));
    }
    public static int fibonacci(int n ){ // n=6 , n=5
        if(n <= 1 ){
            return n;
        }
        return fibonacci(n-2) + fibonacci(n-1);
    }
}
