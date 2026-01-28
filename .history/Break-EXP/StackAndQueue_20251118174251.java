public class StackAndQueue {
    public static void main(String[] args) {
        
    }
    public static boolean palindrome(String S) {
        Stack pali = new Stack();
        for(int i = 0; i<S.length();i++){
            pali.push(S.charAt(i));
        }String back="";
        for(int i =0; i<S.length();i++){back+=pali.pop();} return back.
    }
}
