public class QuizTwoD {
    // static int findClosest(BSTNode root, int K){
    //     return closesthelper(root, K, Integer.MAX_VALUE);
    // }
    // static int closesthelper(BSTNode root, int K, int D){
    //     if(root == null){return Integer.MAX_VALUE;}
    //     int close = Math.abs(root.elem - K); if(close<Math.abs(D-K)){D = root.elem;}
    //     int l = closesthelper(root.left, K, D), r= closesthelper(root.right, K, D);
    //     if(l<Math.abs(D-K)){D = l;} if(r<Math.abs(D-K)){D=r;}
    //     return D;
    // }
    public static  int findClosest(BSTNode root, int K) {
        int close = root.elem; BSTNode current = root;
        int closeDIff = Math.abs(K-close), currDIFF = Math.abs(K-current.elem);
        while(current!=null){
            if(currDIFF<closeDIff){

            }
            if (K>) {
                
            }
        }
    }
    static class BSTNode {
        Integer elem;
        BSTNode left, right;
        public BSTNode() {
        }
        public BSTNode(Integer elem) {
            this.elem = elem;
        }
    }

    // --- Driver Code ---
    public static void main(String[] args) {
        // 1. Constructing the Sample Tree from the image
        //          9
        //        /   \
        //       4     17
        //      / \      \
        //     3   6     22
        //        / \    /
        //       5   7  20

        BSTNode root = new BSTNode(9);
        
        // Left Subtree
        root.left = new BSTNode(4);
        root.left.left = new BSTNode(3);
        root.left.right = new BSTNode(6);
        root.left.right.left = new BSTNode(5);
        root.left.right.right = new BSTNode(7);
        
        // Right Subtree
        root.right = new BSTNode(17);
        root.right.right = new BSTNode(22);
        root.right.right.left = new BSTNode(20);

        // 2. Test Case
        int K = 18;
        System.out.println("Target K: " + K);
        
        // 3. Execute Function
        int result = findClosest(root, K);
        
        // 4. Output Result
        System.out.println("Closest value: " + result); 
        // Expected Output: 17
    }
}
