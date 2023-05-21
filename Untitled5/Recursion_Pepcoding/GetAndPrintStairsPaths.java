package Recursion_Pepcoding;

import java.util.ArrayList;
import java.util.Scanner;

public class GetAndPrintStairsPaths {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
//        ArrayList<String> path = getStairPaths(n);
//        System.out.println(path);
        printStairPaths(n,"");
    }
    public static ArrayList<String> getStairPaths(int n ){
        if(n==0){
            ArrayList<String> res = new ArrayList<>();
            res.add("");
            return res;
        } else if(n < 0 ){
            ArrayList<String> res = new ArrayList<>();
            return res;
        }

        ArrayList<String> path1 = getStairPaths(n-1);
        ArrayList<String> path2 = getStairPaths(n-2);
        ArrayList<String> path3 = getStairPaths(n-3);

        ArrayList<String> paths = new ArrayList<>();
        for (String path : path1){
            paths.add(1+path);
        }
        for (String path : path2){
            paths.add(2+path);
        }
        for (String path : path3){
            paths.add(3+path);
        }
        return paths;
    }
    public static void printStairPaths(int n , String path){
        if(n < 0 ){
            return;
        }
        if (n == 0 ){
            System.out.print(path+" ");
            return;
        }
        printStairPaths(n-1,path+"1");
        printStairPaths(n-2,path+"2");
        printStairPaths(n-3,path+"3");
    }
}
