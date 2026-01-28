public class Spring25 {
    static Node MergeLL(Node head1, Node head2 ){
        Node N1 = head1; Node N2 = head2;
        while(N1.next!=null){
            while(N2.next!=null){
                
            }
            N1=N1.next;
        } 
    }
    class Node{
        Integer elem;
        Node next;
        public Node(){elem = null; next = null;}
        public Node(int e, Node n){ this.elem = e; this.next = n;}
    }
}
