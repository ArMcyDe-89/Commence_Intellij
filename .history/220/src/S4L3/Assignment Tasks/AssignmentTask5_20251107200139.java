public class AssignmentTask5{

    //SUBMIT ONLY THIS METHOD
    public static void sumOddAppend(Node dh) {
        // TO DO
        Node N = dh; int sum = 0;
        while(N.next != dh){
            if ((int)N.next.elem%2 != 0){
                sum+= (int)N.next.elem; N.next = N.next.next;
            } N = N.next;
        }N.next = new Node(sum); N.next.next = dh;
    }

    //DO NOT SUBMIT THE DRIVER CODE BELOW
    //SUBMITTING IT WILL INCREASE YOUR PLAG % FOR NO REASON
    public static void main(String[] args) {
        Object[] values = {11, 22, 33, 44, 55, 66};
        Node head = LinkedListHelpers.createDummyHeadedSinglyCircularLL(values, true);

        System.out.println("Given Linked List:");
        LinkedListHelpers.printDummyHeadedSinglyCircularLL(head);
        System.out.println("\nExpected Output:");
        Object[] expected = {22, 44, 66, 99};
        Node expectedHead = LinkedListHelpers.createDummyHeadedSinglyCircularLL(expected, true);
        LinkedListHelpers.printDummyHeadedSinglyCircularLL(expectedHead);
        
        //Running the Sum Odd Append
        sumOddAppend(head);
        //Printing after Sum Odd Append
        System.out.println("\nYour Output:");
        LinkedListHelpers.printDummyHeadedSinglyCircularLL(head);
    }
}
class LinkedListHelpers {

    public static DNode createDummyHeadedDoublyLL(Object[] values, boolean circular) {
        DNode dHead = new DNode(null);
        DNode n = dHead;

        for (int i = 0; i < values.length; i++) {
            DNode newNode = new DNode(values[i]);
            n.next = newNode;
            newNode.prev = n;
            n = newNode;
        }

        if (circular) {
            n.next = dHead;
            dHead.prev = n;
        }

        return dHead;
    }

    public static Node createDummyHeadedSinglyCircularLL(Object[] values, boolean circular) {
        Node dHead = new Node(null);
        Node n = dHead;

        for (int i = 0; i < values.length; i++) {
            Node newNode = new Node(values[i]);
            n.next = newNode;
            n = newNode;
        }

        if (circular) {
            n.next = dHead;
        }

        return dHead;
    }

    public static void printDummyHeadedSinglyCircularLL(Node head) {
        System.out.print("[X] --> ");
        Node n = head.next;

        while (n != head) {
            System.out.print("[" + n.elem + "] --> ");
            n = n.next;
        }

        System.out.println("(back to start)");
    }

    public static void printDummyHeadedDoublyLL(DNode head) {
        System.out.print("Forward: ");
        System.out.print("[X] --> ");
        DNode n = head.next;
        DNode lastNode = null;

        while (n != null) {
            System.out.print("[" + n.elem + "] --> ");
            if (n.next == null) {
                lastNode = n;
            }
            n = n.next;
        }

        System.out.println("(back to start)");

        System.out.print("Backward: ");
        n = lastNode;

        while (n != null && n.elem != null) {
            System.out.print("[" + n.elem + "] --> ");
            n = n.prev;
        }

        System.out.println("[X] --> (back to end)\n");
    }

    public static void printDummyHeadedDoublyCircularLL(DNode head) {
        System.out.print("Forward: ");
        System.out.print("[X] --> ");
        DNode n = head.next;

        while (n != head) {
            if (n == null) {
                System.out.println("\n[ERROR!!] NOT CIRCULAR!!!");
                return;
            }
            System.out.print("[" + n.elem + "] --> ");
            n = n.next;
        }

        System.out.println("(back to start)");

        System.out.print("Backward: ");
        n = head.prev;

        if (n == null) {
            System.out.println("[ERROR!!] No PREV Connection from HEAD");
            return;
        }

        while (n != head) {
            System.out.print("[" + n.elem + "] --> ");
            n = n.prev;
        }

        System.out.println("[X] --> (back to end)\n");
    }
}
class DNode {
    public Object elem;
    public DNode next;
    public DNode prev;

    public DNode(Object elem) {
        this.elem = elem;
        this.next = null;
        this.prev = null;
    }
}

