package Recursion_Pepcoding;

public class DisplayArray {
    public static void main(String[] args) {
        int[] arr = {5, 8, 7, 9, 1, 4, 3, 7};
//        displayArr(arr,0);
//        display(arr,arr.length-1);
//        displayReverse(arr,arr.length-1);
        displayReverseArr(arr,0);
    }
    public static void display(int[] arr, int n){
        if (n==0){
            System.out.print(arr[0]+" ");
            return;
        }

        display(arr,n-1);
        System.out.print(arr[n]+" ");
    }
    public static void displayArr(int[] arr, int n){
        if (n == arr.length){;
            return;
        }
        System.out.print(arr[n]+" ");
        displayArr(arr,n+1);
    }
    public static void displayReverse(int[] arr, int n){
        if (n == 0){;
            System.out.print(arr[0]+" ");
            return;
        }
        System.out.print(arr[n]+" ");
        displayReverse(arr,n-1);
    }
    public static void displayReverseArr(int[] arr, int n){
        if (n == arr.length){;
            return;
        }
        displayReverseArr(arr,n+1);
        System.out.print(arr[n]+" ");
    }
}
