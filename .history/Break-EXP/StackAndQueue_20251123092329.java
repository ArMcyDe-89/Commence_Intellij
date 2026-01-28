import java.util.Stack;
import java.util.Queue;
public class StackAndQueue {
    public static void main(String[] args) {
        System.out.println("Is 'MADAM' a pali ? Ans: "+palindrome("MADAM"));
        System.out.println("Is 'CSE220' a pali ? Ans: "+palindrome("CSE220"));
        int [] sand = {0,1,0,1}; int [] stud = {1,1,0,0};

    }
    public static void SandAndStud(int [] SA, int [] ST) {
        Stack <Integer> sand = new Stack<>(); for(int i =0;i<SA.length;i++){sand.push(SA[i]);}
        Q
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
