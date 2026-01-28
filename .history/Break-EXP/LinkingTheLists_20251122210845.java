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
        System.out.println(NodeFromLast(LinkedList.createList(new Object[] {10,20,30,40,50}), 2));
        System.out.println(checkPalindrome(LinkedList.createList(new Object[]{1 , 2 , 3 ,4,4,3, 2 ,1 })));
        RemoveSeconds(LinkedList.createList(new Object[] {10,20,30,40,50,60,70,80,100,110,120}));
        swapNodes(LinkedList.createList(new Object[] {1,2,3,4,5}), 2);
        int[][] matrix = {
            {21, 129, 43},
            {54, 23, 35},
            {12, 67, 66},
            {77, 45, 89},
            {33, 70, 68},
            {103, 122, 58}
        };
        int [][] M = {{1,2,3},{4,5,6},{7,8,9}}; Object CL [] = {3,0,2,4,3,2}; Node H1 = LinkedList.createList(CL);
        Object AV [] = {10,20,30,40,50};
        Node pool = LinkedList.createList(AV);
        Node list1 = new Node(null); 
        Node list2 = new Node(null);

        // Process the warehouse grid
        warehouseDataRow(matrix, list1, list2);
        LinkedList.printLL(list1);
        LinkedList.printLL(list2);
        Node H2 = new Node(null);
        buildEvenOddList(M, H1, H2, M.length);
        LinkedList.printLL(H1);
        LinkedList.printLL(H2);
        
        LinkedList.printLL(reverseClip(pool, 2, 5));

    }
    public static Node reverseClip(Node HJ, int start,int end) {
        Node N  = HJ, rev = new Node(null); int count = 2;
        while(N.next!=null){
            if(count>=start && count<end){
                Node M  = new Node(N.elem); M.next = rev; rev = M;
            }
            N=N.next;count++;
        }
        N=HJ;count = 0;
        while(N.next!=null){
            Node save = null, put = rev;
            if(count == start-1){
                save = N;
            }
            if(count == end-1){
                while (put.next != null) {
                    put = put.next;
                }put.next = N.next; save.next = rev;
            }
            count++; N = N.next;
        }LinkedList.printLL(rev); 
        return HJ;
    }
    public static void InPlaceReverseList(Node head) {
        Node N = head, reverse = null, Next =null;
        while(N!=null){
            Next = N.next;
            N.next = reverse; reverse = N;
        }
    }
    public static void buildEvenOddList (int [][] M,Node  head1,Node head2, int n)  {
        Node N =  head1;
        while (N.next!=null) { int X = (int)M[((int)N.elem)%n][((int)N.next.elem)%n];
            if (X%2 == 0) {
                Node K = new Node(X);K.next = head2.next; head2.next = K;
            }
            else{
                Node V = head2; while (V.next!=null) {V=V.next;}
                V.next = new Node(X);
            }
            N=N.next;
        }
    }
    public static void warehouseDataRow(int [][]matrix, Node list1, Node list2){
        int shelf = -1, max = 0; Node L1 = list1, L2 = list2;
        for(int i = 0; i<matrix.length;i++){
            for(int j =0; j<matrix[i].length-1;j++){
                if(matrix[i][j]>matrix[i][j+1]){shelf = j;max = matrix[i][j];}else if(matrix[i][j+1]>max){shelf=j+1; max = matrix[i][j+1];}
            }L1.next = new Node (max); L1 = L1.next; L2.next = new Node(shelf+1); L2=L2.next; shelf = -1;
        }
        //To Do
    }

    public static void swapNodes(Node head, int n) {
        Node N =head,M = head;int length = 0; int found1 = 1,found2=0;
        while (N!=null) {
            length++; N =N.next;
        } N = head;
        while(N.next!=null){
            if(found1 == n-1){
                break;
            }
            N = N.next; found1++;
        }
        while(M.next!=null){
            if(found2 == (length-n-1)){
                break;
            } M = M.next; found2++;
        }Node swap = M.next;
        M.next = N.next; M.next.next = swap.next;
        LinkedList.printLL(head);
    }
    public static void RemoveSeconds(Node head) {//2.10
        Node N = head;
        while (N.next!=null) {
            N.next = N.next.next; N = N.next;
        } LinkedList.printLL(head);
    }
    public static boolean checkPalindrome(Node head) { //2.9
        Node N = head; int count =0;
        while(N!=null){
            count++; N= N.next;
        } System.out.println(count);
        N= head; Node M = head;int reach = 0;
        int lim = 0;
        if(count%2 == 0){lim = (count/2)+1;} lim = (count/2);
        while (reach<(lim)) {;
            M =M.next;reach++;
        }
        Node pal = new Node(null);
        while (M!=null) {
            Node put = new Node(M.elem); put.next = pal; pal = put; M = M.next;
        }
        Node T = pal;
        while(T.next.elem != null){
            T = T.next; 
        } T.next = null;
        LinkedList.printLL(pal);
        boolean B = true;
        while (pal!=null) { if(pal.elem == null){ return B;}
            if((int)pal.elem == (int)N.elem){System.out.println("pal "+pal.elem+" N "+N.elem);
                pal = pal.next; N = N.next; B =true; continue;
            } B =false;return B;
        }return B;

    }
    public static int NodeFromLast(Node head, int n) { //2.5
        Node N  = head; int length = 0; int found = 0;
        while (N!=null) {
            length++; N =N.next;
        } N= head;
        LinkedList.printLL(head);
        System.out.println("Length - "+length);
        while (N!= null) {
            if (found == (length-n)) {
                return (int)N.elem;
            }found++; N = N.next;
        }
        return Integer.MIN_VALUE;
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