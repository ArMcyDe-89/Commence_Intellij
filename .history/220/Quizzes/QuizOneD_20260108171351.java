public class QuizOneD {
    public  Node awardFastPass( Node head){
        Integer arr [] = new Integer[Integer.MAX_VALUE];
        Node N =head; int count = 0; int i=0;
        while(N!=null){
            
            N=N.next;
        }
    }
}
    class Node{
        Integer elem;
        Node next;
        public Node(){elem = null; next = null;}
        public Node(Object e){elem = (Integer)e; next = null;}
        public Node(int e, Node n){ this.elem = e; this.next = n;}
    }
