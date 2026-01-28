public class TestRunner {
    public static void main(String[] args) {
        System.out.println("Nth Fibonacci:");
        System.out.println(BSTNode.fibonacci(4, 0, 1));
        System.out.println("Sum of Fibonacci:");
        System.out.println(BSTNode.fibonacciSum(8, 0, 1));

        Object[] tree;
        BTNode root ;
        taskPrint("\n===================== TASK#1 =====================");
        taskPrint("================== InOrder Traverse ===================");
        // index              0    1   2   3   4   5    6     7 
        tree = new Object[]{ null, 10, 20, 30, 40, 60, null, 50 };
        root = treeConstruction(tree, 1);
        System.out.println("::Given Binary Tree::");
        BTPrinter.printNode(root);
        System.out.println("::Expected Output::");
        System.out.print("InOrder Traversal: ");
        System.out.println("40 20 60 10 30 50");

        System.out.println("::Your Output::");
        System.out.print("InOrder Traversal: ");
        Task1.inOrder(root);
        System.out.println();
        
        System.out.println("--------------------------------------------------");
        // index              0    1   2   3    4     5    6   7
        tree = new Object[]{ null, 10, 30, 20, null, null, 60, 40 };
        root = treeConstruction(tree, 1);
        System.out.println("::Given Tree::");
        BTPrinter.printNode(root);

        System.out.println("::Expected Output::");
        System.out.print("InOrder Traversal: ");
        System.out.println("30 10 60 20 40");

        System.out.println("::Your Output::");
        System.out.print("InOrder Traversal: ");
        Task1.inOrder(root);
        
        System.out.println(normal);

    }
}
