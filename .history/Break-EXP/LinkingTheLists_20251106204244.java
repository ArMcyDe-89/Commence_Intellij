public class LinkingTheLists {

    public static void main(String[] args) {
        int i=0;
        Node head = new Node(i); Node eye = new Node(5); Node E = eye; 
        Node N = head; while(i<10){N.next = new Node(++i); N = N.next; E.next = new Node(5+i); E =E.next;} E =eye;
        N = head;
        LinkedList.printLL(E);
        LinkedList.printLL(Intersection(N, E));
        LinkedList.printLL(lastToFirst(N));
    }
    public static Node Intersection(Node head, Node eye) {
        Node N = head, E = eye;
        Node inter = new Node(null);
        while (N.next!=null && E.next != null){
            if((int)N.elem == (int)E.elem){inter.elem = (int)N.elem;inter.next = new Node(null); inter = inter.next;LinkedList.printLL(inter);}
            N = N.next; E= E.next;           
        }
        return inter;        
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