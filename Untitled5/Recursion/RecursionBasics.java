package Recursion;/*
Agenda :
1. What is recursion ?
2. Working internally ?
3. Solve some problem .

Recursion1 : function calling itself
 */


import java.util.Scanner;

public class RecursionBasics {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println(fibonacci(num));

    }
    /*
    Given a number , find its factorial
    5! = 5 * 4 * 3 * 2 * 1 = 120
    3! = 3 * 2 * 1 = 6

    7! = 7 * 6 * 5 * 4 * 3 * 2 * 1 => 7 *6!
    6! = 6 * 5 * 4 * 3 * 2 * 1 => 6 * 5!
    5! = 5 * 4 * 3 * 2 * 1 => 5 * 4!
    4! = 4 * 3 * 2 * 1 = > 4 * 3!
    3! = 3 * 2 * 1 => 3 * 2!
    2! = 2 * 1 => 2 * 1!
    1! = 1 = 1

    n! = n * (n-1)!
    factorial(n) = n * factorial(n-1)
    Question : factorial(n)
    Recursion1 :
    1. Base case:
       Smallest problem which we can solve (factorial(1) == 1)
    2. Ask recursion to do something for you : factorial(n-1)
    3. Do you work : n * factorial(n-1)



     */
   public static int factorial(int num){
        int product  =  1 ; // initially product = 1
        for (int i = 1 ; i <= num; i++){
            // i = 1
            product = product * i;
            // product = 1 * 1 = 1


        }
        return product ;
   }

    /*
    num = 5


    factorialRec(5)
    smallAns = factorialRec(4)
    smallAns = 24
    ans = 5 * 24 = 120
    return ans = 120


    factorialRec(4)
    smallAns = factorialRec(3)
    smallAns = 6
    ans = 4 * 6 = 24
    return ans = 24


    factorialRec(3)
    smallAns = factorialRec(2)
    smallAns = 2
    ans = 3 * 2 = 6
    return ans = 6


    factorialRec(2)
    smallAns = factorialRec(1)
    smallAns = 1
    ans = 2 * 1
    return ans = 2

    factorialRec(1)
    return 1

     */
   public static int factorialRec(int num){
        // 1. Base case
        if (num == 1){
            return 1;
        }
        // 2. Ask recursion to do something for us
        int smallAns = factorialRec( num -1 );

        // 3. We need to do something
        int ans = num * smallAns;
        return ans ;
    }


    /*
    Given a number find nth fibonacci number.
    0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144..........

    Base case :
    n == 1, ans = 0
    n == 2 , ans = 1

    Recursion1 :
    1. fib(n - 1)
    1. fib(n - 2)

    My work :
    fib(n -1 ) + fib (n - 2 )

    0, 1, 1, 2, ?(sum of last two numbers)
    nth number = (n-1) fib number + (n-2) fib number
    fib(n) = fib(n-1) + fib(n-2)
     */
    public static int fibonacci(int num ){
        // Base case
        if (num == 1){
            return 0;
        }
        if(num == 2){
            return 1 ;
        }
        // Ask recursion to do something
        int fir = fibonacci(num-1);
        int sec = fibonacci(num-2);
        // My work
        return fir + sec;
    }

}
