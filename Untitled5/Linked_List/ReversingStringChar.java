package Linked_List;

import java.util.LinkedList;
import java.util.Scanner;

public class ReversingStringChar {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char[] arr = str.toCharArray();
        LinkedList<Character> ll = new LinkedList<>();
        for(char i : arr){
            ll.add(i);
        }
        LinkedList<Character> as = reverseLinkedList(ll);
        while(!as.isEmpty()){
            System.out.print(as.pop()+"->");
        }



    }
    public static LinkedList<Character> reverseLinkedList(LinkedList<Character> llist) {
        LinkedList<Character> revLinkedList = new LinkedList<>();
        for (int i = llist.size() - 1; i >= 0; i--) {

            // Append the elements in reverse order
            revLinkedList.add(llist.get(i));
        }
        // Return the reversed arraylist
        return revLinkedList;
    }

}
