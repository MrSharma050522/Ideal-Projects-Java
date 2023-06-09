package Char_Lectures;
/*
Sorting : arranging something in either increasing or decreasing order.
arr : {5, 1, 3, 2, 4}
sort : 1, 2, 3, 4, 5

Sorting:
1. Bubble sort
2. Selection sort.
3. Insertion sort
4. Merge sort *
5. Quick sort *
and many more (Counting sort, Bucket sort, Radix sort, Tim sort).

{2, 1} -> {1, 2}

Bubble sort : the most naive/ brute force/ worst time which one can think of.
arr : {5, 1, 6, 3, 2, 4}
Algo : Compare adjacent elements and place the smaller element to the left of larger element
till the array is sorted.

arr : {5, 1, 6, 3, 2, 4}
Step 1: {1, 5, 3, 2, 4, 6} -> the maximum element gets placed on the correct index.
Step 2: {1, 3, 2, 4, 5, 6} -> the second maximum el gets placed at its correct index
Step3: {1, 2, 3, 4, 5, 6} -> sorted array.

arr : {6, 5, 4, 3, 2, 1}
1. {5, 4, 3, 2, 1, 6}
2. {            5, 6}
3. {         4, 5, 6}
4. {      3, 4, 5, 6}
5. {  , 2, 3, 4, 5, 6}

Selection sort :
arr : {5, 1, 6, 3, 2, 4}

{1, 5, 6, 3, 2, 4}
{1, 2, 6, 3, 5, 4}
{1, 2, 3, 6, 5, 4}
{1, 2, 3, 4, 5, 6}

arr : {8, 3, 1, 2, 7, 6, 5, 4}

Read about insertion sort. O(n ^ 2)
 */
public class SortingBasics {
    public static void main(String[] args) {
        int[] arr = {5, 1, 6, 3, 2, 4};
        int[] arr2 = {6, 5,  8, 9, 12, 4, 3, 2, 1};
        bubbleSort(arr);
        selectionSort(arr2);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

    // H/w : Can we optimise it any further?
    // TC  : O(n ^ 2)
    /*
    a = 1
    b = 2
    swap : a = 2, b = 1

    temp = a, temp = 1
    a = b, a = 2
    b = temp, b = 1
     */
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int steps = 1; steps <= n - 1; steps++) {
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    // swap
                    swap(arr, i, i + 1);
                }
            }
        }
    }

    /*
    Selection sort :
arr : {5, 1, 6, 3, 2, 4}
idx = 0, minIdx = 1
{1, 5, 6, 3, 2, 4}
{1, 2, 6, 3, 5, 4}
{1, 2, 3, 6, 5, 4}
{1, 2, 3, 4, 5, 6}
     */
    // TC : n^2
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int idx = 0; idx < n; idx++) {
            int minIdx = 0;
            int minEl = Integer.MAX_VALUE;
            for (int i = idx; i < n; i++) {
                if (arr[i] < minEl) {
                    minEl = arr[i];
                    minIdx = i;
                }
            }
            swap(arr, idx, minIdx);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /*
    1 2 3 4 5
    min = infinity
    cmp(arr[0], min) =  min = 1
    cmp(arr[1], min) = min = 1
    ...... min = 1
     */

}


