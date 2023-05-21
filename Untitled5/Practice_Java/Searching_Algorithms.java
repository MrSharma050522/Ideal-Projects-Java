package Practice_Java;

import java.util.Arrays;

public class Searching_Algorithms {
    public static void main(String[] args) {
        int[] arr = {8,6,4,7,9,5,3,2,1,0};
        Arrays.sort(arr);
        if(binarySearch(arr,4)==true){
            System.out.println("Present ");
        } else {
            System.out.println("Absent");
        }
        System.out.println(linearSearch(arr,5));

    }
    public static int linearSearch(int[] arr,int el){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==el){
                return i;
            }
        } return -1;
    }
    public static boolean  binarySearch(int[] arr,int el){
        int si = 0 ;
        int ei = arr.length-1;
        while(si<=ei){
            int mid = (si+ei)/2;
            if(el<arr[mid]){
                ei = mid-1;
            }else if(el>arr[mid]){
                si=mid+1;
            } else {
                return true;
            }
        } return false ;
    }
    public static boolean binarySearchRecursion(int[] arr,int si ,int ei,int el){
        if(si>ei){
            return false;
        }
        int mid = (si+ei)/2;
        if(el>arr[mid]){
            return binarySearchRecursion(arr,mid+1,ei,el);
        } else if (el<arr[mid]) {
            return binarySearchRecursion(arr,si,mid-1,el);
        }else {
            return true;
        }
    }
}
