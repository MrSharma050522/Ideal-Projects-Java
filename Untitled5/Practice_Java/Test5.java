package Practice_Java;

import java.util.Arrays;
import java.util.Scanner;



public class Test5 {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        int[] arr = new int[n];
//        for(int i = 0;i<n;i++){
//            arr[i]=s.nextInt();
//        }
//        System.out.println("Peak point's index is :"+ findPeak(arr,n));





        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int [][] matrix= new int[n][m];
        for(int i = 0 ;i<n;i++){
            for(int j= 0 ;j<m;j++){
                matrix[i][j]=s.nextInt();
            }
        }
        for(int i = 0 ;i<n;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<m;j++){
                if(matrix[i][j]>max){
                    max=matrix[i][j];
                }
            }
            System.out.println(max);
        }




    }
//    static int findPeak(int[] arr,int n){
//        if(n==1|| arr[0]>arr[1]){
//            return 0;
//        }
//        if(arr[n-1]>=arr[n-2]){
//            return n-1;
//        }
//        for(int i = 1;i<n-1;i++){
//            if(arr[i]>arr[i-1]&&arr[i]>arr[i+1]){
//                return i;
//            }
//        }
//        return 0;
//    }



//        Scanner s = new Scanner(System.in);
////        int n = s.nextInt();
////        int m = s.nextInt();
//        int[][] DiagonalElementOfMatrix = new int[4][4];
//        for (int i = 0 ;i<4;i++){
//            for(int j=0; j<4;j++){
//                DiagonalElementOfMatrix[i][j]=s.nextInt();
//            }
//        }
//        int x = 0;
//        int c = -1;
//        for(int i = 0 ;i<4;i++){
//            int count = 0;
//            for(int j =0;j<4;j++){
//                if(DiagonalElementOfMatrix[i][j]==1){
//                    count++;
//                }
//
//            }
//            if(count>c){
//               c=count;
//               x=i;
//            }
//
//        }
//        System.out.println(x);

        /*
        0 1 1 1
        0 0 1 1
        1 1 1 1
        0 0 0 0
         */

//
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = s.nextInt();
//        }
//        quickSortsr(arr,0,arr.length-1);
//
//
//        int k = s.nextInt();
//        int sum = 0;
//        for (int i = n - k; i < n; i++) {
//            int sq = arr[i] * arr[i];
//            sum = sum + sq;
//        }
//        System.out.println(sum);
//    }




//
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        int[] arr=new int[n];
//        for(int i = 0 ;i<n;i++){
//            arr[i]=s.nextInt();
//        }
//        quickSort(arr,0,arr.length-1);
//
//        System.out.println(arr[n-1]*arr[n-2]);
//



//

//
//    }




//    private static void quickSortsr(int[] arr, int low , int high ){
//        if(low<high){
//            int pivotIdx = partition(arr,low , high);
//
//            quickSortsr(arr,low,pivotIdx-1);
//            quickSortsr(arr,pivotIdx+1,high);
//        }
//    }
//    private static int partition(int[] arr, int l, int h){
//        int pivot = arr[h];
//        int i = l-1;
//
//        for(int j=l; j<h; j++){
//            if(arr[j] < pivot){
//                i++;
//                // swap
//                int temp = arr[i];
//                arr[i]=arr[j];
//                arr[j]=temp;
//            }
//        }
//        i++;
//        int temp = arr[i];
//        arr[i]=arr[h];
//        arr[h]=temp;
//        return i; // pivot index
//    }




}
