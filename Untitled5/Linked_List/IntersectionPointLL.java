package Linked_List;

import Char_Linked_List.LLNode;
import Char_Linked_List.LLUtils;

public class IntersectionPointLL {
    public static void main(String[] args) {
        LLNode head1 = LLUtils.takeInput();
        LLNode head2 = LLUtils.takeInput();
        System.out.println(findIntersection(head1,head2));

    }
    public static int findIntersection(LLNode head1,LLNode head2){
        LLNode one = head1;
        LLNode two = head2;
        int delta = Math.abs(LLUtils.getLength(head1) - LLUtils.getLength(head2));
        if(LLUtils.getLength(head1) > LLUtils.getLength(head2)){
            for(int i = 0;i<delta;i++){
                one = one.next;
            }
        } else {
            for(int i = 0;i<delta;i++){
                two = two.next;
            }
        }
        while(one.data != two.data){
            one = one.next;
            two = two.next;
        }
        return one.data;

    }
}
