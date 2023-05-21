package Recursion_Pepcoding;

import java.util.Scanner;

public class FloodFill {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0 ;i<n;i++){
            for(int j = 0 ;j<m;j++){
                arr[i][j]=s.nextInt();
            }
        }
        boolean[][] visited = new boolean[n][m];
        printFloodFill(arr, 0 , 0 , " ",visited);
    }

    public static void printFloodFill(int[][] arr, int i , int j , String str, boolean[][] visited){
        if(i < 0 || j < 0 || i == arr.length || j == arr[0].length || arr[i][j] == 1 || visited[i][j]){
            return;
        }
        if(i == arr.length-1 && j == arr[0].length-1){
            System.out.print(str+" ");
            return;
        }
        visited[i][j] = true;
        printFloodFill(arr, i-1,j,str+"T",visited);
        printFloodFill(arr, i,j-1,str+"L",visited);
        printFloodFill(arr, i+1,j,str+"D",visited);
        printFloodFill(arr, i,j+1,str+"R",visited);
        visited[i][j] = false;
    }
}
/*
Input :
4 3
0 1 1
0 0 1
1 0 0
0 1 0
Output :  DRDRD

Input :
6 7
0 1 0 0 0 0 0
0 1 0 1 1 1 0
0 0 0 0 0 0 0
1 0 1 1 0 1 1
1 0 1 1 0 1 1
1 0 0 0 0 0 0
Output : DDRDDDRRRRR  DDRRTTRRRRDDLLDDDRR  DDRRRRDDDRR
 */
