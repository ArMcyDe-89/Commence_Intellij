public class QuizOneC {
    public static Node reverseClip(Node HJ, int start,int end) {
        Node N =HJ,save1=null, save2 = null; int count = 1;
        while (N.next!=null) {
            if (count == end ) {
                save2 = N.next; N.next = null;N=HJ; count=1;break;
            }
            N=N.next; count++;
        }
        while (N.next!=null) {
            if(count == start-1){save1 = N.next; N.next = null;N=HJ; count = 1;break;}
            N=N.next; count++;
        }
        save1 = InPlaceRev(save1);
        while (N.next!=null) {
            N=N.next;
        }N.next =save1;
        while (N.next!=null) {
            N=N.next;
        }N.next =save2; 
         return HJ;
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
