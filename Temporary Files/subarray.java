import java.util.HashSet;
import java.util.Set;

public class subarray {
    public static void main(String[] args) {
        int[] arr = {4,6,5,4,7};
        printSubArrays(arr,0,1);
        System.out.println(set.size());
        System.out.println(set);
    }
    public static  Set<Integer> set = new HashSet<>();
    public static void printSubArrays(int[] arr, int start, int end) {

        // Stop if we have reached the end of the array
        if (end == arr.length)
            return;
            // Increment the end point and start from 0
        else if (start > end)
            printSubArrays(arr, 0, end + 1);
            // Print the subarray and increment the starting
            // point
        else {
            set.add(Math.abs(arr[start]-arr[end]));
//            System.out.print("[");
//            for (int i = start; i < end; i++)
//                System.out.print(arr[i] + ", ");
//                System.out.println(arr[end] + "]");
            printSubArrays(arr, start + 1, end);
        }

    }
}
