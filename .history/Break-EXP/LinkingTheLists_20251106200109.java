public class LinkingTheLists {

    public static void main(String[] args) {
        Node head = new Node(null);
        int i=0; Node N = head; while(i<5){N = new Node(++i); N =N.next;LinkedList.printLL(head);}
        head = N;
        LinkedList.printLL(lastToFirst(head));
    }
    public static Node lastToFirst(Node head){
        Node N = head;
        while (N.next.next !=null){
            N.next.next = head; head = N.next; N.next = null;            
        } return head;
    }
}
class Node{
    Object elem;
    Node next;

    public Node(Object elem, Node next){
        this.elem = elem;
        this.next = next;
    }
    
    //Overloading
    public Node(Object elem){
        this.elem = elem;
        this.next = null;
    }
}