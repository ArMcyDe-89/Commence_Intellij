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
        // for(int i = 0; i<expression.length();i++){
        //     char c = expression.charAt(i);
        //     if(c>='0' && c<='9'){Q.enqueue(c); continue;}
        //     int power  = 0;
        //     if(c == '^'){power = 3;} else if (c == '*' || c =='/'){power=2;} else if(c == '+'||c== '-'){power = 1;}
        //     if (S.isEmpty() == true && (c == '^' || c == '*' || c =='/' || c == '+'||c== '-')){S.push(c);}
        //     else if( S.isEmpty() == false && (c == '^' || c == '*' || c =='/' || c == '+'||c== '-')){
        //         int pow = 0; char CH = (char)S.peek(); if(CH == '^'){pow = 3;} else if (CH == '*' || CH =='/'){pow=2;} else if(CH == '+'||CH== '-'){pow = 1;}
        //         while(power<pow && ((char)S.peek() == '^' || (char)S.peek()=='*'||(char)S.peek() == '/'||(char)S.peek() == '+' || (char)S.peek() == '-')){
        //             if((char)S.peek()=='^'){pow = 3;} else if ((char)S.peek()=='*'||(char)S.peek()=='/'){pow=2;} else if((char)S.peek()== '+'||(char)S.peek()=='-'){pow = 1;}
        //             Q.enqueue(S.pop());
        //         } S.push(c);
        //     }
        //     if(c =='(' || c =='{' || c =='['){S.push(c); continue;}
        //     else if(c ==')' || c =='}' || c ==']'){
        //         while(S.isEmpty() == false && (char)S.peek()!='(' && (char)S.peek()!='{' && (char)S.peek()!='['){
        //             Q.enqueue(S.pop());
        //         } S.pop(); continue;
        //     }
        // }
        // while (Q.isEmpty() == false) {
        //     sum+=" "+Q.dequeue();
        // }
        // while (S.isEmpty() == false) {
        //     sum+=" "+S.pop();
        // }


        for(int i =0; i<expression.length();i++){ String add =""; int j = i;
        // if (expression.charAt(i) == '(' || expression.charAt(i) == '{' || expression.charAt(i) == '[') {
        //     while(expression.charAt(j) != ')' || expression.charAt(j) == '}' || expression.charAt(i) == ']'){
        //         if(){

        //         }
        //         else if(((int)expression.charAt(j)-'0')>=0){
        //             Q.enqueue();
        //         }
        //         j++;
        //     }
        // }
        char c = expression.charAt(i);
        if(c == '^'|| c == '*' || c == '/' || c == '+' || c == '-'){
            OpStack(S, c, sum);            
        }
            while(j<expression.length() && expression.charAt(j)!= ' ' && expression.charAt(j)<='9' && expression.charAt(j)>= '0'){
                add+= expression.charAt(j); i=++j;
            }if(add!=""){sum+=" "+add; Q.enqueue(add);}
        } Q.displayQueue();

        System.out.println("Postfix: "+sum);

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
