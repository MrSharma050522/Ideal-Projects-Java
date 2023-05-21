package Stack_Data_Structure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class PostfixEvaluationAndConversion {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
        Stack<Integer> valueStack = new Stack<>();
        Stack<String> infixStack = new Stack<>();
        Stack<String> prefixStack = new Stack<>();
        for(int i =0;i<exp.length();i++){
            char ch = exp.charAt(i);
            if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                int v2 = valueStack.pop();
                int v1 = valueStack.pop();
                int val = operation(v1,v2,ch);
                valueStack.push(val);

                String iv2 = infixStack.pop();
                String iv1 = infixStack.pop();
                String ival = "("+iv1+ch+iv2+")";
                infixStack.push(ival);

                String prev2 = prefixStack.pop();
                String prev1 = prefixStack.pop();
                String preval = ch+prev1+prev2;
                prefixStack.push(preval);
            }else{
                valueStack.push(ch - '0');
                infixStack.push(ch+"");
                prefixStack.push(ch+"");

            }
        }
        System.out.println(valueStack.pop());
        System.out.println(infixStack.pop());
        System.out.println(prefixStack.pop());

    }
    public static int operation(int v1 , int v2, char operator){
        if(operator == '+'){
            return v1 + v2;
        } else if (operator == '-'){
            return v1 - v2;
        } else if (operator == '*'){
            return v1 * v2;
        } else {
            return v1 / v2;
        }
    }
}
//  Input : 264*8/+3-
// Output : 2
//          ((2+((6*4)/8))-3)
//          -+2/*6483