package Stack_Data_Structure;

import java.util.Scanner;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ;i<n;i++){
            arr[i] = s.nextInt();
        }
        span(arr);

    }
     public static void span (int[] arr){
        int[] span   = new int[arr.length];
        Stack<Integer>  st = new Stack<>();
        st.push(0);
        span[0]=1;
        for (int i = 1 ;i<arr.length;i++){
            while (!st.empty() && arr[i] > arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                span[i] = i +1;
            } else {
                span[i] = i - st.peek();
            }
            st.push(i);
        }
        for (int i = 0 ;i<span.length ;i++){
            System.out.print(span[i]+" ");
        }

     }
}
/*
9
2 5 9 3 1 12 6 8 7

Output :
1 2 3 1 1 6 1 2 1
 */
