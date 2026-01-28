public class QuizOneE {
    public void minInMid(Node head){
        Node N = head, M = null; Integer min = Integer.MAX_VALUE;
        while (N.next != null) {
            if(N.elem<min){min = N.elem;}
            N=N.next;
        }
        Node 
    }
    class Node{
        Integer elem;
        Node next; Node prev;
        public Node(){elem = null; next = null; prev = null;}
        public Node(Object e){elem = (Integer)e; next = null;}
        public Node(int e, Node n, Node p){ this.elem = e; this.next = n; this.prev = p;}
    }
}
