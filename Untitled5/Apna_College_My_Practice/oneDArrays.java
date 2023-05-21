package Apna_College_My_Practice;

import java.util.Scanner;

public class oneDArrays {
    public static void main(String[] args) {
//        int[] marks = new int[3];
//        int marks[] = {97,98,95};
////        marks[0] = 97;
////        marks[1] = 98;
////        marks[2] = 95;
////        System.out.println(marks[0]);
////        System.out.println(marks[1]);
////        System.out.println(marks[2]);
//     for(int i = 0;i<3;i++){
//         System.out.println(marks[i]);
//     }

//        Scanner s = new Scanner(System.in);
//        int size = s.nextInt();
//        int numbers[] = new int[size];
////      input
//        for(int i = 0 ; i< numbers.length;i++){
//            numbers[i] = s.nextInt();
//        }
//        // output
//        for (int i = 0 ; i< numbers.length;i++){
//
//            System.out.print(numbers[i]+" ");
//        }

//        Scanner s = new Scanner(System.in);
//        int size = s.nextInt();
//        int[] array = new int[size];
//        for (int i = 0 ;i<size;i++){
//            array[i] = s.nextInt();
//        }
//        int x = s.nextInt();
//        for (int i = 0 ;i<size;i++){
//            if (array[i] == x){
//                System.out.println("x found at index :"+i);
//            }
//        }\

        /*
        Take an array of names as input from the user and print them on the screen.
         */

//        Scanner s = new Scanner(System.in);
//        int size = s.nextInt();
//        String[] name = new String[size];
//        for (int i = 0;i<size;i++){
//            name[i] = s.next();
//        }
//        for (int i = 0 ;i<size;i++){
//            System.out.print(name[i]+" ");
//        }

        /*
        Find the maximum & minimum number in an array of integers.
         */

//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        int[] numbers = new int[n];
//        for (int i = 0 ;i<n;i++){
//            numbers[i] = s.nextInt();
//        }
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//        for (int i = 0 ;i<n ;i++){
//            if (numbers[i] < min ){
//                min = numbers[i];
//            }
//            if (numbers[i] > max ){
//                max = numbers[i];
//            }
//
//        }
//        System.out.println("This is the max number :" + max);
//        System.out.println("This is the min number :" + min);

        /*
        Take an array of numbers as input and check if it is an array
        sorted in ascending order.
         */
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int numbers[] = new int[size];
        for (int i = 0 ;i<size;i++){
            numbers[i] = s.nextInt();
        }
        boolean isAscending = true;
        for (int i = 0 ;i<size-1;i++){
            if(numbers[i]>numbers[i+1]){
                isAscending = false;

            }
        }
        if (isAscending){
            System.out.println("This array is sorted in ascending order ");
        } else {
            System.out.println("This array is not sorted in ascending order ");
        }



    }
}
