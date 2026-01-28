//LAB TASK NO NEED TO SUBMIT
// Complete the inOrder method
public class Task1 {

    //======================TASK#1======================
    // This method takes only 1 parameter which is root
    // You'll traverse the tree in-order
    public static void inOrder( BTNode root ){
        Stack S = new Stack(); BTNode temp = null;
        BTNode R = root;
        S.push(left(R));
        while (!S.isEmpty()) {
            System.out.println(S.pop());
        }

        // Todo
    }
    public static Stack left(BTNode left) {
        Stack S = new Stack();
        BTNode R = left;
        while (R!=null) {
            if(R.right !=null){
                S.push(right(R.right));
            }
            S.push(R);
            R=R.left;
        }
        return S;
    }
    public static Stack right(BTNode right) {
        Stack S = new Stack();
        BTNode R = right;
        while (R!=null) {
            if(R.left !=null){
                S.push(left(R.left));
            }
            S.push(R);
            R=R.right;
        }
        return S;
    }
    //==================================================

}
