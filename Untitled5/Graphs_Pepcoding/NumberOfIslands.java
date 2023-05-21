package Graphs_Pepcoding;

import java.util.Scanner;

public class NumberOfIslands {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0 ;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = s.nextInt();
            }
        }

        boolean[][] visited = new boolean[m][n];
        int count = 0 ;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j] == 0 && !visited[i][j]){
                    drawTreeForComponent(arr,i,j,visited);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static void drawTreeForComponent(int[][] arr , int i, int j, boolean[][] visited){
        if(i< 0 || j< 0|| i >= arr.length || j>= arr[0].length || arr[i][j] == 1 || visited[i][j] == true){
            return;
        }

        visited[i][j] = true;
        drawTreeForComponent(arr,i-1,j,visited);
        drawTreeForComponent(arr,i,j+1,visited);
        drawTreeForComponent(arr,i+1,j,visited);
        drawTreeForComponent(arr,i,j-1,visited);
    }
}
/*
8
8
0 0 1 1 1 1 1 1
0 0 1 1 1 1 1 1
1 1 1 1 1 1 1 0
1 1 0 0 0 1 1 0
1 1 1 1 0 1 1 0
1 1 1 1 0 1 1 0
1 1 1 1 1 1 1 0
1 1 1 1 1 1 1 0
 */
