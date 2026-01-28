//LAB TASK NO NEED TO SUBMIT
// Complete the inOrder method
public class Task1 {

    //======================TASK#1======================
    // This method takes only 1 parameter which is root
    // You'll traverse the tree in-order
    public static void inOrder( BTNode root ){

        if(root == null){
            return;
        }
        else{
            inOrder(root.right);
            inOrder(root.left);            
            System.out.println(root.elem);
        }
        // Stack S = new Stack(); Object temp = null;
        // BTNode R = root;
        // S.push(left(R));

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
    //==================================================

}
