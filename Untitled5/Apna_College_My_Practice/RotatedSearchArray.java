package Apna_College_My_Practice;

public class RotatedSearchArray {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        System.out.println(searchInRotatedSorted(arr, 6));
        System.out.println(searchInRotatedSorted(arr, 8));
        System.out.println(searchInRotatedSorted(arr, 1));
        System.out.println(searchInRotatedSorted(arr, 3));
        System.out.println(searchInRotatedSorted(arr, 120));


    }

    public static int searchInRotatedSorted(int[] arr, int el){
        int pivotIdx = findPivotIdx(arr, 0, arr.length - 1);
        int chechInLeft = binarySearchRec(arr, el, 0, pivotIdx);
        if (chechInLeft != -1) {
            return chechInLeft;
        }
        return binarySearchRec(arr, el, pivotIdx + 1, arr.length - 1);

    }

    public static int findPivotIdx(int[] arr, int s, int e) {
        if (s > e) {
            return -1;
        }
        if (s == e) {
            return s;

        }
        int mid = (s + e) / 2;
        if ((mid + 1 <= e) && arr[mid] > arr[mid + 1]) {
            return mid;
        }
        if ((mid - 1 >= s ) && arr[mid] < arr[mid - 1]) {
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

