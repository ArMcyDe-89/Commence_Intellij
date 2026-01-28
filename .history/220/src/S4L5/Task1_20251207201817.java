//LAB TASK NO NEED TO SUBMIT
// Complete the inOrder method
public class Task1 {

    //======================TASK#1======================
    // This method takes only 1 parameter which is root
    // You'll traverse the tree in-order
    public static void inOrder( BTNode root ){
        Stack S = new Stack(); BTNode temp = null;
        BTNode R = root;


        // Todo
    }
    public static void left(BTNode left) {
        Stack S = new Stack();
        BTNode R = left;
        while (R!=null) {
            if(R.right !=null){
                S.push(R);
            }
            S.push(R);
            R=R.left;
        }
    }
    public static void right(BTNode right) {
        Stack S = new Stack();
        BTNode R = right;
        while (R!=null) {
            S.push(R);
            R=R.right;
        }
    }
    //==================================================

}
