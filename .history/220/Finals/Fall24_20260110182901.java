public class Fall24 {
    static String build_key(BTNode root){
        return keyHelp(root,0);
    }
    static String keyHelp(BTNode root, int lvl){
        if(root == null){return "";}
        if((lvl%2==0)&&root.left==null && root.right == null){return root.elem;}
        return keyHelp(root.left, lvl+1) + keyHelp(root.right, lvl+1);
    }
    static void cpu_scheduler(){

    }
    static class BTNode {
        String elem;
        BTNode left, right;

        public BTNode(String elem) {
            this.elem = elem;
        }
    }

    public static void main(String[] args) {
        // Constructing the Tree from the Sample Image
        // Level 0: U
        // Level 1: V, W
        // Level 2: X, Y, Z, I
        // Level 3: J, N, L, M
        // Level 4: K

        // We build from bottom-up for easier linking:

        // -- Right Side of the Tree (Root W) --
        // Leaves at Level 3
        BTNode l = new BTNode("L");
        BTNode m = new BTNode("M");
        
        // Leaves at Level 2
        BTNode i = new BTNode("I"); // Even Level Leaf
        
        // Node Z (Level 2) links to L and M
        BTNode z = new BTNode("Z", l, m);
        
        // Node W (Level 1) links to Z and I
        BTNode w = new BTNode("W", z, i);


        // -- Left Side of the Tree (Root V) --
        // Leaf at Level 4
        BTNode k = new BTNode("K", null, null); // Even Level Leaf
        
        // Node J (Level 3) links to K (Left child based on diagram)
        BTNode j = new BTNode("J", k, null);
        
        // Leaf at Level 3
        BTNode n = new BTNode("N", null, null);
        
        // Node X (Level 2) links to J and N
        BTNode x = new BTNode("X", j, n);
        
        // Leaf at Level 2
        BTNode y = new BTNode("Y", null, null); // Even Level Leaf
        
        // Node V (Level 1) links to X and Y
        BTNode v = new BTNode("V", x, y);


        // -- Root --
        BTNode root = new BTNode("U", v, w);

        System.out.println("--- Tree Key Generation ---");
        
        // Execute the function
        String result = build_key(root);
        
        System.out.println("Generated Key: " + result);

        // Verification
        // Expected leaves (Right to Left): I, M, L, Y, N, K
        // Leaves at Even Levels: I (Lvl 2), Y (Lvl 2), K (Lvl 4)
        // Expected Output: "IYK"
        
        if (result.equals("IYK")) {
            System.out.println("Status: CORRECT");
        } else {
            System.out.println("Status: WRONG (Expected IYK)");
        }
    }
}
