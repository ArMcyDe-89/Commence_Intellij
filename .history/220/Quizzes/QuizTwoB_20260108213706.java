public class QuizTwoB {

    // Your provided Node class
    class BTNode {
        Object elem;
        BTNode left, right;

        public BTNode(Object elem) {
            this.elem = elem;
        }
    }

    // --- PASTE YOUR METHOD HERE ---
    public Integer faulty(BTNode root, Integer D){
        if(root == null){ return  0;}
        if(root.left == null && root.right == null){return 0;}
        int count =0;
        if((root.left!=null && (Math.abs((int)root.elem - (int)root.left.elem)>D)) || (root.right!=null && (Math.abs((int)root.elem - (int)root.right.elem)>D))){
            count++;
        }
        //if(root.left == null || root.right == null){return  count +faulty(root.left, D) + faulty(root.right, D);}
        return  count +faulty(root.left, D) + faulty(root.right, D);

    }

    // --- MAIN METHOD FOR TESTING ---
    public void main(String[] args) {
        Q driver = new SensorDriver();

        // TEST CASE 1 from image
        // Tree: 15 -> (5 -> (13, 8), 25)
        BTNode n13 = new BTNode(13);
        BTNode n8  = new BTNode(8);
        BTNode n5  = new BTNode(5); n5.left = n13; n5.right = n8;
        BTNode n25 = new BTNode(25);
        BTNode root1 = new BTNode(15); root1.left = n5; root1.right = n25;

        System.out.println("Test Case 1 (D=7): " + driver.faulty(root1, 7));
        System.out.println("Expected: 2");

        // TEST CASE 2 from image
        // Tree: 8 -> (6 -> (7), 9)
        BTNode n7 = new BTNode(7);
        BTNode n6 = new BTNode(6); n6.left = n7;
        BTNode n9 = new BTNode(9);
        BTNode root2 = new BTNode(8); root2.left = n6; root2.right = n9;

        System.out.println("\nTest Case 2 (D=3): " + driver.faulty(root2, 3));
        System.out.println("Expected: 0");
    }
}
 