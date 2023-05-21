package Char_Lectures;/*
Given an array only containing 0,1 ,2. Sort then

Constraints : Solve this problem using 1 loop
arr: {0, 2, 1, 2, 0}
{0, 0, 1, 2, 2}
Homework :
  0  1  2  3  4  5   6  7  8  9   10 11
{ 0, 1, 1, 0, 1, 2,  1, 2, 0, 0,  0, 1}
I know that 0 will be always be at start and 2 will always be at end .

si = 0
ei = 11


idx = 0
arr[0] = 0 , swap(arr, 0 , 0) , idx++, si++

idx = 1 , si = 1
arr[1] = 1
idx++

idx = 2 , si = 1 , ei = 11
arr[2] = 1
idx++

idx = 3 , si = 1 , ei = 11           0  1  2  3  4  5   6  7  8  9   10 11
arr[3] = 0 , swap (arr , 3, 1 ) -> { 0, 0, 1, 1, 1, 2,  1, 2, 0, 0,  0, 1}
idx++ , si++

idx = 4 , si = 2
arr[4] = 1
idx++

idx = 5 , si = 2 ,ei = 11             0  1  2  3  4  5   6  7  8  9   10 11
arr[5] = 2 swap (arr, 5 , 11) ->    { 0, 0, 1, 1, 1, 1,  1, 2, 0, 0,  0, 2}
ei--,
idx = 5 , si = 2 , ei =10
arr[5] = 1
idx++

idx = 6 ,si = 2 , ei = 10
arr[6] = 1
idx++
 idx = 7 si = 2 ei = 10              0  1  2  3  4  5   6  7  8  9   10 11
arr[7] = 2 swap ( arr, 7, 10 ) - > { 0, 0, 1, 1, 1, 1,  1, 0, 0, 0,  2, 2}
ei --

idx =7 , si = 2 , ei =9              0  1  2  3  4  5   6  7  8  9   10 11
arr[7] = 0 , swap (arr, 2 , 7, )   { 0, 0, 0, 1, 1, 1,  1, 1, 0, 0,  2, 2}
idx++
 */



public class Sort012 {

    /*
    Swap two indexes of array
    {1 , 2 , 3 , 4}
    oth and 3rd idx -> { 4 , 2, 3, 1, }
     */
    public static void main(String[] args) {
        int[] arr = { 0, 1, 1, 0, 1, 2,  1, 2, 0, 0,  0, 1};
        sort012(arr);
        for ( int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]  + " ");
        }
        System.out.println();


    }
    public static void sort012(int[] arr){
        int si = 0 ;
        int ei = arr.length - 1;
        int idx = 0 ;

        while (idx <= ei ){
            switch (arr[idx]){
                case 0 :
                    swap(arr, idx , si );
                    idx++;
                    si++;
                    break ;

                case 1 :
                    idx++;
                    break ;
                case 2 :
                    swap(arr,idx , ei );
                    ei--;
                    break;

            }
        }
    }
    /*
    1 2 3 4
    temp = 1
    arr[i] = arr[j]
    arr[j] = temp
     */

    public static void swap(int[] arr,int i , int j ){
        int temp = arr[i]; // temp = 2
        arr[i] = arr[j]; // arr[0] = 4
        arr[j] = temp;

    }

}
