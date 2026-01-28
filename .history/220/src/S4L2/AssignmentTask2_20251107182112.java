// AssignmentTask2: Organize Books
import java.util.Arrays;
public class AssignmentTask2{
    
    // MUST SUBMIT this method
    public static Node organizeBooks(Node head, Integer[] popularity) {
        //TO DO
        Node N = head;
        for(int i =0;i<popularity.length-1;i++){
            if (i==0 && popularity[i]<popularity[i+1]){
                int X = popularity[i]; popularity[i] = popularity[i+1]; popularity[i+1] = X;
                Node M = N.next; N.next = N.next.next; M.next = N; head = M; N = head; LinkedList.printLL(N);System.out.println(Arrays.toString(popularity));
            }
            else if (popularity[i]<popularity[i+1]){
                int X = popularity[i],pos =0; popularity[i] = popularity[i+1]; popularity[i+1] = X; 
                while (pos<i-1){
                    N = N.next;
                    pos++;
                }
                Node M = N.next; Node J = N.next.next; M.next = J.next; J.next = M; N.next = J; N = head; i=0;LinkedList.printLL(N);System.out.println(Arrays.toString(popularity));
            }
            if (i==0 && popularity[i]<popularity[i+1]){
                int X = popularity[i]; popularity[i] = popularity[i+1]; popularity[i+1] = X;
                Node M = N.next; N.next = N.next.next; M.next = N; head = M; N = head;
            }
        }
        return head; // Remove this when you're ready to return the new head
    }

    //NOTE: if you find any issue with the driver code please inform AIB
    //DO NOT MAKE ANY MODIFICATIONS IN THE TESTER CODE BELOW
    //DO NOT SUBMIT THE DRIVER CODE BELOW
    public static void main(String[] args) {
        System.out.println("=================Test Case 1=================");
        Node books = LinkedList.createList(new String[]{"Dune", "IT", "Coraline", "Inferno", "Twlight"});
        Integer[] arr = { 8, 10, 5, 10, 6};

        System.out.println("Sample Given LinkedList and Popularity array:  ");
        LinkedList.printLL(books);
        System.out.println(Arrays.toString(arr));
        
        System.out.println("\nExpected Output");
        System.out.println("IT -> Inferno -> Dune -> Twilight -> Coraline");
        
        System.out.println("Your Output");
        books = organizeBooks( books, arr );
        LinkedList.printLL(books);

       
        System.out.println("=================Test Case 2=================");
        Node books2 = LinkedList.createList(new String[]{"Hamlet", "Persuasion", "It", "Dracula", "Beloved"});
        Integer[] arr2 = {7, 9, 9, 6, 7};

        System.out.println("Sample Given LinkedList and Popularity array:  ");
        LinkedList.printLL(books2);
        System.out.println(Arrays.toString(arr2));

        System.out.println("\nExpected Output");
        System.out.println("Persuasion -> It -> Hamlet -> Beloved -> Dracula");

        System.out.println("Your Output");
        books2 = organizeBooks(books2, arr2);
        LinkedList.printLL(books2);


        System.out.println("=================Test Case 3=================");
        Node books3 = LinkedList.createList(new String[]{"Matilda", "Franny", "Foundation", "Carrie", "Misery"});
        Integer[] arr3 = {5, 8, 8, 10, 6};

        System.out.println("Sample Given LinkedList and Popularity array:  ");
        LinkedList.printLL(books3);
        System.out.println(Arrays.toString(arr3));

        System.out.println("\nExpected Output");
        System.out.println("Carrie -> Franny -> Foundation -> Misery -> Matilda");

        System.out.println("Your Output");
        books3 = organizeBooks(books3, arr3);
        LinkedList.printLL(books3);

    }
}
