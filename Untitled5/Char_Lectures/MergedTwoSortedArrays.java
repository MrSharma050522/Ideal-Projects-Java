package Char_Lectures;/*
Given two sorted arrays, the task is to merge them in a sorted manner.
        Examples:

        Input:
        arr1[] = { 1, 3, 4, 5},
        arr2[] = {2, 4, 6, 8}
        1 3 4 5 2 4 6 8
        Output: arr3[] = {1, 2, 3, 4, 4, 5, 6, 8}

        size of the result array = arr1.length + arr2.length

        i = 0, j = 0
        i i i i
        1 3 4 5
        2 4 6 8
        j j

        k = 0
        arr3 = 1 2 3 4

        i = 0; j = 0; k = 0
        arr1[i] <= arr2[j]; arr3[k] = arr1[i]; k++ i++

        i = 1; j = 0; k = 1
        arr2[j] < arr1[i]; arr3[k] = arr2[j]; k++ j++

        i = 1; j = 1; k = 2
        arr1[i] < arr2[j] ; arr3[k] = arr1[i] k++ i++

        i = 2 j = 1 k = 3
        arr1[i] <= arr2[j] ; arr3[k] = arr1[i] k++ i++

        i = 3 j = 1 k = 4
        arr2[j] < arr1[i]; arr3[k] = arr2[j] k++ j++

        i = 3 j = 2 k = 5

        */

public class MergedTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8};
        int[] arr3 = merge(arr1, arr2);
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }

    /*
    return type
    function name
    arguments
     */
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                arr3[k] = arr1[i];
                k++;
                i++;
            } else {
                arr3[k] = arr2[j];
                k++;
                j++;
            }
        }

        // If i has reached the end
        // If j has reached the end
        while (i < arr1.length) {
            arr3[k] = arr1[i];
            k++;
            i++;
        }
        while (j < arr2.length) {
            arr3[k] = arr2[j];
            k++;
            j++;
        }
        return arr3;
    }
}
