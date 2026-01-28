import javax.swing.tree.BTNode;

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
    public void main(String[] args) {
        SensorDriver driver = new SensorDriver();

        // --- TEST CASE 1 ---
        // Tree Structure:
        //       15
        //      /  \
        //     5    25
        //    / \
        //   13  8
        // D = 7
        
        // Build Leaves first
        BTNode n13 = new BTNode(13, null, null);
        BTNode n8  = new BTNode(8, null, null);
        BTNode n25 = new BTNode(25, null, null);
        
        // Build Middle
        BTNode n5  = new BTNode(5, n13, n8);
        
        // Build Root
        BTNode root1 = new BTNode(15, n5, n25);

        System.out.println("--- Test Case 1 ---");
        int result1 = driver.faulty(root1, 7);
        System.out.println("Faulty Count: " + result1);
        System.out.println("Expected: 2"); 
        // Explanation: Node 15 is faulty (diff 10 with 5). Node 5 is faulty (diff 8 with 13).


        // --- TEST CASE 2 ---
        // Tree Structure:
        //       8
        //      / \
        //     6   9
        //    /
        //   7
        // D = 3
        
        BTNode n7 = new BTNode(7, null, null);
        BTNode n6 = new BTNode(6, n7, null);
        BTNode n9 = new BTNode(9, null, null);
        BTNode root2 = new BTNode(8, n6, n9);

        System.out.println("\n--- Test Case 2 ---");
        int result2 = driver.faulty(root2, 3);
        System.out.println("Faulty Count: " + result2);
        System.out.println("Expected: 0");
        // Explanation: |6-7|=1 (<=3), |8-6|=2 (<=3), |8-9|=1 (<=3). No faults.
    }
}
