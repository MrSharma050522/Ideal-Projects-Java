package Char_Maths;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {

        /*
        1. Make a function to check if a number is prime or not.
         */

        Scanner s = new Scanner(System.in);
        int n =  s.nextInt();
        boolean isPrime = true;
        for (int i = 2 ; i<=n/2;i++){
            if(n % i == 0 ){
                isPrime = false ;
                break;
            }
        }
        if (isPrime){
            if(n==1){
                System.out.println("This is neither prime nor a composite number");
            } else {
                System.out.println("This is a prime number ");
            }
        } else {
            System.out.println("This is not a prime number ");
        }

        /*
        2. Make a function to check if a given number n is even or not.
         */

//        Scanner  sc = new Scanner(System.in);
//        int n =  sc.nextInt();
//        if(n%2==0){
//            System.out.println(n+": This is an Even number");
//        } else {
//            System.out.println(n+": This is an Odd number");
//        }

        /*
        3. Make a function to print the table of a given number n.
         */

//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        for (int i = 1 ; i <=10;i++){
//
//            int table = n * i;
//            System.out.println(n+" * "+i+" = "+table);
//        }

        /*
        4. Enter 3 numbers from the user & make a function to print their average.
         */

//        Scanner s = new Scanner(System.in);
//        int a = s.nextInt();
//        int b = s.nextInt();
//        int c = s.nextInt();
//        int average = (a+b+c)/3;
//        System.out.println(average);

        /*
        5. Write a function to print the sum of all odd numbers from 1 to n.
         */

//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt() ;
//        printOddSum(n);
//
//    }
//    public static void printOddSum(int n ){
//        int sum = 0;
//        for (int i = 1 ; i<= n ;i++){
//            if (i%2 != 0){
//                sum = sum + i;
//            }
//        }System.out.println(sum);

        /*
        6. Write a function which takes in 2 numbers and returns
        the greater of those two.
         */

//        Scanner s = new Scanner(System.in);
//        int a  = s.nextInt();
//        int b = s.nextInt();
//        GreaterOfThese(a,b);
//
//    }
//    public static void GreaterOfThese(int a , int b ){
//        if( a > b){
//            System.out.println("This is greater :" + a);
//        } else{
//            System.out.println("This is greater:" + b);
//        }

        /*
        7. Write a function that takes in the radius as input
         and returns the circumference of a circle.
         */

//        Scanner s = new Scanner(System.in);
//        double radius = s.nextDouble();
//        System.out.println(getCircumference(radius));
//    }
//    public static double getCircumference(double n ){
//        double π = 3.14;
//        double circumference = 2*π*n;
//        return circumference;

        /*
        8. Write a function that takes in age as input and returns
         if that person is eligible to vote or not.
         A person of age > 18 is eligible to vote.
         */

//        Scanner s = new Scanner(System.in);
//        int age = s.nextInt();
//        eligibilityToVote(age);
//    }
//    public static void eligibilityToVote(int n ){
//        if (n >= 18 ){
//            System.out.println("You are eligible to vote.");
//        } else{
//            System.out.println("You are not eligible to vote.");
//        }
//    }

        /*
        9. Write an infinite loop using do while condition.
         */

//        do {
//
//        } while (true);

        /*
        10. Write a program to enter the numbers till the user wants
        and at the end it should display the count of positive, negative and zeros
        entered.
         */

//        int positive = 0 , negative = 0 , zeros = 0;
//        System.out.println("Press 1 to continue and 0 to stop ");
//        Scanner s = new Scanner(System.in);
//        int input = s.nextInt();
//        while (input == 1){
//            System.out.println("Enter your number :");
//            int number = s.nextInt();
//            if(number < 0 ){
//                negative++;
//            } else if (number>0) {
//                positive++;
//            } else {
//                zeros++;
//            }
//            System.out.println("Press 1 to continue and 0 to stop");
//            input = s.nextInt();
//        }
//        System.out.println("Positives:"+positive);
//        System.out.println("Negatives:"+negative);
//        System.out.println("Zeros:"+zeros);

        /*
        11. Two numbers are entered by the user, x and n.
        Write a function to find the value of one number raised
        to the power of another i.e. 𝑥 .
         */

//        Scanner s = new Scanner(System.in);
//        int x = s.nextInt();
//        int n = s.nextInt();
//        int power = 1;
//        for (int i = 0;i<n;i++){
//            power = power * x;
//        }
//        System.out.println(power);

        /*
        12. Write a function that calculates the
        Greatest Common Divisor of 2 numbers.
         */

//        Scanner s = new Scanner(System.in);
//        int a = s.nextInt();
//        int b = s.nextInt();
//        greatestCommonDivisor(a,b);
//
//
//
//
//    }
//    public static void greatestCommonDivisor(int a , int b ){
//        while (a != b){
//            if(a > b){
//                a = a - b;
//            } else {
//                b = b - a;
//            }
//        }
//        System.out.println(b);;
//    }

        /*
        13. Write a program to print Fibonacci series of
        n terms where n is input by user :
        0 1 1 2 3 5 8 13 21 .....
        In the Fibonacci series, a number is the sum of
        the previous 2 numbers that
        came before it.
         */

//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        int a = 0 , b = 1;
//        System.out.print(a+" ");
//        if(n > 1){
//            for(int i=2;i<=n;i++){
//                System.out.print(b+" ");
//                int temp = b;
//                b=a+b;
//                a = temp;
//            }
//            System.out.println();
//        }


    }

}