public class QuizTwoE {

    // --- Provided Class ---
    static class BTNode {
        int elem;
        BTNode left, right;

        public BTNode(int elem) {
            this.elem = elem;
        }
    }

    // --- Solution Method ---
    public static void avoidMiddleNRight(BTNode root) {
        if (root == null) return;

        // --- PHASE 1: Print Left Boundary (Excluding the bottom-left leaf) ---
        BTNode current = root;
        
        // // Traverse down the left side
        // while (current != null) {
        //     // Stop if the current node is a leaf (it will be printed in Phase 2)
        //     if (current.left == null && current.right == null) {
        //         break;
        //     }

        //     // Print the boundary node
        //     System.out.print(current.elem + " ");

        //     // Move to the next left boundary node
        //     // Priority: Go Left. If Left is null, go Right.
        //     if (current.left != null) {
        //         current = current.left;
        //     } else {
        //         current = current.right;
        //     }

        while(current!=null){
            if(current.left == null && current.right==null){
                break;
            }
            System.out.println(current.elem+"  ");
            if(current.left!=null){current=current.left;}
        }
        current =root;
        
        // --- PHASE 2: Print All Leaves ---
        //printLeaves(root);
        helper(root);
    }

    static void helper(BTNode root){
        if(root == null){return;}
        if(root.left == null&&root.right ==null){System.out.println(root.elem);}
        helper(root.left); helper(root.right);
    }

    // --- Helper Function ---
    private static void printLeaves(BTNode node) {
        if (node == null) return;

        // If it's a leaf, print it
        if (node.left == null && node.right == null) {
            System.out.print(node.elem + " ");
            return;
        }

        // Recursively visit children
        printLeaves(node.left);
        printLeaves(node.right);
    }

    // --- Driver Code (Main Method) ---
    public static void main(String[] args) {
        
        // ==========================================
        // TEST CASE 1 (From Sample Given Tree 1)
        // ==========================================
        BTNode root1 = new BTNode(1);
        
        // Left Subtree
        root1.left = new BTNode(12);
        root1.left.left = new BTNode(4);
        root1.left.right = new BTNode(5);
        root1.left.left.left = new BTNode(6);
        root1.left.left.right = new BTNode(8);
        root1.left.right.right = new BTNode(3); // Node 3 is right child of 5

        // Right Subtree
        root1.right = new BTNode(13);
        root1.right.left = new BTNode(9);
        root1.right.right = new BTNode(7);

        System.out.print("Output 1: ");
        avoidMiddleNRight(root1);
        System.out.println("\nExpected: 1 12 4 6 8 3 9 7");
        System.out.println("-----------------------------");

        // ==========================================
        // TEST CASE 2 (From Sample Given Tree 2)
        // ==========================================
        BTNode root2 = new BTNode(10);

        // Left Subtree
        root2.left = new BTNode(5);
        root2.left.left = new BTNode(3);
        root2.left.right = new BTNode(7);
        root2.left.right.left = new BTNode(8);
        root2.left.right.right = new BTNode(9);

        // Right Subtree
        root2.right = new BTNode(15);
        root2.right.right = new BTNode(18);

        System.out.print("Output 2: ");
        avoidMiddleNRight(root2);
        System.out.println("\nExpected: 10 5 3 8 9 18");
    }
}
