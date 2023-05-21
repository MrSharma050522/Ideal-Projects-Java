package Array_Rotation;

public class RightRotatedArray {
    public static void main(String[] args) {
        // Initialising array
        int[] arr = {1,2,3,4,5,6,7,8,9};
        // n determine the number of times an array should be rotated
        int n = 4;

        /*
         1 2 3 4 5 6
         6 1 2 3 4 5
         5 6 1 2 3 4
         */


        //Display original array
        System.out.println("Original Array");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        //Rotate the given array by n times toward right
        for(int i =0;i<n;i++){
            // Stores the last element of array
            int last = arr[arr.length-1];

            for (int j = arr.length-1;j>0;j--){
                // Shift element of array by one
                arr[j] = arr[j-1];
            }
            // Last element of array will be added to the start of array
            arr[0]=last;
        }
        System.out.println();
        // Display resulting array after rotation
        System.out.println("Array after right rotation ");
        for(int i =0 ;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
