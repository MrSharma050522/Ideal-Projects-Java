package Recursion;

import java.util.ArrayList;

public class Recursion3 {
    public static void main(String[] args) {
//        int n = 3;
//        ArrayList<Integer> subset = new ArrayList<>();
//        findSubsets(n,subset);





//        int n = 4;
//        System.out.println(callGuests(n));


//        int n =4, m =2;
//        System.out.println(placeTiles(n,m));


//        int n = 3;
//        int m = 3;
//        System.out.println( countPaths(0,0,n,m));


//       String str = "abc" ;
//       printPermutation(str,"");

    }


    
    //Q5. Subsets of a set.
    public static void printSubset(ArrayList<Integer> subset){
        for(int i=0 ; i < subset.size();i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void findSubsets (int n , ArrayList<Integer> subset){
        if(n==0){
            printSubset(subset);
            return;
        }
        // add hoga
        subset.add(n);
        findSubsets(n-1,subset);
        // add nahi hoga
        subset.remove(subset.size()-1);
        findSubsets(n-1,subset);
    }









    // Q4. Friends pairing problem
    public static int callGuests(int n ){
        if(n<=1){
            return 1;
        }
        // single
        int ways1 = callGuests(n-1);
        // pair
        int ways2 =(n-1)*callGuests(n-2);
        return ways1+ways2;
    }







   // Q3. Tiling problem
    public static int placeTiles(int n , int m ){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        // vertically
        int verticalPlacements = placeTiles(n-m,m);
        // horizontally
        int horizontallyPlacements = placeTiles(n-1,m);
        return verticalPlacements+horizontallyPlacements;
    }








 //   Q2. CountPathMaze
    public static int countPaths(int i , int j , int n , int m){
        if(i==n||j==m){
            return 0 ;
        }
        if(i==n-1&&j==m-1){
            return 1;
        }
        // move downwards
        int downPaths = countPaths(i+1,j,n,m);
        // move right
        int rightPaths = countPaths(i,j+1,n,m);
        return rightPaths+downPaths;
    }
    










      // Q1. Print all the permutations of a string.
    public static void printPermutation(String str, String permutation ){
        if(str.length()==0){
            System.out.println(permutation);
            return ;
        }
        for(int i = 0 ;i< str.length();i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            printPermutation(newStr,permutation+currChar);
        }
    }
}
