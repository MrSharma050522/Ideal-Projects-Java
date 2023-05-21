package Practice_Java;

import java.util.HashSet;
import java.util.Scanner;

public class Hashing_TargetSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sizeOfArray= s.nextInt();
        int[] arr = new int[sizeOfArray];
        for (int i = 0 ;i<sizeOfArray;i++){
            arr[i]=s.nextInt();
        }
        int target = s.nextInt();
        printPair(arr,target);
    }
    static void printPair(int[] arr, int sum) {
        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < arr.length; ++i) {
            int temp = sum - arr[i];
            // checking for condition
            if (s.contains(temp)) {
                System.out.println("Pair with given sum " + sum + " is (" + arr[i] + ", " + temp + ")");
            }
            s.add(arr[i]);
        }
    }
}
/*
User Input :
5
3 6 1 7 9
9
 */
