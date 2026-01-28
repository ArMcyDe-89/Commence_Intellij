// THIS CLASS IS FOR PRINTING THE BINARY TREE ONLY
// source: https://stackoverflow.com/questions/4965335/how-to-print-binary-tree-diagram-in-java
// This is a slightly modified version of the source to accomodate the lab tasks
// !!!!!!! DO NOT TOUCH THIS FILE AT ALL !!!!!!!
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

class BTPrinter {


    public static void printNode(BTNode root) {
        if (root==null)
            System.out.println("null");
        else {
            int maxLevel = BTPrinter.maxLevel(root);
            printNodeInternal(Collections.singletonList(root), 1, maxLevel);
        }
    }

    private static void printNodeInternal(List<BTNode> nodes, int level, int maxLevel) {
        if (nodes.isEmpty() || BTPrinter.isAllElementsNull(nodes))
            return;

        int floor = maxLevel - level;
        int endgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
        int firstSpaces = (int) Math.pow(2, (floor)) - 1;
        int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

        BTPrinter.printWhitespaces(firstSpaces);

        List<BTNode> newNodes = new ArrayList<BTNode>();
        for (BTNode node : nodes) {
            if (node != null) {
                System.out.print(node.elem);
                newNodes.add(node.left);
                newNodes.add(node.right);
            } else {
                newNodes.add(null);
                newNodes.add(null);
                System.out.print(" ");
            }

            BTPrinter.printWhitespaces(betweenSpaces);
        }
        System.out.println("");

        for (int i = 1; i <= endgeLines; i++) {
            for (int j = 0; j < nodes.size(); j++) {
                BTPrinter.printWhitespaces(firstSpaces - i);
                if (nodes.get(j) == null) {
                    BTPrinter.printWhitespaces(endgeLines + endgeLines + i + 1);
                    continue;
                }

                if (nodes.get(j).left != null){
                    int elemLength = String.valueOf(nodes.get(j).left.elem).length();
                    if( elemLength==1 ) System.out.print("/");
                    else System.out.print(" /");
                }
                else
                    BTPrinter.printWhitespaces(1);

                BTPrinter.printWhitespaces(i + i - 1);

                if (nodes.get(j).right != null){
                    int elemLength = String.valueOf(nodes.get(j).right.elem).length();
                    if( elemLength==1 ) System.out.print("\\");
                    else System.out.print(" \\");
                }
                else
                    BTPrinter.printWhitespaces(1);

                BTPrinter.printWhitespaces(endgeLines + endgeLines - i);
            }

            System.out.println("");
        }

        printNodeInternal(newNodes, level + 1, maxLevel);
    }

    private static void printWhitespaces(int count) {
        for (int i = 0; i < count; i++)
            System.out.print(" ");
    }

    private static int maxLevel(BTNode node) {
        if (node == null)
            return 0;

        return Math.max(BTPrinter.maxLevel(node.left), BTPrinter.maxLevel(node.right)) + 1;
    }

    private static boolean isAllElementsNull(List<?> list) {
        for (Object object : list) {
            if (object != null)
                return false;
        }

        return true;
    }

}

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
        QuizTwoB driver = new QuizTwoB();

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
 