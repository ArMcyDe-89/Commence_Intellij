public class QuizTwoD {
    static int findClosest(BSTNode root, int K){
        if(root == null){return Integer.MAX_VALUE;}
        int T = root.elem;
        int D1 = Math.abs(T-K), small = Integer.MAX_VALUE;
        if(root.left!=null){
            int l = root.left.elem, D2 = Math.abs(l-K);
            if(D2<D1){small=root.left.elem; D1 = D2;}
        }
        if(root.right!=null){
            int r  = root.right.elem, D3 = Math.abs(r-K);
            if(D3<D1){small = root.right.elem;D1=D3;}
        }
        int L = findClosest(root.left, K)
        return small;
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
