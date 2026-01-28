import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

    // Your provided Node class
class BTNode {
        Object elem;
        BTNode left, right;

        public BTNode(Object elem) {
            this.elem = elem;
        }
}

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
public class QuizTwoC {

    public Integer sum_subtree_max(BTNode root){
        int sub = findMax(root.right, max) - findMax(root.left, ax)
    }

    public Integer findMax(BTNode root, int max){
        if(root == null){ return max;} if(root.left == null &&  root.right == null){if((int)root.elem>max){max = (int)root.elem;}return max;}
        if(root.right!= null){ if((int)root.right.elem>max){max = (int)root.right.elem;}return findMax(root.right, max);}
        if(root.left != null ){if((int)root.left.elem>max){max = (int)root.left.elem;}return findMax(root.left, max);}
        int l = findMax(root.left, max), r = findMax(root.right, max);
        if(r>l){max = r;}else{max = l;}
        if((int)root.elem>max){max = (int)root.elem;}
        return max;        
    }
}
