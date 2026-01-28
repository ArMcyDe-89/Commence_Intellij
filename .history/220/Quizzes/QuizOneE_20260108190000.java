public class QuizOneE {
    public void minInMid(Node head){
        Node N = head.next, M = new Node(Integer.MAX_VALUE);
        // while (N != null) { // this works but i tried without creating new nodes
        //     if(N.elem<M.elem){ M = new Node(N.elem);}
        //     N=N.next;
        // }
        // Node slow  = head.next, fast = head.next;
        // while(fast!=null && fast.next!=null){slow = slow.next; fast= fast.next.next;}
        // M.next = slow.next; M.prev = slow.prev; slow.prev.next = M; slow.next.prev = M; 
        // fast = new Node(slow.elem);
        // while(slow.next.elem!= M.elem){
        //     slow=slow.next;
        // } fast.next=slow.next.next; slow.next.next.prev = fast; slow.next =fast; fast.prev = slow;


        while (N!=null) { 
            if(N.elem<M.elem){M=N;}
            N=N.next;
        }
        Node slow  = head.next, fast = head.next, BSlow = null;
        while(fast!=null && fast.next!=null){slow = slow.next; fast= fast.next.next;} BSlow = slow.prev;
        M.next =slow;M.prev.next =  M.prev = slow.prev; slow.prev.next = M;
    }
    class Node{
        Integer elem;
        Node next; Node prev;
        public Node(){elem = null; next = null; prev = null;}
        public Node(Object e){elem = (Integer)e; next = null;}
        public Node(Integer e, Node n, Node p){ this.elem = e; this.next = n; this.prev = p;}
    }

    public static void printList(Node head) {
        System.out.print("dh <-> ");
        Node curr = head.next;
        while (curr != null) {
            System.out.print(curr.elem);
            if (curr.next != null) System.out.print(" <-> ");
            curr = curr.next;
        }
        System.out.println();
    }

    public void main(String[] args) {
        // Setup Dummy Head
        Node head = new Node(null, null, null);

        // Build List: 5 <-> 4 <-> 3 <-> 8 <-> 6 <-> 1 <-> 2
        int[] data = {5, 4, 3, 8, 6, 1, 2};
        Node tail = head;
        
        for (int val : data) {
            Node newNode = new Node(val, null, tail);
            tail.next = newNode;
            tail = newNode;
        }

        System.out.println("Original:");
        printList(head);

        // --- RUN YOUR ALGORITHM ---
        QuizOneE driver = new QuizOneE();
        driver.minInMid(head);

        System.out.println("Result:");
        printList(head);
    }
}
