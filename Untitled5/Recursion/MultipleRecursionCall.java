package Recursion;

public class MultipleRecursionCall {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(findFibonacci(n));

    }
    public static int findFibonacci(int n ){
        // Here 0-based indexing is followed .
        if(n <= 1){
            return n ;
        }
        return findFibonacci(n-1) + findFibonacci(n-2);
    }
}
