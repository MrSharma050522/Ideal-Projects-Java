import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class subarrays {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + "	");
                    set.add(arr[k]-arr[i]);
                }
                System.out.println();
            }
        }
        System.out.println(set.size());
    }
    public static Set<Integer> set = new HashSet<>();
}
