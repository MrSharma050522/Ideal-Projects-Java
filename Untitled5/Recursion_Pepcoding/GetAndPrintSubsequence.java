package Recursion_Pepcoding;

import java.util.ArrayList;

public class GetAndPrintSubsequence {
    public static void main(String[] args) {
//        String str = "hello ";
//        System.out.println(str);
//        for(int i =0;i<str.length();i++){
//            System.out.println(str.charAt(i));
//        }
//        System.out.println(str.substring(1));


//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        System.out.println(list+" "+ list.size());
//        for (int val:list){
//            System.out.println(val);
//        }
//        for (int i =0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
//        list.set(2,300);
//        System.out.println(list+" "+ list.size());
//        list.add(2,3000);
//        System.out.println(list+" "+ list.size());

        String str = "ABC";
        printSubsequence(str,0,"");
        ArrayList<String> res  = getSubsequence(str);
        System.out.println(res);


    }
    public static void printSubsequence(String str ,int i , String newstring){
        if (i == str.length()){
            System.out.print(newstring+" ");
            return;
        }
        char ch = str.charAt(i);
        printSubsequence(str,i+1,newstring+ch);
        printSubsequence(str,i+1,newstring);
    }
    public static ArrayList<String> getSubsequence(String str){
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = getSubsequence(ros);

        ArrayList<String> mres = new ArrayList<>();
        for(String rstr : rres){
            mres.add(""+rstr);
            mres.add(ch+rstr);
        }
        return mres;
    }
}
