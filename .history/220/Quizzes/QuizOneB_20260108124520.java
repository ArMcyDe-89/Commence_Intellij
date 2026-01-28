public class QuizOneB {
    public Node buildEvenOddList (Integer [][]mat, Node head1, Node head2, int n){
        if(n<2){System.out.println("Invalid Matrix");return null;}
        Node N = head1; Node M = head2;
        while (N.next!=null) { 
            int a = N.elem, b = N.next.elem,T = mat[a%n][b%n]; Node ev = new Node(T,null);
            if(T%2==0){ev.next=M.next;M.next =ev;}
            else{
                Node V = head2;
                while(V.next!=null){V=V.next;}
                V.next = ev;
            } 
            N= N.next;
        }
        return head2;
    }
    class Node{
        Integer elem;
        Node next;
        public Node(){elem = null; next = null;}
        public Node(int e, Node n){ this.elem = e; this.next = n;}
    }

    // ==========================================
    // HELPER METHODS (For Testing)
    // ==========================================
    // Helper to create a linked list from an array
    public Node createList(int[] arr) {
        if (arr.length == 0) return null;
        Node head = new Node(arr[0], null);
        Node curr = head;
        for (int i = 1; i < arr.length; i++) {
            curr.next = new Node(arr[i], null);
            curr = curr.next;
        }
        return head;
    }

    // Helper to print the list in the format shown in the image
    public static void printList(Node head, String name) {
        System.out.print(name + ": ");
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        
        // If it's a dummy head list, we print "dh"
        System.out.print("dh -> ");
        
        Node current = head.next; // Start after dummy
        while (current != null) {
            System.out.print(current.elem + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    // ==========================================
    // MAIN DRIVER
    // ==========================================
    public void main(String[] args) {
        // 1. Setup Matrix M (3x3)
        int[][] M = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int n = 3;

        // 2. Setup List 1 (L1)
        // Sequence: 3 -> 0 -> 2 -> 4 -> 3 -> 2 -> NULL
        Integer[] l1_data = {3, 0, 2, 4, 3, 2};
        Node head1 = createList(l1_data);

        // 3. Setup List 2 (L2) - Initially just a Dummy Head
        Node head2 = new Node(); // Value -1 represents dummy

        // 4. Run the function
        System.out.println("--- Processing ---");
        buildEvenOddList(M, head1, head2, n);

        // 5. Verify Output
        // Expected: dh -> 4 -> 8 -> 1 -> 3 -> 3 -> NULL
        printList(head2, "L2");
    }
}
