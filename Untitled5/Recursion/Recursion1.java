package Recursion;



public class Recursion1 {
    public static void main(String[] args) {
       // Using iteration printing
//        int n = 5;
//        for(int i = n ;i>0;i--){
//            System.out.println(i);
//        }

//        int a = 0 ;
//        int b = 1;
//        System.out.println(a);
//        System.out.println(b);
//        int n = 7;
//        printFibonacci(a,b,n-2);


        int x =  2;
        int n = 5;
        int ans = calcPower(x, n);
        System.out.println(ans);





    }

    // Here function is used recursively
    // Print numbers from 1 to 5 ;
//    public static void printNumber(int n ){
//        if(n==6){
//            return ;
//        }
//        System.out.print(n+" ");
//        printNumber(n+1);
//    }

    // print the sum of first n natural numbers
//    public static void printSum(int i , int n , int sum  ){
//        if(i == n){
//            sum+=i;
//            System.out.println(sum);
//            return;
//        }
//        sum +=i;
//        printSum(i+1,n,sum);
//    }



    // print factorial of a number
//    public static int factorial(int n){
//        if(n==1||n==0){
//            return 1;
//        }
//        int fact_nm1 = factorial(n-1);
//        int fact_n = n * fact_nm1;
//        return fact_n;
//    }

    // print the fibonacci number

//    public static void  printFibonacci(int a , int b , int n ){
//        if(n==0){
//            return;
//        }
//        int c = a+b;
//        System.out.println(c);
//        printFibonacci(b,c,n-1);
//    }

    //print x^n (stack height = n )
//     public static int calcPowerFunction(int x ,int n ){
//        if(n==0){
//            return  1;
//        }
//        if(x==0){
//            return 0;
//        }
//        int xPowernm1 = calcPowerFunction(x,n-1);
//        int xPow = x * xPowernm1;
//        return xPow;
//     }


    //print x^n (stack height = logn )

    public static int calcPower(int x , int n ){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }// if n is even
        if(n%2==0){
            return calcPower(x,n/2) * calcPower(x,n/2);
        }
        // if n is odd
        else {
            return calcPower(x,n/2) * calcPower(x,n/2) * x;
        }
    }





}
