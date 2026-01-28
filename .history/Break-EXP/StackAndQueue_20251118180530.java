import java.util.Stack;
public class StackAndQueue {
    public static void main(String[] args) {
        System.out.println("Is 'MADAM' a pali ? Ans: "+palindrome("MADAM"));
        System.out.println("Is 'CSE220' a pali ? Ans: "+palindrome("CSE220"));
    }
    public static boolean palindrome(String S) {
        Stack <Character> pali = new Stack<Character>();
        for(int i = 0; i<S.length();i++){
            pali.push(S.charAt(i));
        }String back="";
        while(!pali.isEmpty()){back+=pali.pop();} return back.equalsIgnoreCase(S);pali
    }
}
