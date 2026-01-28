public class LinkingTheLists {

    public static void main(String[] args) {
        int i=0;
        Node head = new Node(i); Node eye = new Node(5); Node E = eye; 
        Node N = head; while(i<10){N.next = new Node(++i); N = N.next; E.next = new Node(5+i); E =E.next;} E =eye;
        head = head.next;N = head;
        LinkedList.printLL(E);
        LinkedList.printLL(Intersection(LinkedList.createList(new Object[] {2,3,4,5,6,7,8,9,10,11,12}), N));
        LinkedList.printLL(lastToFirst(N));
    }
    public static Node Intersection(Node head, Node eye) {
        Node N = head, E = eye;
        Node leg= new Node(null); Node inter = leg;
        while ( E != null) {
            N = head;
            while (N !=null){
                if((int)N.elem == (int)E.elem){
                    //inter =new Node(N.elem); inter = inter.next;
                    inter.elem = N.elem; inter.next = new Node(null); inter = inter.next;
                }N = N.next;
            }E= E.next;
        }inter = null;inter = leg;
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