package Stack_Data_Structure;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class MergeOverlappingIntervals {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        for (int i = 0 ;i<n;i++){
            String line = br.readLine() ;
            arr[i][0] = Integer.parseInt(line.split(" ")[0]);
            arr[i][1] = Integer.parseInt(line.split(" ")[1]);
        }
        mergeOverLappingIntervals(arr);

    }
    public static void mergeOverLappingIntervals(int[][] arr){
        Pair[] pairs = new Pair[arr.length];
        for(int i =0;i<arr.length;i++){
            pairs[i] = new Pair(arr[i][0] , arr[i][1]);
        }
        Arrays.sort(pairs);
        Stack<Pair> st = new Stack<>();
        for(int i=0;i< pairs.length;i++){
            if(i == 0 ){
                st.push(pairs[i]);
            } else {
                Pair top = st.peek();
                if (pairs[i].start > top.end){
                    st.push(pairs[i]);
                }else {
                    top.end = Math.max(top.end,pairs[i].end);
                }
            }
        }
        Stack<Pair> result = new Stack<>();
        while(st.size() > 0 ){
            result.push(st.pop());
        }
        while(result.size() > 0){
            Pair p = result.pop();
            System.out.println(p.start +"->"+ p.end);
        }
    }


    public static class Pair implements Comparable<Pair>{
        int start ;
        int end ;
        Pair (int start, int end ){
            this.start = start;
            this.end = end  ;
        }
        // this > other return +ve
        // this = other return 0
        // this < other return -ve
        public int compareTo(Pair other){
            if(this.start != other.start){
                return this.start - other.start;
            } else {
                return this.end - other.end;
            }
        }
    }
}
/*
Input :
6
22 28
1 8
25 27
14 19
27 30
5 12
Output:
1->12
14->19
22->30
 */


