public class Summer25 {
    public static String findPath(BTNode root, int [] seq){
        return helper(root, seq,0);
    }
    public static String helper(BTNode root, int []seq, int i){
        if){}
        if(root == null && i == seq.length){return "ESCAPED";}
        if(seq[i] == (int)root.elem){return helper(root.left, seq, i+1)+helper(root.right, seq, i+1);}
        return "";
    }
    static class BTNode {
        Object elem;
        BTNode left, right;

        public BTNode(Object elem) {
            this.elem = elem;
        }
    }
    public static void main(String[] args) {
        // 1. Build the Tree shown in the image
        /*
                  1
                /   \
               0     1
              / \   / \
             1   0 0   1
            /
           1 (Leaf needed for "ESCAPED" case)
        */
        
        // Leaf nodes (Level 3)
        BTNode n1_leaf = new BTNode(1);
        BTNode n0_leaf = new BTNode(0);
        
        // Level 2 nodes
        BTNode n1_L_L = new BTNode(1); n1_L_L.left = n1_leaf; // This path makes 1-0-1-1 work
        BTNode n0_L_R = new BTNode(0); // Leaf
        
        BTNode n0_R_L = new BTNode(0); 
        n0_R_L.left = new BTNode(1); // Give it a child so 1-1-0 ends at a NON-LEAF
        
        BTNode n1_R_R = new BTNode(1); // Leaf

        // Level 1 nodes
        BTNode n0_L = new BTNode(0);
        n0_L.left = n1_L_L;
        n0_L.right = n0_L_R;

        BTNode n1_R = new BTNode(1);
        n1_R.left = n0_R_L;
        n1_R.right = n1_R_R;

        // Root
        BTNode root = new BTNode(1);
        root.left = n0_L;
        root.right = n1_R;

        // 2. Run Test Cases
        System.out.println("--- Maze Game Simulation ---");

        // Case 1: ESCAPED
        int[] seq1 = {1, 0, 1, 1};
        System.out.println("Seq {1, 0, 1, 1}: " + findPath(root, seq1) + " (Expected: ESCAPED)");

        // Case 2: TRAPPED
        int[] seq2 = {1, 1, 0};
        System.out.println("Seq {1, 1, 0}   : " + findPath(root, seq2) + " (Expected: TRAPPED)");

        // Case 3: LOST
        int[] seq3 = {1, 0, 0, 1};
        System.out.println("Seq {1, 0, 0, 1}: " + findPath(root, seq3) + " (Expected: LOST)");
    }
}
