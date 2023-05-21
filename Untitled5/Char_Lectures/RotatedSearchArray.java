package Char_Lectures;
/*
Linear search - O(n)
                  0  1  2  3  4  5   6  7  8
Input  : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
         key = 3
Output : Found at index 8

Input  : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
         key = 30
Output : Not found

Input : arr[] = {30, 40, 50, 10, 20}
        key = 10
Output : Found at index 3

Given a rotated sorted array.
Given : {5, 6, 7, 8, 9, 10, 1, 2, 3}

Algo :
1. Find a pivot idx from where you are breaking the array in two parts.
The two parts will be sorted.
{5, 6, 7, 8, 9, 10, 1, 2, 3}
 -> {5, 6, 7, 8, 9, 10} - O(log n)
 -> {1, 2, 3} - O(log n)
 O(log n) + O(log n) = 2 * log(n)

2. Apply binary search in both arrays and find the el in any of the arrays.


Step 1 : How to find the pivot idx
0   1  2  3  4  5   6  7  8
{5, 6, 7, 8, 9, 10, 1, 2, 3}
pivotIdx = 5

left part : s ---- pivotIdx
rightPart : pivotIdx + 1 --------- e
pivot idx will be the idx where the next el is smaller the current el
arr[pivotIdx] > arr[pivotIdx + 1]

s = 0, e = 8
midIdx = (0 + 8) / 2 = 4
midEl = 9
left : 5, 6, 7, 8
right: 10, 1, 2, 3

midIdx > midIdx + 1 -> pivotIdx = midIdx
midIdx < midIdx - 1 > pivotIdx = midIdx - 1

9 > 5
idx :  5 6 7 8
arr : 10 1 2 3
s = 5, e = 8,
midIdx = (5 + 8) / 2 = 6
midEl = 1
pivotIdx = midIdx - 1 = 5


0   1  2  3  4  5  6  7  8
{1, 2, 3, 5, 6, 7, 8, 9, 10}
5, 6, 7, 8, 9, 10, 1, 2, 3

 */

public class RotatedSearchArray {

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        System.out.println(searchInRotatedSorted(arr, 6));
        System.out.println(searchInRotatedSorted(arr, 8));
        System.out.println(searchInRotatedSorted(arr, 1));
        System.out.println(searchInRotatedSorted(arr, 3));
        System.out.println(searchInRotatedSorted(arr, 120));
    }

    public static int searchInRotatedSorted(int[] arr, int el) {
        int pivotIdx = findPivotIdx(arr, 0, arr.length - 1);
        int checkInLeft = binarySearchRec(arr, el, 0, pivotIdx);
        if (checkInLeft != -1) {
            return checkInLeft;
        }
        return binarySearchRec(arr, el, pivotIdx + 1, arr.length - 1);
    }

    // 6 -> s = 0, e = 0, pivotIdx = 0
    public static int findPivotIdx(int[] arr, int s, int e) {
        // Step 1 : Base case
        if (s > e) {
            return -1;
        }
        // Special check.
        if (s == e) {
            return s;
        }
        // Step 2 and 3 : My work and recursion
        int mid = (s + e) / 2;
        if ((mid + 1 <= e) && arr[mid] > arr[mid + 1]) {
            return mid;
        }
        if ((mid - 1 >= s) && arr[mid] < arr[mid - 1]) {
            return mid - 1;
        }
        if (arr[mid] > arr[s]) {
            return findPivotIdx(arr, mid + 1, e);
        }
        return findPivotIdx(arr, s, mid - 1);
    }

    public static int binarySearchRec(int[] arr, int el, int s, int e) {
        if (s > e) {
            return -1;
        }
        // Step 2 and step 3.
        int mid = (s + e) / 2;
        if (el > arr[mid]) {
            return binarySearchRec(arr, el, mid + 1, e);
        } else if (el < arr[mid]) {
            return binarySearchRec(arr, el, s, mid - 1);
        } else {
            return mid;
        }
    }

}
