public class LinkingTheLists {

    public static void main(String[] args) {
        int i=0;
        Node head = new Node(i); Node eye = new Node(5); Node E = eye; 
        Node N = head; while(i<10){N.next = new Node(++i); N = N.next; E.next = new Node(5+i); E =E.next;} E =eye;
        head = head.next;N = head;
        //LinkedList.printLL(Intersection(LinkedList.createList(new Object[] {2,3,4,5,6,7,8,9,10,11,12}), N));
        //LinkedList.printLL(lastToFirst(N));
        //LinkedList.printLL(EvenPartsReversed(LinkedList.createList(new Object[] {24,18,2, 3, 5,4,6,8,24,62,66,98,30,45,32,24,54,68,78,90,94,14,34, 7, 9, 12, 6})));
        LinkedList.printLL(EvenTofront(LinkedList.createList(new Object[] {17 , 15 , 8 , 12 , 10 , 5 , 4 , 1 ,7 , 6 })));
        LinkedList.printLL(NodeFromLast(LinkedList.createList(new Object[] {35,15,4,20,45}), 4));
        
    }
    public static Node NodeFromLast(Node head, int n) {
        Node N  = head; int length = 0;
        while (N!=null) {
            length++; N =N.next;
        } N= head;
        while (N!=) {
            
        }
        return null;
    }
    public static Node EvenTofront (Node head){ //2.4
        Node N = head; Node even = new Node(null); Node M = even;
        while (N.next != null) {
            if((int)N.next.elem%2 == 0){
                M.next = N.next; M = M.next; N.next = N.next.next;
            }
            if( N.next == null){break;}
            if((int)N.next.elem%2 != 0 ){N=N.next;}
        } M.next = head; even = even.next; return even;
    }
    public static Node EvenPartsReversed(Node head){ //2.3 (incomplete)
        Node N = head;
        while(N.next != null){
            Node trav = null;
            if(((int)N.next.elem)%2 == 0 && N.next!=null){
                trav = N.next; Node save = N, evens = new Node(null); 
                while (((int) trav.elem)%2 == 0 && trav != null) {
                    Node eve  = new Node(trav.elem); eve.next=evens; evens = eve;
                    trav = trav.next; if(trav == null){break;}
                }save.next = evens; Node s = evens; 
                 while (s.next.elem != null ) {
                     s=s.next;
                 }s.next = trav; if(trav != null){N = trav;}
            }N = N.next;
        }

        return head;
    }
    public static Node Intersection(Node head, Node eye) { //2.2
        Node N = head, E = eye;
        Node leg= new Node(null); Node inter = leg;
        while ( E != null) {
            N = head;
            while (N !=null){
                if(N.elem == E.elem){
                    inter.elem = N.elem; inter.next = new Node(null); inter = inter.next;
                }N = N.next;
            }E= E.next;
        }inter = leg;
        return inter;
    }
    public static Node lastToFirst(Node head){ //2.1
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