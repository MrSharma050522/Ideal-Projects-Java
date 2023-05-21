package Char_Lectures;/*
arr : {6, 2, 1, 4, 5, 3}
Check whether 2 is present in arr or not?
Search 1 : 3 sec
Search 5 : 5 sec

Given an arr, search for an element!!
Assume : Going on one element takes you 1 sec of time.

arr1 : {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,} {sorted}
Search - 10 (10 secs)
Same process

Binary search :
1. Array is sorted

idx : 0 1 2 3 4 5 6 7 8 9
arr:  1 2 3 4 5 6 7 8 9 10

1 sec
mid = 5
left : 1 2 3 4 5
right : 6 7 8 9 10
elementToSearch = 10

2 sec
arr : 6 7 8 9 10
mid = 8
left = 6 7 8
right = 9 10
elementToSearch = 10

3 sec
arr : 9 10
mid = 9
left = 9
right = 10
elementToSearch = 10

4 sec
arr : 10
mid = 10
middleElement == elementToSearch
return true;

arr2 : {2, 1, 3, 5, 4, 7, 6, 9, 8, 10} {unsorted}
Search - 10 (10 secs)
Same process

si = 0
ei = 9
idx : 0 1 2 3 4 5 6 7 8 9
arr:  1 2 3 4 5 6 7 8 9 10
search = 6

mid = 5 (si + ei) / 2 {4th idx}
left = 1 2 3 4 5
right = 6 7 8 9 10
search = 6
si = 5 (mid + 1)
ei = 9

arr : 6 7 8 9 10
mid = 8
left = 6 7 8
right = 9 10
search = 6

arr : 6 7 8
mid = 7


 */

public class SearchAlgo {

    public static void main(String[] args) {
        int[] arr = {6, 2, 1, 4, 5, 3};
//        System.out.println(linearSearch(arr, 2));
//        System.out.println(linearSearch(arr, 10));

        int[] arr1 = {1, 2, 3, 4, 5, 6};
//        System.out.println(binarySearch(arr1, 2));
//        System.out.println(binarySearch(arr1, 10));

        System.out.println(binarySearchRec(arr1, 2, 0, arr1.length - 1));
        System.out.println(binarySearchRec(arr1, 10, 0, arr1.length - 1));
    }

    // TC : O(n)
    public static boolean linearSearch(int[] arr, int el) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == el) {
                return true;
            }
        }
        return false;
    }

    public static boolean binarySearch(int[] arr, int el) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int mid = (s + e) / 2;
            if (el > arr[mid]) {
                s = mid + 1;
            } else if (el < arr[mid]) {
                e = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }

    /*
    Solve binary search using recursion
    0 1 2 3 4
    1 2 3 4 5
    s = 3
    e = 1
     */

    public static boolean binarySearchRec(int[] arr, int el, int s, int e) {
        if (s > e) {
            return false;
        }
        // Step 2 and step 3.
        int mid = (s + e) / 2;
        if (el > arr[mid]) {
            return binarySearchRec(arr, el, mid + 1, e);
        } else if (el < arr[mid]) {
            return binarySearchRec(arr, el, s, mid - 1);
        } else {
            return true;
        }
    }

}
