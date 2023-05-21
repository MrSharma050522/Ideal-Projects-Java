package Stack_Data_Structure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

/*
a+b -> Infix
ab+ -> Postfix
+ab -> Prefix
 */
public class InfixConversions {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
        Stack<Character> operator = new Stack<>();
        Stack<String> prefix = new Stack<>();
        Stack<String> postfix = new Stack<>();
        for(int i = 0 ;i<exp.length();i++){
            char ch = exp.charAt(i);
            if(ch=='('){
                operator.push(ch);
            }else if((ch >= '0' && ch <='9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
                prefix.push(ch+"");
                postfix.push(ch+"");
            }else if(ch == ')'){
                while (operator.peek() != '('){
                    conversionProcess(operator,prefix,postfix);
                }
                operator.pop();
            }else if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                while (operator.size() > 0 && operator.peek() != '(' && precedence(ch) <= precedence(operator.peek())){
                    conversionProcess(operator,prefix,postfix);
                }
                operator.push(ch);
            }
        }
        while (operator.size() > 0){
            conversionProcess(operator,prefix,postfix);
        }
        System.out.println("Postfix : " + postfix.peek());
        System.out.println("Prefix : " +prefix.peek());
    }
    public static void conversionProcess(Stack<Character> operator , Stack<String> prefix, Stack<String> postfix){
        char opera = operator.pop();

        String postV2 = postfix.pop();
        String postV1 = postfix.pop();
        String postV = postV1 + postV2 + opera;
        postfix.push(postV);

        String preV2 = prefix.pop();
        String preV1 = prefix.pop();
        String preV = opera + preV1 + preV2 ;
        prefix.push(preV);
    }


    public static int precedence(char operator){
        if(operator == '+' || operator == '-'){
            return 1;
        } else if(operator == '*' || operator == '/'){
            return 2;
        } else {
            return 0;
        }
    }
}
//264*8/+3-
// a*(b-c)/d+e
