public class Spring25 {
    static Node MergeLL(Node head1, Node head2 ){
        Node N1 = head1; boolean found = false; 
        while(N1.next!=null){Node N2 = head2;
            while(N2.next!=null){
                if (N2.next.elem == N1.next.elem) {
                    N1.next=null; found = true; break;
                }N2= N2.next;
            }if(found){break;}
            N1=N1.next;
        } if(found){N1.next =head2;return head1;} return null;
    }
    static int second_max(BTNode root){
        int max1 = findMax(root, Integer.MIN_VALUE);
        removeNode(root,max1);
        int max =findMax(root, Integer.MIN_VALUE);
        return max;
    }
    static void removeNode(BTNode root, int max){
        if(root == null){return;}
        if(root.elem == max){ root.elem = -1;}
        removeNode(root.left, max); removeNode(root.right, max);
    }
    static int findMax(BTNode root, Integer max){
        if(root == null){return 0;}
        if(root.elem>max){max = root.elem;}

        Integer L = findMax(root.left, max), R = findMax(root.right, max);
        if(L>max){max = L;} if(R>max){max = R;}
        return max;
    }
    static  class Node{
        Integer elem;
        Node next;
        public Node(){elem = null; next = null;}
        public Node(int e, Node n){ this.elem = e; this.next = n;}
    }
    static class BTNode {
        int elem;
        BTNode left, right;

        public BTNode(int elem) {
            this.elem = elem;
        }
    }
    static String find_minimum(Edge [] ){

    }

    // --- HELPER TO PRINT LISTS ---
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.elem);
            if (current.next != null) System.out.print(" -> ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("--- Test Case 1: Intersecting Lists ---");
        
        // 1. Create the Shared Segment (Intersection): 62 -> 17 -> 89 -> 24
        // We create these nodes once and link both lists to them.
        Node n24 = new Node(24, null);
        Node n89 = new Node(89, n24);
        Node n17 = new Node(17, n89);
        Node intersectionStart = new Node(62, n17);

        // 2. Create Head 1 Unique Part: 56 -> 78 -> 91 -> (connects to 62)
        Node n91 = new Node(91, intersectionStart);
        Node n78 = new Node(78, n91);
        Node head1 = new Node(56, n78);

        // 3. Create Head 2 Unique Part: 43 -> 33 -> (connects to 62)
        Node n33 = new Node(33, intersectionStart);
        Node head2 = new Node(43, n33);

        System.out.print("List 1: "); printList(head1);
        System.out.print("List 2: "); printList(head2);

        // 4. Run MergeLL
        Node result = MergeLL(head1, head2);

        System.out.println("\nMerged List:");
        if (result != null) {
            printList(result);
        } else {
            System.out.println("None/Null");
        }
        
        // Expected Output matches the image:
        // 56 -> 78 -> 91 -> 43 -> 33 -> 62 -> 17 -> 89 -> 24

        System.out.println("\n--- Test Case 2: Non-Intersecting Lists ---");
        // h1: 1 -> 2
        // h2: 3 -> 4
        Node h1_simple = new Node(1, new Node(2, null));
        Node h2_simple = new Node(3, new Node(4, null));
        
        System.out.print("List 1: "); printList(h1_simple);
        System.out.print("List 2: "); printList(h2_simple);
        
        Node result2 = MergeLL(h1_simple, h2_simple);
        System.out.println("Result: " + (result2 == null ? "None/null\n\n" : "Merged\n\n"));


        // Constructing the tree from the image
        //       30
        //      /  \
        //     50  10
        //     /
        //   40

        BTNode root = new BTNode(30);
        BTNode n50 = new BTNode(50);
        BTNode n10 = new BTNode(10);
        BTNode n40 = new BTNode(40);

        root.left = n50;
        root.right = n10;
        n50.left = n40; // Note: In the image, 40 is the left child of 50

        System.out.println("--- Second Max Test ---");
        System.out.println("Tree Structure:");
        System.out.println("    30");
        System.out.println("   /  \\");
        System.out.println("  50  10");
        System.out.println("  /");
        System.out.println(" 40");
        
        // Calculate Second Max
        // Note: This modifies the tree (sets 50 to -1), so we print result after.
        int res = second_max(root);
        
        System.out.println("\nCalculated Second Highest: " + res);
        System.out.println("Expected Second Highest: 40");
        
        if(res == 40) {
            System.out.println("Status: CORRECT");
        } else {
            System.out.println("Status: WRONG");
        }
    }
}
