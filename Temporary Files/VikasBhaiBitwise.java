import java.util.Scanner;

public class VikasBhaiBitwise {
    static String differentBitwiseOR(String[] strArray) {
        String s1 = strArray[0];
        String s2 = strArray[1];
        int n = s1.length();
        String str = "";
        for(int i = 0; i < n; i++) {
            if (s1.charAt(i) == '0' && s2.charAt(i) == '0') {
                str = str+'0';
            }
            if (s1.charAt(i) == '1' && s2.charAt(i) == '0') {
                str = str+'1';
            }
            if (s1.charAt(i) == '1' && s2.charAt(i) == '1') {
                str = str+'1';
            }
            if (s1.charAt(i) == '0' &&
                    s2.charAt(i) == '1') {
                str = str+'1';
            }
        }
        strArray[0] = str;
        return strArray[0];
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String S1 = s.next();
        String S2 = s.next();
        String[] strArray = new String[2];
        strArray[0] = S1;
        strArray[1] = S2;

        System.out.println(differentBitwiseOR(strArray));
    }
}
//00011
//01010
