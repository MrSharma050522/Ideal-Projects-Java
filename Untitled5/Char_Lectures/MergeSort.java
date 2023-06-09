package Char_Lectures;
/*
Merge Sort : majorly used because of less time complexity than bubble, selection and insertion sort.

Merge sort :
1. based on divide and conquer paradigm.

Divide and conquer:
[divide the problem into smaller parts] - divide
[ use the answer from smaller parts to construct your answer ] - conquer

Merge sort :
       0  1  2  3  4  5  6
arr : {6, 3, 5, 1, 4, 7, 2}

s = 0, e = 6
mid = (0 + 6) / 2 = 3
(0, mid) => {6, 3, 5, 1}
{mid + 1, e} = {4, 7, 2}

 s        mid
{6, 3, 5, 1}
mid+1  e
{4, 7, 2}
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {6, 3, 5, 1, 4, 7, 2};
        mergeSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /*
    {1}
    s = 0
    e = 0
    TC : n logn
    SC : n logn
     */
    public static void mergeSort(int[] arr, int s, int e) {
        if (s >= e) {
            return;
        }
        int mid = (s + e) / 2;
        mergeSort(arr, s, mid);
        mergeSort(arr, mid + 1, e);
        merge(arr, s, mid, e);
    }

    /*
    arr = {6, 3, 5, 1, 4, 7, 2}
    s = 0
    e = 6
    mid = (0 + 6) / 2 = 3
    {0---mid} = {6, 3, 5, 1}
    {mid + 1, e} = {4, 7, 2}

     s        mid
    {1, 3, 5, 6}
  mid+1    e
    {2, 4, 7}

    i = starting idx of first array
    j = starting idx of second array

    arr[i] < arr[j] ; i++
    arr[i] > arr[j]; j++


                     i
    arr1 = {1, 3, 5, 7}
    arr2 = {2, 4, 6}
                     j
    result[] = {1, 2, 3, 4, 5, 6}
    idx = 0
            j
           i = 0, j = 0
           arr1[0] < arr2[0]; idx++

     */
    private static void merge(int[] arr, int s, int mid, int e) {
        int[] mergedArray = new int[e - s + 1];
        int i = s;
        int j = mid + 1;
        int idx = 0;

        while (i <= mid  && j <= e) {
            if (arr[i] <= arr[j]) {
                mergedArray[idx] = arr[i];
                i++;
            } else {
                mergedArray[idx] = arr[j];
                j++;
            }
            idx++;
        }
        while (i <= mid) {
            mergedArray[idx] = arr[i];
            i++;
            idx++;
        }
        while (j <= e) {
            mergedArray[idx] = arr[j];
            j++;
            idx++;
        }
        // Copy the content of mergedArray into your original array
        for (int in = 0; in < mergedArray.length; in++) {
            arr[s + in] = mergedArray[in];
        }
    }


}
