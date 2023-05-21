package Stack_Data_Structure;

import java.util.Scanner;
import java.util.Stack;

public class MaximumSlidingWindow {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int[] arr = new int[n];
        for(int i =0 ;i<n;i++){
            arr[i] = s.nextInt();
        }

        Stack<Integer> st = new Stack<>();
        int[] nge = new int[n];
        st.push(n-1);
        nge[n-1] = n;
        for(int i = n-2;i>=0;i--){
            while (!st.isEmpty() && arr[i] >= arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                nge[i]=n;
            } else {
                nge[i]=st.peek();
            }
            st.push(i);

        }
//        for(int i = 0 ;i<n;i++){
//            System.out.print(nge[i]+" ");
//        }
//        System.out.println();
        int j = 0 ;
        for(int i = 0 ;i<= n-k;i++){
            // enter the loop to find the maximum of window starting at i
            if(j < i ){
                j = i;
            }
            while (nge[j] < i+k){
                j = nge[j];
            }
            System.out.print(arr[j]+" ");
        }


    }
}
/*
Input:
17
4
2 9 3 8 1 7 12 6 14 4 32 0 7 19 8 12 6
Output:
9 9 8 12 12 14 14 32 32 32 32 19 19 19

*/
