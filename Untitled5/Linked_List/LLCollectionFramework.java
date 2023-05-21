package Linked_List;

import java.util.LinkedList;

public class
LLCollectionFramework {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);

        list.addLast("list");
        list.addFirst("this");
        list.add("mine");

        System.out.println(list);

        System.out.println(list.size());
        for(int i = 0 ;i< list.size();i++){
            System.out.print(list.get(i) + "->");
        }
        System.out.println("null");

        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
    }
}
