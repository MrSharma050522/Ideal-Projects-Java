package Recursion_Pepcoding;

import java.util.ArrayList;
import java.util.Scanner;

public class GetAndPrintMazePathVariableJump {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        ArrayList<String> path = getMazePathVariable(1,1,n,m);
        System.out.println(path);
        printMazePaths(1,1,n,m,"");
    }
    public static ArrayList<String> getMazePathVariable(int i , int j , int n , int m ){
        if( i == n && j == m ){
            ArrayList<String> res = new ArrayList<>();
            res.add("");
            return res;
        }

        ArrayList<String> paths = new ArrayList<>();
        for(int h = 1;h<=m-j;h++){
            ArrayList<String> horizontal = getMazePathVariable(i,j+h,n,m);
            for (String hPath : horizontal){
                paths.add("H"+h+hPath);
            }
        }
        for(int v = 1;v <= n-i;v++){
            ArrayList<String> vertical = getMazePathVariable(i+v,j,n,m);
            for (String vPath : vertical){
                paths.add("V"+v+vPath);
            }
        }
        for(int d = 1;d <= n-i && d <= m-j;d++){
            ArrayList<String> diagonal = getMazePathVariable(i+d,j+d,n,m);
            for (String dPath : diagonal){
                paths.add("D"+d+dPath);
            }
        }
        return paths;
    }
    public static void printMazePaths(int i , int j , int n , int m , String path){
        if (i == n && j == n){
            System.out.print(path+" ");
            return;
        }
        for(int h = 1 ; h <= m-j;h++){
            printMazePaths(i,j+h,n,m,path+"H"+h);
        }
        for(int v = 1 ; v <= n-i;v++){
            printMazePaths(i+v,j,n,m,path+"V"+v);
        }
        for(int d = 1 ; d <= n-i && d <= m-j;d++){
            printMazePaths(i+d,j+d,n,m,path+"D"+d);
        }
    }
}
