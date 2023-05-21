package Practice_Java;
import java.util.*;


public class sortbyAbsoluteDiff {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int k = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            TreeMap<Integer, ArrayList<Integer>> m = new TreeMap<>();
            // Store values in a map with the difference
            // with X as key
            for (int i = 0; i < n; i++) {
                int diff = Math.abs(k - arr[i]);
                if (m.containsKey(diff)) {
                    ArrayList<Integer> al = m.get(diff);
                    al.add(arr[i]);
                    m.put(diff, al);
                } else {
                    ArrayList<Integer> al = new ArrayList<>();
                    al.add(arr[i]);
                    m.put(diff, al);
                }
            }
            int index = 0;
            for (Map.Entry entry : m.entrySet()) {
                ArrayList<Integer> al = m.get(entry.getKey());
                for (int i = 0; i < al.size(); i++)
                    arr[index++] = al.get(i);
            }
            for (int i = 0; i < n; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}









