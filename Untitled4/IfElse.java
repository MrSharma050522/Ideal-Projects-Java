


// Control Statement -> The statement used to make any sort of decisions / condition etc.
// In java , we have two ways to implement the control statements .
// 1. if - else statements
// 2. switch case statements.

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        // check whether a number is even or odd .

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        // Nested if statements
        // 5 rs -> perk
        //        10 rs -> 5 star
        //        20 -> Fuse choclate
        //        30 -> Kit kat
        //        40 -> Bournville
        //        50 -> Dairy milk
        //        100 -> Pizza
        //        None of it -> Donate it


        int rupee = s.nextInt();
        if (rupee == 5) {
            System.out.println("Perk");
        } else if (rupee == 10) {
            System.out.println("5 star");
        } else if (rupee == 20) {
            System.out.println("Fuse chocholate");
        } else if (rupee == 30) {
            System.out.println("Bournville");
        } else if (rupee == 40) {
            System.out.println("Kit Kat");
        } else if (rupee == 50) {
            System.out.println("Dairy Milk ");
        } else if (rupee == 100) {
            System.out.println("Pizza ");
        } else {
            System.out.println("Donate it ");
        }


        // Implementation of switch case
        switch (num % 2) {
            case 0:
                System.out.println("Even");
                break;
            case 1:
                System.out.println("Odd");
                break;
            default:
                System.out.println("Always Implemented");
                break;
        }

        int num1 = s.nextInt();
       if (num1 < 0) {
            System.out.println("Negative ");
        } else if (num1 > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Zero");
        }

       // check is only for positive and negative
        boolean check = num1 > 0;
       // check2 is only for zero
        boolean check2 = num1 == 0;
        int checkNo = 0;
        if (check2 == true) {
            checkNo = 0;

        }if (check == true ){
            checkNo = 1;
        }else {
            checkNo = -1 ;
        }
        switch (checkNo){
            case 1 :
                System.out.println("Positive");
            case -1 :
                System.out.println("Negative");
            case 0 :
                System.out.println("Zero");

        }


    }


}



