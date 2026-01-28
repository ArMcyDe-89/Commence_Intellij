//Assignment Task (must Submit)
// Complete the sumOfLeaves method
public class Task5 {

    //===================================TASK#5======================
    // This method takes only one parameter
    // it is root of the given tree
    // You can use extra helper private static methods as per need
    public static Integer mirrorSum( BSTNode root ){
        return helpSum(root.right,root.left);
        //TO DO
        // remove this line
    }
    private static int helpSum(BSTNode N, BSTNode M) {
        if (N==null || M == null) {
            return 0;
        }
        
    }
    //===============================================================


}
