package Stack_Data_Structure;

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement_Right_Left {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ;i<n;i++){
            arr[i] = s.nextInt();
        }
        nextGreaterAlternative(arr);
        nextGreat(arr);
        nextGreaterElementToLeft(arr);


    }
    public static void nextGreaterAlternative(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] nextGreater = new int[n];
        st.push(0);
        for(int i=1;i<n;i++){
            while(!st.isEmpty() && arr[i] > arr[st.peek()]){
                nextGreater[st.peek()]=arr[i];
                st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            nextGreater[st.peek()]=-1;
            st.pop();
        }
        for(int i = 0;i<n;i++){
            System.out.print(nextGreater[i]+" ");
        }
        System.out.println();
    }
    public static void nextGreat(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] nextGreater = new int[n];
        st.push(arr[n-1]);
        nextGreater[n-1]=-1;
        for(int i = n-2;i>=0;i--){
            while (!st.isEmpty() && arr[i] >= st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                nextGreater[i]=-1;
            } else{
                nextGreater[i]=st.peek();
            }
            st.push(arr[i]);
        }
        for(int i = 0;i<n;i++){
            System.out.print(nextGreater[i]+" ");
        }
        System.out.println();
    }
    public static void nextGreaterElementToLeft(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] nextGreat = new int[n];
        st.push(arr[0]);
        nextGreat[0]=-1;
        for(int i = 1;i<n;i++){
            while (!st.isEmpty() && arr[i] >= st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                nextGreat[i]=-1;
            } else{
                nextGreat[i]=st.peek();
            }
            st.push(arr[i]);
        }
        for(int i = 0;i<n;i++){
            System.out.print(nextGreat[i]+" ");
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
