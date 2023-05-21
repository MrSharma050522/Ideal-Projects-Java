package Apna_College_My_Practice;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayAndLinkedLists {
    public static void main(String args[]) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<Boolean> list3 = new ArrayList<Boolean>();

        //add elements
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(9);
        list.add(8);
        list.add(4);
        list.add(9);
        list.add(8);
        list.add(5);
        System.out.println(list);

        //to get an element
        int element = list.get(0); // 0 is the index
        System.out.println(element);

        //add element in between
        list.add(1,2); // 1 is the index and 2 is the element to be added
        System.out.println(list);

        //set element
        list.set(0,5);
        System.out.println(list);

        //delete elements
        list.remove(0); // 0 is the index
        System.out.println(list);

        //size of list
        int size = list.size();
        System.out.println(size);

        //Loops on lists
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        for(int i : list){
            System.out.print(i+" ");
        }
        System.out.println();

        //Sorting the list
        list.add(0);
        Collections.sort(list);
        System.out.println(list);
    }
    /*
        How the ArrayList works :
        The ArrayList class has a regular array inside it.
        When an element is added, it is placed into the array.
        If the array is not big enough, a new, larger array is created
        to replace the old one and the old one is removed.

        How the LinkedList works :
        The LinkedList stores its items in "containers."
        The list has a link to the first container and each container has a link to the next container in the list.
        To add an element to the list, the element is placed into a new container and
        that container is linked to one of the other containers in the list.

        When To Use :
        Use an ArrayList for storing and accessing data, and LinkedList to manipulate data.

        Method	Description	Try it
        addFirst()	                    Adds an item to the beginning of the list.
        addLast()	                    Add an item to the end of the list
        removeFirst()                  	Remove an item from the beginning of the list.
        removeLast()                   	Remove an item from the end of the list
        getFirst()	                    Get the item at the beginning of the list
        getLast()	                    Get the item at the end of the list

     */

}
