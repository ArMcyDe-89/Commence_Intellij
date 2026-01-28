public class QuizOneD {
    public  Node awardFastPass( Node head){
        int n = countNodes(head);
        int l=0; Node N = head;
        if(n%2==0){l=(n/2)+1;}else{l=n/2;}
        while(N!=null){
            
            N=N.next;
        }
    }
    public Integer countNodes(Node head){
        if(head==null){return  0;}
        return 1 + countNodes(head.next);
    }
}
    class Node{
        Integer elem;
        Node next;
        public Node(){elem = null; next = null;}
        public Node(Object e){elem = (Integer)e; next = null;}
        public Node(int e, Node n){ this.elem = e; this.next = n;}
    }
