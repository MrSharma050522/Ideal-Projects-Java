package Array_Rotation;

import java.util.Scanner;

public class
PracticeOnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfArray = sc.nextInt();
        int[] array = new int[sizeOfArray];
        for ( int i = 0 ; i < sizeOfArray; i++){
            array[i] = sc.nextInt();

        }
        for ( int i =0 ; i < sizeOfArray;i++){
           System.out.print(array[i] + " ");
        }
        System.out.println(array);


    }

}
