public class QuizTwoB {
    public Integer faulty(BTNode root, Integer D){
        if(root == null){ return  0;}
        if(root.left == null && root.right == null){return 0;}
        int count =0;
        if(root.left!=null && (Math.abs((int)root.elem - (int)root.left.elem)>D)){count++;}
        if(root.right!=null && (Math.abs((int)root.elem - (int)root.right.elem)>D)){count++;}
        //if(root.left == null || root.right == null){return  count +faulty(root.left, D) + faulty(root.right, D);}
        return  count +faulty(root.left, D) + faulty(root.right, D);

    }
    class BTNode {
        Object elem;
        BTNode left, right;

        public BTNode(Object elem) {
            this.elem = elem;
        }
    }
    
}
 class SensorDriver {

    // ==========================================
    // 1. YOUR SPECIFIC NODE CLASS
    // ==========================================
    static class BTNode {
        Object elem;
        BTNode left, right;

        public BTNode(Object elem) {
            this.elem = elem;
            this.left = null; 
            this.right = null;
        }
    }

    // ==========================================
    // 2. THE RECURSIVE SOLUTION
    // ==========================================
    // public int faulty(BTNode root, int D) {
    //     // Base Case: Empty node contributes 0 faults
    //     if (root == null) return 0;

    //     // Recursive Step: Get counts from subtrees first
    //     int leftCount = faulty(root.left, D);
    //     int rightCount = faulty(root.right, D);

    //     // Check if CURRENT node is faulty
    //     boolean isCurrentFaulty = false;
    //     int currentVal = (Integer) root.elem; // Cast Object to Integer

    //     // Check Left Child
    //     if (root.left != null) {
    //         int leftVal = (Integer) root.left.elem;
    //         if (Math.abs(currentVal - leftVal) > D) {
    //             isCurrentFaulty = true;
    //         }
    //     }

    //     // Check Right Child
    //     if (root.right != null) {
    //         int rightVal = (Integer) root.right.elem;
    //         if (Math.abs(currentVal - rightVal) > D) {
    //             isCurrentFaulty = true;
    //         }
    //     }

    //     // Combine results:
    //     // (1 if current is faulty, 0 otherwise) + left subtree count + right subtree count
    //     return (isCurrentFaulty ? 1 : 0) + leftCount + rightCount;
    // }

    // ==========================================
    // 3. MAIN METHOD (TESTING)
    // ==========================================
    public static void main(String[] args) {
        SensorDriver driver = new SensorDriver();

        // --- TEST CASE 1 ---
        // Tree: 15 -> (5 -> (13, 8), 25)
        // D = 7
        // Expected: 2 (Node 15 and Node 5 are faulty)

        // 1. Create leaves
        BTNode n13 = new BTNode(13);
        BTNode n8  = new BTNode(8);
        BTNode n25 = new BTNode(25);

        // 2. Create middle nodes
        BTNode n5  = new BTNode(5);
        n5.left = n13;
        n5.right = n8;

        // 3. Create root
        BTNode root1 = new BTNode(15);
        root1.left = n5;
        root1.right = n25;

        System.out.println("--- Test Case 1 ---");
        System.out.println("Result: " + QuizTwoB.faulty(root1));
        System.out.println("Expected: 2\n");


        // --- TEST CASE 2 ---
        // Tree: 8 -> (6 -> (7), 9)
        // D = 3
        // Expected: 0

        // 1. Create leaves
        BTNode n7 = new BTNode(7);
        BTNode n9 = new BTNode(9);

        // 2. Create middle
        BTNode n6 = new BTNode(6);
        n6.left = n7;

        // 3. Create root
        BTNode root2 = new BTNode(8);
        root2.left = n6;
        root2.right = n9;

        System.out.println("--- Test Case 2 ---");
        System.out.println("Result: " + faulty(root2, 3));
        System.out.println("Expected: 0");
    }
}
