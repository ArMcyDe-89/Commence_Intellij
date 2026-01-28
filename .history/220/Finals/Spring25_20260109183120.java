public class Spring25 {
    static Node MergeLL(Node head1, Node head2 ){
        Node N1 = head1; boolean found = false; Node N2 = head2;
        while(N1.next!=null){
            while(N2.next!=null){
                if (N2.next.elem == N1.next.elem) {
                    N1.next=null; found = true; break;
                }N2= N2.next;
            }if(found){break;}
            N1=N1.next;
        } if(found){N1.next =head2;return head1;} return null;
    }
    static int second_max(Node root){
        return findMax(root, Integer.MIN_VALUE);
    }
    static int findMax(Node root, Integer max){
        if(root == null){return 0;}
        if(root.elem>max){max = root.elem;}

        Integer L = findMax(root.left, max), R = findMax(root, max);

    }
    class Node{
        Integer elem;
        Node next;
        public Node(){elem = null; next = null;}
        public Node(int e, Node n){ this.elem = e; this.next = n;}
    }
}
