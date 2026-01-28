public class LinkingTheLists {

    public static void main(String[] args) {
        int i=0;
        Node head = new Node(i); Node eye = new Node(5); Node E = eye; 
        Node N = head; while(i<10){N.next = new Node(++i); N = N.next; E.next = new Node((int)(E.elem)+i); E =E.next;}
        N = head;
        LinkedList.printLL(head);
        LinkedList.printLL(lastToFirst(N));
    }
    public static Node Intersection() {
        
    }
    public static Node lastToFirst(Node head){ //1.1
        Node N = head;
        while (N.next.next !=null){
            N= N.next;
        }N.next.next = head; head = N.next; N.next = null; return head;
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