import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class TestRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nth Fibonacci:"); int n = sc.nextInt();
        System.out.println(BSTNode.fibonacci(n, 0, 1));
        System.out.println("Sum of Nth Fibonacci:");
        System.out.println(BSTNode.fibonacciSum(n, 0, 1));

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
        BSTNode.inOrder(root);
        System.out.println();

        System.out.println("::Your Output::");
        System.out.print("PreOrder Traversal: ");
        BSTNode.PreOrder(root);
        System.out.println();

        System.out.println("::Your Output::");
        System.out.print("PostOrder Traversal: ");
        BSTNode.PostOrder(root);
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
        BSTNode.inOrder(root);
        System.out.println();

        System.out.println("::Your Output::");
        System.out.print("PreOrder Traversal: ");
        BSTNode.PreOrder(root);
        System.out.println();

        System.out.println("::Your Output::");
        System.out.print("PostOrder Traversal: ");
        BSTNode.PostOrder(root);
        System.out.println();

        System.out.println("level = "+BTNode.findDepth(root, 60, 0));
        
        System.out.println(normal);
        tree = new Object[]{ null, 10, 20, 30, null, null, 40, 60 };
        BSTNode B = BSTtreeConstruction(tree, 1);
        BSTPrinter.printNode(B);
        System.out.println(BSTNode.findPath(B, 60));
        System.out.println("level = "+BSTNode.findDepth(B, 30, 0));

        root = new BTNode(1);

        root.left = new BTNode(2);
        root.right = new BTNode(3);

        root.left.left = new BTNode(4);
        root.left.right = new BTNode(5);

        root.right.left = new BTNode(6);
        root.right.right = new BTNode(7);

        root.left.left.left = new BTNode(8);
        root.left.left.right = new BTNode(9);

        root.left.left.right.right = new BTNode(10);
        BTPrinter.printNode(root);
        System.out.println("level = "+BTNode.findDepth(root, 10, 0));
        System.out.println("The path is - ");
        System.out.println(BTNode.findPath(root, 11)); 
        Random rand = new Random();
        int f=0;
        // Generate and insert 10 random numbers
        for (int i = 0; i < 7; i++) { 
            int k =rand.nextInt(100);
            if(i==5){f=k;}
            B = insert(B, k);
        }
        BSTPrinter.printNode(B);
        System.out.println(BSTNode.findPath(B, f));
        root = new BTNode(1); root.left = new BTNode(2); root.left.right = new BTNode(3);
        System.out.println(BTNode.CompleteBinary(root));

        BSTNode tree1 = null;

        /* Constructing the following BST
              50
           /     \
          30      70
         /  \    /  \
        20  40  60  80 
        */
        tree1.insert(tree1,50);
        tree1.insert(tree1,30);
        tree1.insert(tree1,20);
        tree1.insert(tree1,40);
        tree1.insert(tree1,70);
        tree1.insert(tree1,60);
        tree1.insert(tree1,80);

        System.out.println("Original Tree (Inorder):");
        tree1.inOrder(tree1); // Expected: 20 30 40 50 60 70 80

        System.out.println("\n--- Test 1: Delete Leaf Node (20) ---");
        tree1.deleteW(20);
        System.out.print("Result: ");
        tree1.inOrder(tree1); // Expected: 30 40 50 60 70 80

        System.out.println("\n--- Test 2: Delete Node with One Child ---");
        // Let's create a one-child scenario by adding 90 to 80
        tree1.insert(tree1,90);
        // Now 80 has a right child (90) but no left child.
        System.out.println("Inserted 90. Now deleting 80 (Node with 1 child)...");
        tree.delete(80);
        System.out.print("Result: ");
        tree.inorder(); // Expected: 30 40 50 60 70 90

        System.out.println("\n--- Test 3: Delete Node with Two Children (50) ---");
        // 50 is the root. It has left subtree (30...) and right subtree (70...).
        // Successor of 50 is the smallest in right subtree -> 60.
        // 60 should replace 50.
        tree.delete(50);
        System.out.print("Result: ");
        tree.inorder(); // Expected: 30 40 60 70 90



    }
    private static BTNode treeConstruction( Object[] arr, int i ){
        if (i>=arr.length || arr[i]==null)
        return null;
        BTNode p = new BTNode(arr[i]);
        p.left = treeConstruction(arr, 2*i);
        p.right = treeConstruction(arr, 2*i+1);
        return p;
    }

    private static BSTNode BSTtreeConstruction( Object[] arr, int i ){
        if (i>=arr.length || arr[i]==null)
        return null;
        BSTNode p = new BSTNode((int)arr[i]);
        p.left = BSTtreeConstruction(arr, 2*i);
        p.right = BSTtreeConstruction(arr, 2*i+1);
        return p;
    }
    
    
    private static int getDepth( BTNode root ){
        return getDepthHelper(root,0);
    }
    
    private static int getDepthHelper( BTNode root, int lvl ){
        if( root==null){
            return lvl;
        }
        int leftLvl = getDepthHelper(root.left, lvl+1);
        int rightLvl = getDepthHelper(root.right, lvl+1);
        
        return leftLvl>rightLvl ? leftLvl: rightLvl;
    }
    
    private static boolean isTreeEqual( BTNode root1, BTNode root2  ){
        
        if(root1==null && root2==null) return true;
        if(root1==null && root2!=null) return false;
        if(root1!=null && root2==null) return false;
        //if elements didn't match
        if( !Objects.equals(root1.elem, root2.elem) ){
            return false;
        } 
        boolean left = isTreeEqual(root1.left, root2.left);
        boolean right = isTreeEqual(root1.right, root2.right);
        return left && right; 
    }
    
    private static boolean isArrEqual(Object[] arr1, Object[] arr2){
      if(arr1.length!=arr2.length) return false;
      else{
        for(int i=0; i<arr1.length; i++)
          if( !Objects.equals(arr1[i],arr2[i]) ) return false;
        return true;
      }
    }
    
    private static void printArr(Object[] arr){
        if(arr==null){
            System.out.println("null");
            return;
        }
        System.out.print("{ ");
        for(int i=0; i<arr.length; i++){
            System.out.print( "Lvl("+i+"): "+arr[i]);
            if (i!=arr.length-1)
            System.out.print(", ");
        }
        System.out.println(" }");
    }
    
    static final String green = "\u001B[32m", red = "\u001B[31m", white = "\u001B[37m", cyan = "\033[0;96m";
    static final String bold="\u001B[1m", underline = "\u001B[4m", normal = "\033[0;0m";
    
    static String taskFormat = cyan;
    static String sucsFormat = "\n"+green+bold+underline;
    static String failFormat = "\n"+red+bold+underline;
    static String endFormat = normal+white;

    private static void taskPrint(String task){
        System.out.println(taskFormat+task+endFormat);
    }

    private static void successPrint(String task){
            System.out.println(sucsFormat+"    "+task+" Success!! Output Matched!!!     "+endFormat);
    }
    
    private static void failedPrint(String task){
        System.out.println(failFormat+"    "+task+" Failed!! Output didn't Match!!!   "+endFormat);
    }
    public class MakeTree {
        static BSTNode insert(BSTNode root, int val) {
            if (root == null) return new BSTNode(val);
            if (val < root.elem) root.left = insert(root.left, val);
            else if (val > root.elem) root.right = insert(root.right, val);
            return root;
        }
    }
    static BSTNode insert(BSTNode root, int val) {
    // 1. BASE CASE: If the spot is empty, create the node here
    if (root == null) {
        return new BSTNode(val);
    }

    // 2. RECURSIVE STEP: Decide whether to go Left or Right
    if (val < root.elem) {
        // If the new value is smaller, go to the left child
        root.left = insert(root.left, val);
    } else if (val > root.elem) {
        // If the new value is larger, go to the right child
        root.right = insert(root.right, val);
    }

    // 3. Return the (potentially updated) root
    return root;
}
}
