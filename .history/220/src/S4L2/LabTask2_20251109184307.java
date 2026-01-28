import java.util.*;
// LabTask2: Word Decoder
public class LabTask2 {
    
    // No need to submit this task
    public static Node wordDecoder( Node head ){
        Node N = head, B = new Node(null);
        int length = 0;
        while(N!=null){
            N=N.next; length++;
        }
        int mod = 13%length;
        N= head;int count = 0;
        while (N!=null) {
            if(count%mod == 0 && count > 0){
                Node G = new Node(N.elem); G.next = B; B= G;
            }N= N.next; count++;
        }
        N = B;
        while (N.next!=null){
            N=N.next;
        }N.next = null;

        //You're suppose to create a new Dummy headed Singly Linked List in this method
        //Dummy head is basically a head Node where the elem is null
        // Node dHead = new Node(null, null); here the dHead is a Dummy Head

        //TO DO

        //remove the following line when you're ready to return the new head
        return B;
    }

    //NOTE: if you find any issue with the driver code please inform AIB
    //DO NOT TOUCH THE DRIVER CODE BELOW
    public static void main(String[] args){
        System.out.println("==============Test Case 1=============");
        Node head = LinkedList.createList(new Character[]{'B', 'M', 'D', 'T', 'N', 'O', 'A', 'P', 'S', 'C'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> C -> A -> T");
        Node result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result); //This should print null -> C -> A -> T
        System.out.println();
        System.out.println("==============Test Case 2=============");
        head = LinkedList.createList(new Character[]{'Z', 'O', 'T', 'N', 'X'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> N");
        result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result); //This should print null -> N
        System.out.println();
    }
}
