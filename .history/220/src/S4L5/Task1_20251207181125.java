//LAB TASK NO NEED TO SUBMIT
// Complete the inOrder method
public class Task1 {

    //======================TASK#1======================
    // This method takes only 1 parameter which is root
    // You'll traverse the tree in-order
    public static void inOrder( BTNode root ){
        Stack S = new Stack(); BTNode temp = null;
        BTNode R = root;
        while (R.left!=null) {
            S.push(R);
            R=R.left;
        }
        while (!S.isEmpty()) {
            System.out.println(S.peek().elem); temp=S.pop();
        }

        // Todo
    }
    public static void left(BTNod) {
        
    }
    //==================================================

}
