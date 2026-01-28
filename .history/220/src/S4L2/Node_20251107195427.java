

class NodeTester{
    public static void main(String [] args){
        Node n1,n2,n3,n4,n5;
        n1 = new Node("Hello"); n2 = new Node(324); n3 = new Node(8.97); n4 = new Node("Python"); n5 = new Node("Java");
        n1.next = n5; n2.next = n3; n1.next = n5; n3.next = n1; n2.next = n2; n4.next = n5;

        // System.out.println( n1.next );
        // System.out.println( n3.next.elem );
        // Node x = n4.next;
        // System.out.println( n1.elem + x.elem );
        // x.next = n3;
        // System.out.println(n2.next.next + n5.next);
        // x.next.next = null;
        // n3.next.elem = 321;
        // n4.next = 532;
        // System.out.println(n4.next.elem);


    }
}

public class Node{
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
