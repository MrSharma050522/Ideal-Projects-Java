package Stack_Data_Structure;

import java.util.Stack;

public class StackJCF {
    public static void main(String[] args) {
        Stack<Integer> stac = new Stack<>();

        stac.push(1);
        stac.push(2);
        stac.push(5);
        stac.push(8);
        stac.push(0);
        stac.push(7);
        stac.push(9);
        System.out.println(stac.size());
        System.out.println(stac.isEmpty());
        System.out.println(stac.pop());
        System.out.println(stac.size());
        System.out.println(stac.isEmpty());

        while (! stac.isEmpty()){
            System.out.println(stac.peek() );
            stac.pop();
        }
    }
}
