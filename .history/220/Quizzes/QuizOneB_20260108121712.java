public class QuizOneB {
    public Node buildEvenOddList (Integer [][]mat, Node head1, Node head2, int n){
        if(n<2){System.out.println("Invalid Matrix");return ;}
        Node N = head1; Node M = head2;
        while (N.next!=null) { 
            int a = N.elem, b = N.next.elem,T = mat[a%n][b%n]; Node ev = new Node(T,null);
            if(T%2==0){ev.next=M.next;M.next =ev;}
            else{
                Node V = head2;
                while(V.next!=null){V=V.next;}
                V.next = ev;
            } 
            N= N.next;
        }
        return head2;
    }
    class Node{
        Integer elem;
        Node next;
        public Node(){elem = null; next = null;}
        public Node(int e, Node n){ this.elem = e; this.next = n;}
    }
}
