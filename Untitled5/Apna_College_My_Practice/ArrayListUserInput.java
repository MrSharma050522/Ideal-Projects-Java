package Apna_College_My_Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListUserInput {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        //System.out.println("Enter the input");
        Scanner s = new Scanner(System.in);


        while (s.hasNextInt())
        {
            int i = s.nextInt();
            if(i==-1) break;

            list.add(i);

        }
        System.out.println(list);
    }
}
