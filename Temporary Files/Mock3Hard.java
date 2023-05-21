import java.util.HashSet;
import java.util.Scanner;
//ABCDGH
//
//AEDFHR
public class Mock3Hard {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = s.next();
        String str2 = s.next();
        System.out.println(longestCommonSubstring(str1,str2,str1.length(),str2.length()));
        String str = "";
        for(Character ch : set){
            str = str+ch;
        }
        System.out.println(str);

    }
    static HashSet<Character> set = new HashSet<>();
    public static int longestCommonSubstring(String str1 , String str2, int m , int n ){
        if(m == 0 || n == 0){
            return 0;
        }
        if (str1.charAt(m-1) == str2.charAt(n-1)){
            set.add(str1.charAt(m-1));
            return longestCommonSubstring(str1,str2,m-1,n-1) +1 ;
        }
        return Math.max(longestCommonSubstring(str1,str2,m,n-1),longestCommonSubstring(str1,str2,m-1,n));

    }
}
//ABCBDAB BDCABA
