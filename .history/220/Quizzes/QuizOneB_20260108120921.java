public class QuizOneB {
    public Node buildEvenOddList (Integer [][]mat, Node head1, Node head2, int n){
        Node N = head1; Node M = head2;
        while (N.next!=null) { 
            int a = N.elem, b = N.next.elem;
            if(mat[a%][]){} 
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
