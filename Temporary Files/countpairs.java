import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class countpairs {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        maxPairs(arr);
    }
    public static void maxPairs(int arr[])
    {
        // Stores the final list
        // of pairs required
        List<Integer> matchList = new ArrayList<>();

        // Max Priority Queue to
        // store induced in order
        // of their array value
        PriorityQueue<Integer> pq = new PriorityQueue<>(
                (x, y) -> arr[y] - arr[x]);

        // Loop to iterate arr[]
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                pq.add(i);
        }

        // Loop to iterate pq
        // till it has more
        // than 2 elements
        while (pq.size() >= 2) {

            // Stores the maximum
            int top = pq.poll();

            // Stores the second
            // maximum
            int cur = pq.poll();

            // Insert pair into the
            // final list
            matchList.add(top + 1);
            matchList.add(cur + 1);
            arr[top]--;
            arr[cur]--;

            if (arr[top] > 0)
                pq.add(top);

            if (arr[cur] > 0)
                pq.add(cur);
        }

        // Print Answer
        System.out.println(matchList.size() / 2);
        for (int i = 0; i < matchList.size(); i += 2) {
            System.out.println(matchList.get(i) + " "
                    + matchList.get(i + 1));
        }
    }
}
