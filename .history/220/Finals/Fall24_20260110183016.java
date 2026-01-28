public class Fall24 {
    static String build_key(BTNode root){
        return keyHelp(root,0);
    }
    static String keyHelp(BTNode root, int lvl){
        if(root == null){return "";}
        if((lvl%2==0)&&root.left==null && root.right == null){return root.elem;}
        return keyHelp(root.right, lvl+1) + keyHelp(root.left, lvl+1);
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

    // --- DRIVER / MAIN METHOD ---
    public static void main(String[] args) {
        // Constructing the Tree from the Sample Image
        // Level 0: U
        // Level 1: V, W
        // Level 2: X, Y, Z, I
        // Level 3: J, N, L, M
        // Level 4: K

        // 1. Create all nodes
        BTNode u = new BTNode("U");
        BTNode v = new BTNode("V");
        BTNode w = new BTNode("W");
        BTNode x = new BTNode("X");
        BTNode y = new BTNode("Y");
        BTNode z = new BTNode("Z");
        BTNode i = new BTNode("I");
        BTNode j = new BTNode("J");
        BTNode n = new BTNode("N");
        BTNode l = new BTNode("L");
        BTNode m = new BTNode("M");
        BTNode k = new BTNode("K");

        // 2. Link them manually (since constructor only takes elem)
        
        // Root links
        u.left = v;
        u.right = w;

        // Level 1 links
        v.left = x;
        v.right = y;
        w.left = z;
        w.right = i;

        // Level 2 links
        x.left = j;
        x.right = n;
        z.left = l;
        z.right = m;
        // y and i are leaves at Level 2

        // Level 3 links
        j.left = k; 
        // n, l, m are leaves at Level 3
        
        // k is a leaf at Level 4

        // --- RUN TEST ---
        System.out.println("--- Tree Key Generation ---");
        String result = build_key(u);
        System.out.println("Generated Key: " + result);

        // Expected Logic:
        // Leaves (Right-to-Left): I(Lvl 2), M(Lvl 3), L(Lvl 3), Y(Lvl 2), N(Lvl 3), K(Lvl 4)
        // Even Levels Only: I, Y, K
        if (result.equals("IYK")) {
            System.out.println("Status: CORRECT");
        } else {
            System.out.println("Status: WRONG (Expected IYK)");
        }
    }
}
