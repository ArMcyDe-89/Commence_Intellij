//DO NOT MAKE ANY CHANGES HERE
class BTNode {
    Object elem;
    BTNode left, right;

    public BTNode(Object elem) {
        this.elem = elem;
    }
    public static String findPath( BTNode root, BTNode x ){
        String L = "", R = "";
        if (root == null) {
            return "No Path";
        }
        if (root.elem == x.elem) {
            return ""+x.elem;
        }
        R = findPath(root.right, x); L = findPath(root.left, x);
        if(){}
        return root.elem+" "+findPath(root.left, x)+findPath(root.right, x);
    }
    public static int findDepth(BTNode root, int find, int level) {
        if (root == null) {
            return 0;
        }
        if ((int)root.elem == find) {
            return level;
        }
        return findDepth(root.left, find, level+1) + findDepth(root.right, find, level+1);
    }
    public static boolean FullTree(BTNode root) {
        if(root == null){return true;}
        if(root.left == null && root.right == null){
            return true;
        }
        if(root.left != null && root.right != null){
            return FullTree(root.left) && FullTree(root.right);
        }
        return false;
    }
    public static boolean CompleteBinary(BTNode root) { //Not complete
        if(root == null){return true;}
        if (root.left != null && root.right==null) {
            return true;
        }
        if(root.left!=null && root.right!=null){
            return CompleteBinary(root.left) && CompleteBinary(root.right);
        }
        return false;
    }
}