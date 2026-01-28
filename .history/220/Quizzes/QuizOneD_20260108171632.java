public class QuizOneD {
    public  Node awardFastPass( Node head){
        Node arr [] = new Node[Integer.MAX_VALUE];
        Node N =head; int count = 0; int i=0;
        while(N!=null){
            arr[++count] = N;
            N=N.next;
        }
        if(count%2==0){return arr[]}
    }
}
    class Node{
        Integer elem;
        Node next;
        public Node(){elem = null; next = null;}
        public Node(Object e){elem = (Integer)e; next = null;}
        public Node(int e, Node n){ this.elem = e; this.next = n;}
    }
