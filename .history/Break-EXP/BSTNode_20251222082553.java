//DO NOT MAKE ANY CHANGES HERE
class BSTNode {
    Integer elem;
    BSTNode left, right;

    public BSTNode(Integer elem) {
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
    public static String findPath( BSTNode root, Integer key ){
        if (root == null) {
            return "No Path Found";
        }
        if (root.elem == key) {
            return ""+root.elem;
        }
        else if(root.elem > key){
            String R = findPath(root.left, key);
            if(R.equalsIgnoreCase("No Path Found")){return R;}
            return root.elem+" "+R;
        }
        else{
            String R = findPath(root.right, key);
            if(R.equalsIgnoreCase("No Path Found")){return R;}
            return root.elem+" "+R;
        }
        // TO DO
        //remove this line
    }
    public static int findDepth(BSTNode root, int find, int level) {
        if (root == null) {
            return 0;
        }
        if ((int)root.elem == find) {
            return level;
        }
        return findDepth(root.left, find, level+1) + findDepth(root.right, find, level+1);
    }
    public static boolean isSymmetric(BSTNode root) {

    }
    
    public static boolean isSymmetricHelper(BSTNode root) {

    }

}