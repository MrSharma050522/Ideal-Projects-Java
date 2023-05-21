package Apna_College_My_Practice;
import java.util.*;
public class AddingElementAt {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t >0){
            int n=sc.nextInt();
            int e=sc.nextInt();
            int [] a= new int[n+1];
            for(int i=0; i<n+1; i++) {
                a[i]=sc.nextInt();
            }
            int position = 3;
            for(int i = (n-1); i >= (position); i--) {
                a[i+1] = a[i];

            } a[position] = e;


            for(int i=0; i<n+1; i++) {
                System.out.print(" " + a[i]);
            }
            System.out.println();
        } t--;
    }
}
