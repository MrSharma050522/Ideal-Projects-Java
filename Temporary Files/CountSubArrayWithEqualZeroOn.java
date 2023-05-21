import java.util.HashMap;
import java.util.Map;

public class CountSubArrayWithEqualZeroOn {
    static int countSubarrayWithEqualZeroAndOne(int arr[], int n) {
        Map<Integer,Integer> um = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (arr[i] == 0) ? -1 : arr[i];
            um.put(sum, um.get(sum)==null?1:um.get(sum)+1);
        }
        int count = 0;
        for (Map.Entry<Integer,Integer> itr : um.entrySet()) {
            if (itr.getValue() > 1)
                count += ((itr.getValue()* (itr.getValue()- 1)) / 2);
        }
        if (um.containsKey(0))
            count += um.get(0);
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {0,1,0,1};
        int n = arr.length;
        System.out.println("Count = " + countSubarrayWithEqualZeroAndOne(arr, n));
    }
}
