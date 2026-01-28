public class QuizTwoD {
    static int findClosest(BSTNode root, int K){
        if(root == null){return 0;}
        int close = Math.abs(root.elem-K), l = findClosest(root.left, K), r = findClosest(root.right, K), L = Math.abs(l-K), R = Math.abs(r-K);
        if(close<L && close<R){return root.elem;} if(close<L){return root.left.elem;} if(close<R){return root.right.elem;}
        if(close == L)
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
