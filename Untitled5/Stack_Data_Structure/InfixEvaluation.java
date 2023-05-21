package Stack_Data_Structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
// Input is like : 2+6*4/8-3
// Output is : 2
/*
here only four operators  are used + , _ , * and /
- and + have same priority and
 * and / have same priority
 out these two * and / have more priority than + and -
if there comes two operator of same priority then left most is given high priority
 */
public class InfixEvaluation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        Stack <Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for(int i =  0;i<exp.length();i++){
            char ch = exp.charAt(i);
            if(ch == '('){
                operators.push(ch);
            } else if (Character.isDigit(ch)){
                operands.push(ch - '0'); // char to int
            } else if (ch == ')'){
                while (operators.peek() != '('){
                    char optor = operators.pop();
                    int v2 = operands.pop();
                    int v1 = operands.pop();

                    int opv = operation(v1,v2,optor);
                    operands.push(opv);
                }
                operators.pop();
            } else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                // ch is wanting higher priority operators to solve first
                while (operators.size() > 0 && operators.peek() != '(' && precedence(ch) <= precedence(operators.peek())){
                    char optor = operators.pop();
                    int v2 = operands.pop();
                    int v1 = operands.pop();

                    int opv = operation(v1,v2,optor);
                    operands.push(opv);
                }
                // ch is pushing itself now
                operators.push(ch);
            }
        }
        while (operators.size() != 0){
            char optor = operators.pop();
            int v2 = operands.pop();
            int v1 = operands.pop();

            int opv = operation(v1,v2,optor);
            operands.push(opv);
        }
        System.out.println(operands.peek());
    }
    public static int precedence(char operator ){
        if(operator == '+'){
            return 1;
        } else if (operator == '-'){
            return 1;
        } else if (operator == '*'){
            return 2;
        } else {
            return 2;
        }
    }
    public static int operation (int v1, int v2 , char operator){
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
