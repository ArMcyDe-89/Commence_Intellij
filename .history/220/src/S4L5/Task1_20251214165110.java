//LAB TASK NO NEED TO SUBMIT
// Complete the inOrder method
public class Task1 {

    cd /home/sseeker/Commence_Intellij/220/src/S4L5
    javac Task1.java
    // This method takes only 1 parameter which is root
    // You'll traverse the tree in-order
    public static void inOrder( BTNode root ){

        if(root == null){
            return;
        }
        else{
            BTNode left = root.left; BTNode right = root.right;
            inOrder(left); System.out.println(root.elem); inOrder(right);
        }

        // Todo
    }
    //==================================================

}
