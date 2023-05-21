package Stack_Data_Structure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class CelebrityProblem {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int i =0 ;i<n;i++){
            String line = br.readLine();
            for (int j = 0 ;j<n;j++){
                arr[i][j] = line.charAt(j) - '0';
            }
        }
        findCelebrity(arr);
    }
    public static void findCelebrity(int[][] arr){
        //If celebrity is there print it's index (not position) , if there
        Stack<Integer> st = new Stack<>();
        for (int i = 0 ;i<arr.length;i++){
            st.push(i);
        }
        while (st.size() >= 2){
            int i = st.pop();
            int j = st.pop();

            if (arr[i][j] == 1){
                // if i knows j  ->  i is not a celebrity
                st.push(j);
            }else {
                // if i does not know j -> is not a  celebrity
                st.push(i);
            }
        }
        int potential = st.pop();
        for (int i = 0 ;i< arr.length;i++){
            if(i != potential){
                if (arr[i][potential] == 0 || arr[potential][i] == 1){
                    System.out.println("NO Celebrity found");
                    return;
                }
            }
        }
        System.out.println(potential);
    }
}
/*
4
0000
1011
1101
1110

4
0111
1011
0000
0010

4
0111
1011
0001
0000
 */
