package Practice_Java;

import java.util.Scanner;

public class Mock {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i< n;i++){
            arr[i]=s.nextInt();
        }

        if(binarySearch(arr,4)==true){
            System.out.println("present");
        }
        else {
            System.out.println("not present");
        }



    }
    public static boolean binarySearch(int[] arr, int el ){
        int start = 0;
        int end = arr.length-1;
        int mid = start + (end - start)/2;
        while (start < end){
                if(arr[mid]>el){
                    start = mid+1;
                } else if (arr[mid]<el) {
                    end = mid -1;
                } else {
                    return true;
                }



        }return false;
    }

}

