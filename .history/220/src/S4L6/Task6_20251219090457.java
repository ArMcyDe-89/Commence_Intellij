//Assignment Task (must Submit)
// Complete the isBST method
public class Task6 {

    //===================================TASK#6======================
    // This method takes only one parameter
    // it is root of the given tree
    // You can use extra helper private static methods as per need
    public static Boolean isBST( BSTNode root ){
        if(root.right==null && root.left == null){return true;}
        if(){return (root.right.elem>root.elem);}
        if(root.right==null){return (root.left.elem<root.elem);}
        if(root.left!=null && root.right!=null){return (root.right.elem>root.elem && root.left.elem<root.elem)?(isBST(root.right) && isBST(root.left)):false;}
    }
    //===============================================================


}
