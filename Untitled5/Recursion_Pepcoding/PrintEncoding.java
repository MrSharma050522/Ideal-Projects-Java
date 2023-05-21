package Recursion_Pepcoding;

import java.util.Scanner;

public class PrintEncoding {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        printEncoding(str,"");
    }
    public static void printEncoding(String str , String res ){
        if(str.length() == 0){
            System.out.print(res+" ");
        } else if (str.length() == 1){
            char ch = str.charAt(0);
            if(ch == '0'){
                return;
            }else {
                int chv = ch - '0';
                char code = (char)('a' + chv - 1);
                System.out.print(res+code +" ");
            }
        } else {
            char ch = str.charAt(0);
            String rStr = str.substring(1);

            if(ch == '0'){
                return;
            }else {
                int chv = ch - '0';
                char code = (char)('a' + chv - 1);
                printEncoding(rStr,res+code);
            }

            String ch12 = str.substring(0,2);
            String restStr = str.substring(2);

            int ch12v = Integer.parseInt(ch12);
            if (ch12v <= 26){
                char code = (char) ('a' +ch12v-1);
                printEncoding(restStr,res+code);
            }
        }
    }
}
// Input : 123 Output : abc aw lc
// Input : 12312 Output : abcab abcl awab awl lcab lcl
// Input : 655196 Output : feeaif feesf

