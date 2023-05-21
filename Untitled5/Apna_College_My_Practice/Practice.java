package Apna_College_My_Practice;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {1, 2,6, 4, 5, 3, 9, 8, 7, 0,};
        System.out.println(linearSearch(arr, 5));
        System.out.println(linearSearch(arr, 8));

        int[] arr1 = {1, 2, 3, 4 ,5, 6, 7, 8, 9, 10};
        System.out.println(binarySearch(arr1, 6));
        System.out.println(binarySearch(arr1, 5));

        System.out.println(binarySearchRecursion(arr1, 2 , 0, arr.length-1 ));
        System.out.println(binarySearchRecursion(arr1, 9, 0 , arr.length-1 ));

    }
    public static boolean linearSearch(int[] arr, int el){
        for (int i = 0 ; i < arr.length; i++){
            if (arr[i] == el ){
                return true;
            }

        }
        return false;

    }
    public static boolean binarySearch(int[] arr, int el){
        int s = 0 ;
        int e = arr.length - 1;

        while ( s <= e ){
            int mid = ( s + e ) / 2 ;
            if (el > arr[mid]){
                s = mid + 1;
            } else if ( el < arr[mid]){
                e = mid - 1 ;
            } else {
                return true ;
            }

        }
        return false ;
    }
    public static boolean binarySearchRecursion (int[] arr , int el , int s , int e ){
        if (s > e ){
            return false;
        }
        // Step 2. Recursion1 and do your work
        int mid = (s + e ) / 2;
        if (el > arr[mid]){
            return binarySearchRecursion(arr, el, mid + 1 , e);
        } else if (el < arr[mid]){
            return binarySearchRecursion(arr, el , s, mid - 1);
        } else {
            return true;
        }
    }
}
