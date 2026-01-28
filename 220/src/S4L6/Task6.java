//Assignment Task (must Submit)
// Complete the isBST method
public class Task6 {

    //===================================TASK#6======================
    // This method takes only one parameter
    // it is root of the given tree
    // You can use extra helper private static methods as per need
    public static Boolean isBST( BSTNode root ){ //fails in a case
        if(root.right==null && root.left == null){return true;}
        if(root.left!=null && root.right!=null){return (root.right.elem>root.elem && root.left.elem<root.elem)?(isBST(root.right) && isBST(root.left)):false;}
        if(root.right==null){return (root.left.elem<root.elem);} return  root.right.elem>root.elem;
    }
    //===============================================================


}
