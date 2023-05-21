package Stack_Data_Structure;

import java.util.Scanner;
import java.util.Stack;

public class NextSmallerElement_Right_Left {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i =0 ;i<n;i++){
            arr[i]=s.nextInt();
        }
        nextSmallerToRight(arr);
        nextSmallerToLeft(arr);
    }
    public static void nextSmallerToRight(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n  = arr.length;
        int[] prevSmall = new int[n];
        st.push(arr[n-1]);

        prevSmall[n-1]=-1;
        for(int i = n-2;i>=0;i--){
            while(!st.isEmpty() && arr[i] < st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                prevSmall[i]=-1;
            } else {
                prevSmall[i]=st.peek();
            }
            st.push(arr[i]);

        }

        for(int i = 0;i<n;i++){
            System.out.print(prevSmall[i]+" ");
        }
        System.out.println();
    }
    public static void nextSmallerToLeft(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n  = arr.length;
        int[] prevSmall = new int[n];
        st.push(0);
        prevSmall[0]=-1;
        for(int i = 1;i<n;i++){
            while (!st.isEmpty() && arr[i] < arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                prevSmall[i]=-1;
            } else{
                prevSmall[i]=arr[st.peek()];

                st.pop();
            }
            st.push(i);
        }
        for(int i = 0 ;i<n;i++){
            System.out.print(prevSmall[i]+" ");
        }
        System.out.println();
    }
}
/*
7
2 3 1 5 4 6 8
7
2 7 3 5 4 6 8
 */
