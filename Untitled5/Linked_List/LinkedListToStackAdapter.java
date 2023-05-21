package Linked_List;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class LinkedListToStackAdapter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LLToStackAdapter st = new LLToStackAdapter();

        String str = br.readLine();
        while(str.equals("quit") == false){
            if(str.startsWith("push")){
                int val = Integer.parseInt(str.split(" ")[1]);
                st.push(val);
            } else if(str.startsWith("pop")){
                int val = st.pop();
                if(val != -1){
                    System.out.println(val);
                }
            } else if(str.startsWith("top")){
                int val = st.top();
                if(val != -1){
                    System.out.println(val);
                }
            } else if(str.startsWith("size")){
                System.out.println(st.size());
            }
            str = br.readLine();
        }
    }
    public static class LLToStackAdapter{
        LinkedList<Integer> list ;

        public LLToStackAdapter(){
            list = new LinkedList<>();
        }
        int size (){
            return list.size();
        }
        void push (int val){
            list.addFirst(val);
        }
        int pop (){
            if(size() == 0 ){
                System.out.println("Stack underflow");
                return -1;
            } else {
                return list.removeFirst();
            }
        }
        int top (){
            if(size() == 0 ){
                System.out.println("Stack underflow");
                return -1;
            } else {
                return list.getFirst();
            }
        }
    }
}
/*
Sample Input
push 10
push 20
push 5
push 8
push 2
push 4
push 11
top
size
pop
top
size
pop
top
size
pop
top
size
pop
top
size
pop
top
size
pop
top
size
pop
quit
Sample Output
11
7
11
4
6
4
2
 */
