
import java.util.HashSet;
import java.util.Scanner;

public class SachinMeriJaan {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = "abcabcbb";
        HashSet<Character> set = new HashSet<>();
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            set.add(ch);
        }

        StringBuilder shr = new StringBuilder();
        for(Character ch : set){
            shr.append(ch);
        }
        System.out.println(shr);
        System.out.println(shr.length());
    }
}
