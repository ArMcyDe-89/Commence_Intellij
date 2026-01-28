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
    static class Edge {
        String source;
        String destination;
        Integer weight;
        Edge next;

        public Edge(String src, String dest, int w, Edge nextEdge) {
            this.source = src;
            this.destination = dest;
            this.weight = w;
            this.next = nextEdge;
        }
    }
    static String find_minimum(Edge [] graph){
        int [] list = new int[graph.length];
        for(int i =0; i<list.length;i++){
            Edge E = graph[i];
            while(E!=null){
                list[Integer.parseInt(E.destination)]+=E.weight;
                E=E.next;
            }
        }
        Integer min = Integer.MAX_VALUE, j =-1;
        for(int i=0;i<list.length;i++){if(min>list[i]){min=list[i];j=i;}}
        return ""+j;
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



        int numVertices = 4;
        Edge[] graph = new Edge[numVertices];

        // --- Constructing Graph (Based on Image Values) ---
        // Note: We build lists by adding to the front (Order doesn't matter for sum)

        // City 0: outgoing to 1(20), 2(30)
        Edge e0_2 = new Edge("0", "2", 30, null);
        Edge e0_1 = new Edge("0", "1", 20, e0_2);
        graph[0] = e0_1;

        // City 1: outgoing to 0(70), 2(35), 3(20)
        Edge e1_3 = new Edge("1", "3", 20, null);
        Edge e1_2 = new Edge("1", "2", 35, e1_3);
        Edge e1_0 = new Edge("1", "0", 70, e1_2);
        graph[1] = e1_0;

        // City 2: outgoing to 0(55), 1(25), 3(55)
        Edge e2_3 = new Edge("2", "3", 55, null);
        Edge e2_1 = new Edge("2", "1", 25, e2_3);
        Edge e2_0 = new Edge("2", "0", 55, e2_1);
        graph[2] = e2_0;

        // City 3: outgoing to 1(40), 2(60)
        Edge e3_2 = new Edge("3", "2", 60, null);
        Edge e3_1 = new Edge("3", "1", 40, e3_2);
        graph[3] = e3_1;

        // --- RUN TEST ---
        System.out.println("--- Traffic Analysis ---");
        String re = find_minimum(graph);
        System.out.println("City with least incoming traffic: " + rs);
        
        // --- VALIDATION ---
        // Mathematically: City 3 is 75, City 1 is 85.
        // If the code returns 3, it is LOGICALLY correct.
        if(result.equals("3")) {
            System.out.println("Status: LOGICALLY CORRECT (Math: 75 < 85)");
        } else if(result.equals("1")) {
            System.out.println("Status: MATCHES SAMPLE (But Math is incorrect)");
        } else {
            System.out.println("Status: WRONG");
        }

    }
}
