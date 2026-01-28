//LAB TASK NO NEED TO SUBMIT
// Complete the inOrder method
public class Task1 {

    //======================TASK#1======================
    // This method takes only 1 parameter which is root
    // You'll traverse the tree in-order
    public static void inOrder( BTNode root ){
        Stack S = new Stack(); BTNode temp = null;
        BTNode R = root;
        while (R!=null) {
            S.push(R);
            R=R.left;
        }
        while (!S.isEmpty()) {
            temp= (BTNode)S.pop();
            System.out.println(temp.elem); 
        }

        // Todo
    }
    public static void left(BTNode B) {
        Stack S = new Stack();
        BTNode R = root;
        while (R!=null) {
            S.push(R);
            R=R.left;
        }

    }
    //==================================================

}
