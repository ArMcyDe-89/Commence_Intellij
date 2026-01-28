public class QuizOneD {
    public Node awardFastPass(Node head){ // for travelling  at 2x
        if(head == null){return null;}
        Node fast = head, slow = head;
        while(fast!=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return  slow;
    }

    public Node findTwoThirdsNode(Node head) { // for finding the 2/3rd position
        if (head == null) return null;

        Node slow = head;
        Node fast = head;

        // Check 3 steps ahead for fast to ensure it doesn't crash
        while (fast != null && fast.next != null && fast.next.next != null) {
            
            // YOUR LOGIC:
            slow = slow.next.next;       // Move 2 steps
            fast = fast.next.next.next;  // Move 3 steps
        }

        return slow;
    }
    public Node findOneThirdsNode(Node head) { // for finding the 1/3rd position
        if (head == null) return null;

        Node slow = head;
        Node fast = head;

        // Check 3 steps ahead for fast to ensure it doesn't crash
        while (fast != null && fast.next != null && fast.next.next != null) {
            
            // YOUR LOGIC:
            slow = slow.next;       // Move 1 steps
            fast = fast.next.next.next;  // Move 3 steps
        }

        return slow;
    }

    class Node{
        Integer elem;
        Node next;
        public Node(){elem = null; next = null;}
        public Node(Object e){elem = (Integer)e; next = null;}
        public Node(int e, Node n){ this.elem = e; this.next = n;}
    }
    public void main(String[] args) {
        // --- TEST CASE 1: ODD LENGTH ---
        // Sample Input: 10 -> 4 -> 7 -> 3 -> 9
        System.out.println("--- Test Case 1 (Odd) ---");
        int[] data1 = {10, 4, 7, 3, 9};
        Node head1 = createList(data1);
        
        System.out.print("Input List: ");
        printList(head1);

        Node result1 = awardFastPass(head1);
        System.out.println("Middle Node Value: " + result1.elem);
        System.out.println("Expected: 7\n");


        // --- TEST CASE 2: EVEN LENGTH ---
        // Sample Input: 8 -> 1 -> 6 -> 2 -> 12 -> 9
        System.out.println("--- Test Case 2 (Even) ---");
        int[] data2 = {8, 1, 6, 2, 12, 9};
        Node head2 = createList(data2);

        System.out.print("Input List: ");
        printList(head2);

        Node result2 = awardFastPass(head2);
        System.out.println("Middle Node Value: " + result2.elem);
        System.out.println("Expected: 2");
    }

    public static Node createList(int[] values) {
        if (values.length == 0) return null;

        // Create head using your constructor
        Node head = new Node(values[0], null); 
        Node current = head;

        for (int i = 1; i < values.length; i++) {
            // Create next node and link it
            current.next = new Node(values[i], null);
            current = current.next;
        }
        return head;
    }

    // ==========================================
    // HELPER: Print List (Visual Check)
    // ==========================================
    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.elem);
            if (curr.next != null) System.out.print(" -> ");
            curr = curr.next;
        }
        System.out.println();
    }

}
