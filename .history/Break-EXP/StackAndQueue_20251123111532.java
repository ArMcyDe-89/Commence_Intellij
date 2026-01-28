import java.util.Stack;
import java.util.Queue;
public class StackAndQueue {
    public static void main(String[] args) {
        System.out.println("Is 'MADAM' a pali ? Ans: "+palindrome("MADAM"));
        System.out.println("Is 'CSE220' a pali ? Ans: "+palindrome("CSE220"));
        int [] sand = {1,0,0,0,1,1}; int [] stud = {1,1,1,0,0,1}; System.out.println(SandAndStud(sand, stud));
        System.out.println(NoRepeat("programmingisfun"));

    }
    public static int SandAndStud(int [] SA, int [] ST) {
        Stack <Integer> sand = new Stack<>(); for(int i =0;i<SA.length;i++){sand.push(SA[i]);}
        LinkedListQueue stud = new LinkedListQueue(); for(int i =0;i<ST.length;i++){stud.enqueue(SA[i]);}
        int count = 0;
        while(!sand.isEmpty()){
            if(sand.peek() == stud.peek()){sand.pop();stud.dequeue();}
            else{
                stud.enqueue(stud.dequeue());
                count++; if(count == (2*ST.length)){int hungry = 0;while(!stud.isEmpty()){stud.dequeue();hungry++;}return hungry;}
            }
        }return 0;
    }
    public static int NoRepeat(String line) {
        Stack S = new Stack(); int index = -1;
        for(int  i = 0; i<line.length();i++){
            if (S.isEmpty()){
                    S.push(line.charAt(i)); index = i;
                }
            for(int j=0;j<line.length();j++){ 
                    if ((char)S.peek() == (line.charAt(j))) {S.pop(); break;}
            }
        }if(!S.isEmpty()){return index;} return -1;
    }
    public static boolean palindrome(String S) {
        Stack <Character> pali = new Stack<Character>();
        for(int i = 0; i<S.length();i++){
            pali.push(S.charAt(i));
        }String back="";
        while(!pali.isEmpty()){back+=pali.pop();}
        if(back.equalsIgnoreCase(S)){System.out.println(true);return back.equalsIgnoreCase(S);}
        System.out.println(false);
        return back.equalsIgnoreCase(S);
    }
}
