package AssignmentTask2;
import java.util.Queue;
import java.util.Stack;

public class StackAndQueueAssgnTaskTester {

    // You have to write this method
    // YOU MUST SUBMIT THIS METHOD
    // Hint: You need to traverse each characters of the String
    public static void evalMathExpression(String expression) {
        Stack <Object> S = new Stack <>();
        for(int i = 0; i<expression.length();i++){
            if(expression.charAt(i) == '(' || expression.charAt(i) == '{' || expression.charAt(i) == '['){
                S.push(expression.charAt(i)); 
            }
            else if(expression.charAt(i) == ')'){
                if(S.isEmpty() || '(' != (char)S.peek()){System.out.println("Invalid Expression"); return;}
                S.pop();
            }
            else if(expression.charAt(i) == '}'){
                if(S.isEmpty() || '{' != (char)S.peek()){System.out.println("Invalid Expression"); return;}
                S.pop();
            }
            else if(expression.charAt(i) == ']'){
                if(S.isEmpty() || '[' != (char)S.peek()){System.out.println("Invalid Expression"); return;}
                S.pop();
            }
        }
        if (S.isEmpty() == false) {
            System.out.println("Invalid Expression"); return;
        }
        LinkedListQueue Q = new LinkedListQueue();
        String sum = "";
        while(){
            
        }

    }
    public static void OpStack(Stack S,char C,String sum) {
        int power = checkPower(C);
            if(power<checkPower((char)S.peek())){
                sum+=(String) S.pop(); return;
            } S.push(C);
    }
    public static void checkOPs(Stack S, LinkedListQueue Q,char C) {
        if(S.isEmpty()){S.push(C);}
        else if(C == '^'|| C == '*' || C == '/' || C == '+' || C == '-'){
            int power = checkPower(C);
            if(power<checkPower((char)S.peek())){
                int res = Operation(Q, (char)S.pop());
                Q.enqueue(String.valueOf(res));
            } S.push(C);
        }        
    }
    public static int Operation (LinkedListQueue Q, char op) {
        int x = Integer.parseInt((String)Q.dequeue()); int y = Integer.parseInt((String)Q.dequeue());
        if(op == '^'){return (int)Math.pow(y, x);}
        else if(op == '*'){return x*y;} else if(op == '/'){return y/x;}
        else if(op == '-'){return y-x;}
        return x+y;
    }
    public static int checkPower(char C) {
        int power = 0;
        if(C =='^'){power = 3;} else if(C == '*' || C == '/'){power=2;} else{power = 1;}
        return power;
    }

    // DO NOT CHANGE ANYTHING IN THE DRIVER CODE
    public static void main(String[] args) {
        
        System.out.println("================ Test 01 ================");

        System.out.println("This should print:");
        System.out.println("Postfix: 3 5 2 8 - * +\nResult: -27");
        System.out.println("-----------------------------------------");
        System.out.println("Your Output:");
        evalMathExpression("3 + 5 * (2 - 8)");
        System.out.println("=========================================");

        System.out.println("================ Test 02 ================");

        System.out.println("This should print:");
        System.out.println("Invalid Expression");
        System.out.println("-----------------------------------------");
        System.out.println("Your Output:");
        evalMathExpression("(2 + 3)) * ((4 - 1)");
        System.out.println("=========================================");

        System.out.println("================ Test 03 ================");

        System.out.println("This should print:");
        System.out.println("Postfix: 7 6 5 2 ^ * 3 + + 4 2 / -\nResult: 158");
        System.out.println("-----------------------------------------");
        System.out.println("Your Output:");
        evalMathExpression("7 + (6 * 5^2 + 3) - (4 / 2)");
        System.out.println("=========================================");

        System.out.println("================ Test 04 ================");

        System.out.println("This should print:");
        System.out.println("Postfix: 10 2 + 6 * 3 /\nResult: 24");
        System.out.println("-----------------------------------------");
        System.out.println("Your Output:");
        evalMathExpression("(10 + 2) * 6 / 3");
        System.out.println("=========================================");

        System.out.println("================ Test 05 ================");

        System.out.println("This should print:");
        System.out.println("Invalid Expression");
        System.out.println("-----------------------------------------");
        System.out.println("Your Output:");
        evalMathExpression("[2 + 3) * (4 - (5 * 6))]");
        System.out.println("=========================================");

    }
}
