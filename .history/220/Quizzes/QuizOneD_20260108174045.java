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

    public Node findTwoThirdsNode(Node head) { // 
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

    class Node{
        Integer elem;
        Node next;
        public Node(){elem = null; next = null;}
        public Node(Object e){elem = (Integer)e; next = null;}
        public Node(int e, Node n){ this.elem = e; this.next = n;}
    }

}
