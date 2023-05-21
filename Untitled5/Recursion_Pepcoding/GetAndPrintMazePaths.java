package Recursion_Pepcoding;

import java.util.ArrayList;
import java.util.Scanner;

public class GetAndPrintMazePaths {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
//        ArrayList<String> path = getMazePath(1,1,n,m);
//        System.out.println(path);
        printMazePaths(1,1,n,m,"");
    }
    public static ArrayList<String> getMazePath(int i,int j,int n , int m){
        if(i == n && j == m){
            ArrayList<String> res = new ArrayList<>();
            res.add("");
            return res;
        }
        ArrayList<String> horizontalPath = new ArrayList<>();
        ArrayList<String> verticalPath = new ArrayList<>();
        if(j < m ){
            horizontalPath = getMazePath(i,j+1,n,m);
        }
        if( i < n ){
            verticalPath = getMazePath(i+1,j,n,m);
        }

        ArrayList<String> paths = new ArrayList<>();
        for(String st : horizontalPath){
            paths.add("H"+st);
        }
        for (String st : verticalPath){
            paths.add("V"+st);
        }
        return paths;
    }
    public static void printMazePaths(int i , int j , int n , int m, String path){
        if(i == n && j ==m ){
            System.out.print(path+" ");
            return;
        }
        if (j< m ){
            printMazePaths(i, j+1,n,m,path+"H");
        }
        if(i < n ){
            printMazePaths(i+1,j,n,m,path+"V");
        }
    }
    public static void printMazePaths2(int i , int j , int n , int m, String path){
        if( i > n || j > m ){
            return;
        }
        if(i == n && j ==m ){
            System.out.print(path+" ");
            return;
        }
        printMazePaths(i, j+1,n,m,path+"H");
        printMazePaths(i+1,j,n,m,path+"V");
    }
}
