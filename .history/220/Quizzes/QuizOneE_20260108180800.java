public class QuizOneE {
    public void minInMid(Node head){
        Node N = head, M = null; Integer min = Integer.MAX_VALUE;
        while (N.next != null) {
            if(N.elem<min){min = N.elem; M = N;}
            N=N.next;
        }
        Node slow  = head.next, fast = head.next;
        while(fast!=null && fast.next!=null){slow = slow.next; fast= fast.next.next;}
        M.next = slow.next; M.prev = slow.prev; slow.prev.next = M; slow.next.prev = M;
        while(slow.next.elem!=min){
            slow=slow.next;
        } slow.ne
    }
    class Node{
        Integer elem;
        Node next; Node prev;
        public Node(){elem = null; next = null; prev = null;}
        public Node(Object e){elem = (Integer)e; next = null;}
        public Node(int e, Node n, Node p){ this.elem = e; this.next = n; this.prev = p;}
    }
}
