
import java.util.HashSet;

public class RemoveDuplicateFromStringArray {
    public static void main(String[] args) {
        String[] str= {"aabbbcca","abcbbcd","abcdcbcfv","","abcfdxcs","aabbaabbbaa"};
        String[] res=result(str);
        for(String s:res) {
            System.out.print(s+" ");
        }
    }
    public static String[] result(String[] str) {
        for(int i=0;i<str.length;i++) {
            HashSet<Character> map = new HashSet<>();
            StringBuilder ss= new StringBuilder();
            for(int j=0;j<str[i].length();j++) {
                if(map.contains(str[i].charAt(j))) continue;
                else {
                    map.add(str[i].charAt(j));
                    ss.append(str[i].charAt(j));
                }
            }
            str[i]= ss.toString();
        }
        return str;
    }

}
