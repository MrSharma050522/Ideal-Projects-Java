package Apna_College_My_Practice;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        int n = s.nextInt();
//
//        for(int i = 1 ; i <= n; i++){
//            if(i % 2 == 0){
//                System.out.print(i + " ");
//            }
//
//        }

//        This will work as an infinite loop

//        for ( ; ; ){
//            System.out.println("Apna college");
//        }
//        int input = s.nextInt();
//       do {
//           int marks = s.nextInt();
//           if (marks >= 90 && marks <= 100){
//               System.out.println("This is Good");
//           } else if ( marks>=60 && marks<=89){
//               System.out.println("This is also Good ");
//           } else if (marks>=0 && marks<=59){
//               System.out.println("This is Good as well");
//           } else {
//               System.out.println("Invalid ");
//           }
//           System.out.println("Want to continue ? (yes(1) or no(0))");
//           input = s.nextInt();
//
//       }while (input == 1);

        int n = s.nextInt();
        boolean isPrime = true ;
        for (int i = 2 ; i<=n/2;i++){
            if (n % i == 0 ){
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            if (n==1){
                System.out.println("This is neither prime nor composite");
            } else {
                System.out.println("This is a prime number");
            }
        } else {
            System.out.println("This is not a prime number");
        }


    }
}
