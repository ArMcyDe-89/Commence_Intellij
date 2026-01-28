public class QuizOneC {
    public Node reverseClip(Node head, int start, int end){
        if(start<1 || end> countNodes(head)){System.out.println("invalid"); return null;}
        Node rev=null,N=head, last = null; int count = 1;
        while(N!=null){
            N=N.next;count++; if(count >=start && count<= end){if}
        } 
        return rev;
    }
    public Integer countNodes(Node head){
        if(head==null){return  0;}
        return 1 + countNodes(head.next);
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
