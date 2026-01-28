public class LinkingTheLists {

    public static void main(String[] args) {
        Node head = new Node(null,null);
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

}