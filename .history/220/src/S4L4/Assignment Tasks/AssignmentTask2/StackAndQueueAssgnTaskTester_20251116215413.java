package AssignmentTask2;
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
                if ('(' == (char)S.peek()){
                    S.pop();
                }
            }
            else if(expression.charAt(i) == '}'){
                if(S.isEmpty() || '{' != (char)S.peek()){System.out.println("Invalid Expression"); return;}
                if ('{' == (char)S.peek()){
                    S.pop();
                }
            }
            else if(expression.charAt(i) == ']'){
                if(S.isEmpty() || '[' != (char)S.peek()){System.out.println("Invalid Expression"); return;}
                if ('[' == (char)S.peek()){
                    S.pop();
                }
            }
        }
        if (S.isEmpty() == false) {
            System.out.println("Invalid Expression"); return;
        }
        LinkedListQueue Q = new LinkedListQueue();
        for(int i = 0; i<expression.length();i++){
            if((int)expression.charAt(i)>=48 && (int)expression.charAt(i)<=57){
                Q.enqueue(expression.charAt(i));
            }
            else if(!((int)expression.charAt(i)>=48 && (int)expression.charAt(i)<=57)&& expression.charAt(i)!='(' && expression.charAt(i)!= ')'  && expression.charAt(i)!= '{'  && expression.charAt(i)!= '}'  && expression.charAt(i)!= '['  && expression.charAt(i)!= ']'){
                S.push(expression.charAt(i));
            }
        } 
        String sum = "";
        for(int i = 0; i<expression.length();i++){
            int power  = 0; char c = expression.charAt(i);
            if(c == '^'){power = 3;} else if (c == '*' || c =='/'){power=2;} else if(c == '+'||c== '-'){power = 1;}
            if (S.isEmpty() == true && (c == '^' || c == '*' || c =='/' || c == '+'||c== '-')){S.push(c);}
            else if( S.isEmpty() == false && (c == '^' || c == '*' || c =='/' || c == '+'||c== '-')){
                int pow = 0; char CH = (char)S.peek(); if(CH == '^'){pow = 3;} else if (CH == '*' || CH =='/'){pow=2;} else if(CH == '+'||CH== '-'){pow = 1;}
                if(power<=pow){Q.enqueue(S.pop());} S.push(c);
            }
            if(c =='(' || c =='{' || c =='['){S.push()}
        }
        while (Q.isEmpty() == false) {
            sum+=" "+Q.dequeue();
        }
        while (S.isEmpty() == false) {
            sum+=S.pop();
        }
        System.out.println("Postfix: "+sum);
        // You can create Stack and Queue object here to use
        // To Do

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
