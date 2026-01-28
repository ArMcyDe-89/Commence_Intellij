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
    public static void fibonacci(int n) {
        
    }
}