//LAB TASK NO NEED TO SUBMIT
// Complete the inOrder method
public class Task1 {

    //======================TASK#1======================
    // This method takes only 1 parameter which is root
    // You'll traverse the tree in-order
    public static void inOrder( BTNode root ){
        Stack S = new Stack(); Object temp = null;
        BTNode R = root;
        S.push(left(R));

        // while (!S.isEmpty()) {
        //     temp=S.pop();
        //     if (temp instanceof Stack) { Stack ss = (Stack) temp; 
        //         while (!ss.isEmpty()) { BTNode T = (BTNode)ss.pop();
        //             System.out.println(T.elem);
        //         }
        //     }else if (temp instanceof BTNode){ BTNode B = (BTNode)temp;
        //         System.out.println(B.elem);
        //     }            
        // }

        // Todo
    }
    public static void left(BTNode left, Stack st) {
        Stack S = st;
        BTNode R = left;
        while (R!=null) {
            if(R.right !=null){
                st.push(right(R.right));
            }
            S.push(R);
            R=R.left;
        }
        return S;
    }
    public static void right(BTNode right, Stack st) {
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
