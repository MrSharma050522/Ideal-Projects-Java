package Apna_College_My_Practice;

import java.util.Scanner;

public class CallingAMethod {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        int a = 7 ;
//        int b = 5 ;
//        int c = sumOfNumbers(a,b);
//        // Method invocation using object creation
//        // We can use this syntax when static is removed from the method
//        //   and define c as given below :
//        //        CallingAMethod obj = new CallingAMethod();
//        //        c = obj.sumOfNumbers(a,b);
//        int a1 = 4 ;
//        int b1 = 7;
//        int c1 = sumOfNumbers(a1,b1);
//        // We can use this syntax when static is removed from the method
//        //   and define c1 as given below :
//        // c1 = obj.sumOfNumbers(a1,b1);
//
//        System.out.println(c);
//        System.out.println(c1);
//
//    }
//    static int sumOfNumbers(int x , int y ){
//        int z ;
//        if (x > y ){
//            z = (x + y) * 2 ;
//        } else {
//            z = x * y ;
//        }
//        return z;
//

//       String name = s.nextLine();
//        printMyName(name);
//    }
//    public static void printMyName(String name){
//        System.out.println(name);
//        return;

//        int a = s.nextInt();
//        int b = s.nextInt();
//        int sum = calculateTheSum(a,b);
//        System.out.println("Sum of two given number is :" + sum);
//    }
//    public static int calculateTheSum(int a , int b ){
//        int sum = a + b ;
//        return sum ;
//    }

//        int a = s.nextInt();
//        int b = s.nextInt();
//
//        System.out.println("Product of two given number is :" + calculateProduct(a,b));
//    }
//    public static int calculateProduct(int a , int b ) {
//        return a * b ;
//    }



        int n = s.nextInt();
        printFactorial(n);


    }
    public static void printFactorial(int n){
        if (n < 0) {
            System.out.println("Invalid Input ");
            return;

        }
        int product = 1;
        for ( int i=n ; i >=1 ; i--){
            product = product  * i;
        }
        System.out.println(product);

    }



}
