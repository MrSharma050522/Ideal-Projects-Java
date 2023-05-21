package Stack_Data_Structure;

import java.util.Scanner;
import java.util.Stack;

// 6 2 5 4 5 1 6
public class LargestAreaHistogram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i= 0;i<n;i++){
            arr[i]= s.nextInt();
        }

        int[] rb = new int[n]; // Next smaller element on the right
        Stack <Integer> strb = new Stack<>();
        strb.push(n-1);
        rb[n-1] = n ;
        for(int i = n-2;i>=0;i--){
            while (!strb.isEmpty() && arr[i] <= arr[strb.peek()]){
                strb.pop();
            }
            if(strb.isEmpty()){
                rb[i] = n;
            } else {
                rb[i] = strb.peek();
            }
            strb.push(i);
        }

        int[] lb = new int[n];// next smaller element on the left
        Stack <Integer> stlb = new Stack<>();
        stlb.push(0);
        lb[0] = -1 ;
        for(int i = 1;i<n;i++){
            while (!stlb.isEmpty() && arr[i] <= arr[stlb.peek()]){
                stlb.pop();
            }
            if(stlb.isEmpty()){
                lb[i] = -1;
            } else {
                lb[i] = stlb.peek();
            }
            stlb.push(i);
        }


        int maxArea = 0;
        for(int i = 0 ;i<n;i++){
            int width = rb[i]-lb[i]-1;
            int area = arr[i] * width;
            if(area > maxArea){
                maxArea = area;
            }
        }
        System.out.println(maxArea);

    }


}
