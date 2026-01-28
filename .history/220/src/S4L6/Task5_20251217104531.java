//Assignment Task (must Submit)
// Complete the sumOfLeaves method
public class Task5 {

    //===================================TASK#5======================
    // This method takes only one parameter
    // it is root of the given tree
    // You can use extra helper private static methods as per need
    public static Integer mirrorSum( BSTNode root ){
        if (root.right!=null && root.left!=null) {
            return irrorSum(root.right)+mirrorSum(root.left);
        }
        //TO DO
        return root.elem; // remove this line
    }
    private static int helpSum(BSTNode N, BSTNode M) {
        int sum1,sum2;
        sum1 = N.left.elem + M.right.elem; sum2 = N.right.elem+M.left.elem;
        return;
    }
    //===============================================================


}
