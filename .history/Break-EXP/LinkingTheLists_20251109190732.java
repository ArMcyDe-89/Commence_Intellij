public class LinkingTheLists {

    public static void main(String[] args) {
        int i=0;
        Node head = new Node(i); Node eye = new Node(5); Node E = eye; 
        Node N = head; while(i<10){N.next = new Node(++i); N = N.next; E.next = new Node(5+i); E =E.next;} E =eye;
        head = head.next;N = head;
        //LinkedList.printLL(Intersection(LinkedList.createList(new Object[] {2,3,4,5,6,7,8,9,10,11,12}), N));
        //LinkedList.printLL(lastToFirst(N));
        LinkedList.printLL(EvenPartsReversed(LinkedList.createList(new Object[] {24, 18, 2, 3, 5, 7, 9, 12, 6})));
        
    }
    public static Node EvenPartsReversed(Node head){
        Node N = head;
        // while(N.next!=null){
        //     Node copy = N.next;
        //     if((int)N.next.elem%2==0){ even = N.next;
        //         while((int)copy.elem%2!=0){
        //             Node E ;
        //             Node M = new Node(copy.elem);
        //             E = M; M.next=E;
        //             copy=copy.next; even = M;//LinkedList.printLL(even);
        //         }LinkedList.printLL(even);
        //         Node EVE=even;
        //         while(EVE.next!=null){
        //             EVE=EVE.next;//LinkedList.printLL(even);
        //         }EVE.next=copy; N.next = even;//LinkedList.printLL(even);
        //     }
        //     N=copy;
        // }


        // while(N!=null){
        //     while((int)N.elem%2 == 0){
        //         Node M = N;
        //     }N=N.next;
        // }
        Node evens = new Node(null);
        while(N.next!=null){
            if((int)N.next.elem%2 ==0){
                Node trav =N;
                while((int)trav.elem%2==0){
                    Node eve = new Node(trav.elem); eve.next = evens; evens = eve; trav = trav.next;
                }N.next = evens;
                while () {
                    
                }
            }
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