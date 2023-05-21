import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestPalindromeSubstring {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.print(longestSubstring(str, str.length()));
    }
    public static int longestSubstring(String s, int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int answer = 0;
        int mask = 0;
        map.put(mask, -1);
        for(int i = 0; i < n; i++) {
            int temp = (int)s.charAt(i) - 97;
            mask ^= (1 << temp);
            if (map.containsKey(mask)) {
                answer = Math.max(answer, i - map.get(mask));
            }
            else
                map.put(mask,i);
            for (int j = 0;j < 26; j++) {
                int mask2 = mask ^ (1 << j);
                if (map.containsKey(mask2)) {
                    answer = Math.max(answer, i - map.get(mask2));
                }
            }
        }
        return answer;
    }
}
