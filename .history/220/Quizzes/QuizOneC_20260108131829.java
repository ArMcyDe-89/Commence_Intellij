public class QuizOneC {
    public Node reverseClip(Node head, int start, int end){
        Node rev=null,N=head; int count = 1;
        while(N){

        } 
        return rev;
    }
    public Node InPlaceRev(Node head){
        Node N = head, rev = null, Next = null;
        while(N!=null){
            Next = N.next;
            N.next = rev; rev = N;
            N=Next;
        }return rev;
    }
    class Node{
        Integer elem;
        Node next;
        public Node(){elem = null; next = null;}
        public Node(Object e){elem = (Integer)e; next = null;}
        public Node(int e, Node n){ this.elem = e; this.next = n;}
    }
}
