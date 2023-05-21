import java.util.Scanner;

public class PermutationOfNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String str = "";
        for(int i=1;i<=n;i++){
            str = str+i;
        }
        printPermutation(str,"");
    }
    public static void printPermutation(String str , String perm ){
        if(str.length() == 0 ){
            System.out.print(perm+" ");
            return;
        }
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            String rStr = str.substring(0,i)+ str.substring(i+1);
            printPermutation(rStr,perm+ch);
        }
    }
}
