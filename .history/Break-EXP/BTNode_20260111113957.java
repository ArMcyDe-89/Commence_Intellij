//DO NOT MAKE ANY CHANGES HERE
class BTNode {
    Object elem;
    BTNode left, right;

    public BTNode(Object elem) {
        this.elem = elem;
    }
    public static void inOrder( BTNode root ){

        if(root == null){
            return;
        }
        else{
            BTNode left = root.left; BTNode right = root.right;
            inOrder(left); System.out.print(root.elem+" "); inOrder(right);
        }

        // Todo
    }
    public static void PreOrder( BTNode root ){

        if(root == null){
            return;
        }
        else{
            BTNode left = root.left; BTNode right = root.right;
            System.out.print(root.elem+" ");  PreOrder(left); PreOrder(right);
        }

        // Todo
    }
    public static void PostOrder( BTNode root ){

        if(root == null){
            return;
        }
        else{
            BTNode left = root.left; BTNode right = root.right;
            PostOrder(left); PostOrder(right);  System.out.print(root.elem+" ");  
        }

        // Todo
    }
    public static int fibonacci(int n, int p1, int p2) {
        if (n==2) {
            return p2;
        }
        return fibonacci(n-1, p2, p1 + p2);
    }
        public static int fibonacciSum(int n, int p1, int p2) {
        if (n==2) {
            return p2;
        }
        return p2+fibonacciSum(n-1, p2, p1 + p2);
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
        if(R.equals(L)){return  R;}
        if(R.equals("No Path")){return root.elem+" "+L;}
        return root.elem+" "+R;
    }
        public static String findPath( BTNode root, int k ){
        String L = "", R = "";
        if (root == null) {
            return "No Path";
        }
        if ((int)root.elem == k) {
            return ""+k;
        }
        R = findPath(root.right, k); L = findPath(root.left, k);
        if(R.equals(L)){return  R;}
        if(R.equals("No Path")){return root.elem+" "+L;}
        return root.elem+" "+R;
    }
    public static int findDepth(BTNode root, int find, int level) {
        if (root == null) {
            return -1;
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