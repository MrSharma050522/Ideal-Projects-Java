package Char_Lectures;
/*
What Array is ?
Arrays :
1. collection of similar data types .
{1, 2, 3, 4, 5, 6} -> is collection of integer elements
{2, 4, 8.9 , 1, 2} -> is not an array because in between integers we see here is an float .
{1, 3, 4, 2, "Sandeep "} -> is not an array because it has a string .

2. continuous memery allocation - system stores every data inside a memory
{1,  2,  3,  4,  5,  6}
800  804 808 812 816 820 memory address pe hai just imagine . if 1 is at 0 memory location then
0    4   8   12   16  20

1 integer takes 4 bytes of memory
1 integer - 4 bytes.



 */

import java.util.Scanner;
public class ArrayBasic {
    public static void main(String[] args) {
        // how do we implement array in java ?
        /*
        In java , array works on 0- based indexing .
        arr = {3, 6, 1, 8, 5, 10 }
               0  1  2  3  4  5      ---> index
               arr[0]  =  3
               arr[3]  =  8
               arr[1]  =  6
               arr[5]  =  10

               nth element --> (n-1) index.
               Prerequisite of creating an array:
               1. size of the array.


         */


        Scanner sc = new Scanner(System.in);
        int size  = sc.nextInt();

        // int [] ->  integer array
        // new - keyword use to initialise / create an array
        int[] arr = new int[size];
        // {0,  0,  0,  0,  0}\
        System.out.println("Before ");
        for (int i = 0 ; i < size ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("After: ");
        for (int i = 0; i < size ; i++){
            int num = sc.nextInt();

            arr[i] = num ;
        }
        System.out.println("The 3rd  element is : " + arr[2]);
        for (int i = 0 ; i < size ; i++){
            System.out.print(arr[i] + " ");
        }

    }

}

