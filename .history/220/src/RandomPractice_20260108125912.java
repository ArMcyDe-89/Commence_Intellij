import java.util.*;

public class RandomPractice {
    public void main(String[] args){
        // String[][] seatStatus = {
        //         {"A" , "B"  , "C"  , "D"  , "E"},
        //         {"F" , "G"  , "H"  , "I"  , "J"},
        //         {"K" , "L"  , "M"  , "N"  , "O"},
        //         {"P" , "Q"  , "R"  , "S"  , "T"},
        //         {"U" , "V"  , "W"  , "X"  , "Y"},
        //         {"Z" , "AA" , "BB" , "CC" , "DD"}
        // };
        int [] arr = {2,34,6,65,8,80,3,321,8,23,7,34,9,0,2,54,1,43,32,46,24,476,2355,434,2,7,564523,3,2,6553,3,14,7687,1};
        Scanner sc = new Scanner(System.in);
        System.out.println("how many times should it turn?");
        int n = sc.nextInt(); sc.close();
        rotatearray(n,arr);
        LinearSearch(arr, n);
        System.out.println(binarySearch(arr, n)+" indexed");
        ReverseOut(arr);
        //ReverseIn(arr);
        //System.out.println(Arrays.deepToString(swapCol(seatStatus)));

        String[] b1 = {"Red Dagon","GreenWald", "Yellow Witch", "Red bash", "Blue juogo", "Green ARcher","Cyan","Navana","Shield","Hulk","BatMan","MEssi","Saitama","Gosling","Carrey"};
        Node building_1 = createList(b1);
        building_1 = ReverseListOut(building_1);
        printLL(building_1);
        building_1 = ReverseListIn(building_1);
        printLL(building_1);
        building_1=GoRight(building_1);
        printLL(building_1);  
        building_1=GoLeft(building_1);
        LinkedList.printLL(building_1);
        building_1 = GoRight(building_1,n);
        LinkedList.printLL(building_1);
        FindMid(building_1);


        // for(int i = 0;i% arr.length< arr.length; i++){
        //     System.out.println(arr[i% arr.length]); if(i == 9){break;}
        // }

//        System.out.println("Learning to switch");
//        switch (n){
//            case 1:
//                System.out.println("this is case 1"); break;
//            case 2:
//                System.out.println("this is 2"); break;
//                case 3:
//                    System.out.println("this is 3"); break;
//            default:
//                System.out.println("Invalid input");
//        }
    }

    public static void rotatearray(int n, int [] arr){
        for(int turn = 0; turn<n; turn++){
            int lost = arr[arr.length-1];
            for(int i = arr.length-1; i>0;i--){
                arr[i] = arr[i-1];
            }
            arr[0] = lost;
        }
        System.out.printf("the array has been rotated %d times.\n",n);
        System.out.println(Arrays.toString(arr));
    }
    public static void printInfinte(int [] arr){
        for(int i =0;i%arr.length<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void LinearSearch(int [] arr, int a){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == a){
                System.out.printf("%d has been found at index %d of the given array.\n",a,i); return;
            }
        }
        System.out.println("Not found");
    }


         

       public static void decrypt_matrix(int [][] M){
       int [] MAT = new int[M[0].length];
       int [] lin_arr = new int[MAT.length-1];

           for(int j = 0; j<M[0].length; j++){
               for(int k =0; k< M.length; k++){
                   MAT[j]+=M[k][j];
               }
           }

           int a =0;
           for(int b = 0; b< MAT.length-1;b++){
               lin_arr[a++] = MAT[b]-MAT[b+1];
           }
       System.out.println(Arrays.toString(lin_arr));
   }

    public static int binarySearch(int [] arr, int a){
        Arrays.sort(arr);
        int start=0, end = arr.length-1, mid=-1;
        while(start<=end){
            mid = (start+(end-start))/2;
            if(arr[mid]==a){System.out.println(Arrays.toString(arr));return mid;}
            if(a<arr[mid]){end = mid-1;continue;}
            start = mid+1;
        } System.out.println(Arrays.toString(arr)); return -1;

    }
    public static void ReverseOut(int [] arr){
        int [] rev_arr = new int[arr.length];
        for(int i = arr.length-1,j=0; i>0 && j<arr.length-1;i--,j++){
            rev_arr[j] = arr[i];
        }
        System.out.println("reversed array - \n"+Arrays.toString(rev_arr));
    }
    public static Object [] ReverseIn(Object [] arr){
        for(int i=0;i<(arr.length)/2;i++){
            Object save = arr[arr.length-1-i];
            arr[arr.length-1-i]=arr[i];
            arr[i] = save;
        } System.out.println("swapped in place \n"+Arrays.toString(arr)); return arr;
    }
    public static Object[][] swapCol(Object [][] arr){
        for(int i=0; i<arr.length;i++){
            ReverseIn(arr[i]);
        } return arr;
    }

    public Node ReverseListOut(Node List){
        Node N = List, Save =null;
        while(N!=null){
            Node M = new Node(N.elem); M.next = Save;
            Save = M;N = N.next;
        } return Save;
    }
    public static Node ReverseListIn(Node head){
        Node N = head, Last = null, Next = null;
        while(N!=null){
            Next = N.next;
            N.next = Last;
            Last = N;
            N = Next;
        }return Last;
    }
    public static Node GoRight(Node head){
        if(head==null|| head.next==null){return head;}
        Node N = head, save=null;
        while(N.next.next!=null){N=N.next;}save=N.next;N.next=null;save.next = head;
        return save;
    }
    public static Node GoRight(Node head,int k){
        // Node N=head, save=null;
        // while(k>0){
        //     while(N.next.next!=null){
        //         N=N.next;
        //     }save=N.next; N.next=null; save.next=head; N=save; head=save; k--;
        // }return N;
        Node N=head;
        while (k>0){
            N=GoRight(N); k--;
        } return N;
    }
    public static Node GoLeft(Node head){
        Node N = head, save=head.next;
        while(N.next!=null){
            N=N.next;
        }N.next=head;head.next=null;return save;
    }
    public static void FindMid(Node head){
        Node N = head; int count=0;
        while (N!=null){
            count++; N=N.next;            
        }N=head; System.out.println(count+" element(s) in the list.");
        if(count%2==0){
            // Node dummy = new Node(null);
            // dummy.next = head;int i=0;
            // while(i<(count/2)){i++;dummy=dummy.next;}System.out.println("Middle Nodes are - "+dummy.elem+" & "+dummy.next.elem);
            int i=0;
            while (i<(count/2)-1){
                i++; N=N.next;
            } System.out.println("Middle Nodes are - "+N.elem+" & "+N.next.elem);return;
        }
        int i=0;
        while(i<(count/2)){i++;N=N.next;}System.out.println("Middle Node is - "+N.elem);
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
        public Node createList( Object[] arr ){
        Node head = new Node( arr[0] );
        Node n = head;
        for ( int i=1; i<arr.length; i++ ){
            Node newN = new Node( arr[i] );
            n.next = newN;
            n = n.next;
        }
        return head;
    }

    public static void printLL(Node head){
        if (head==null) System.out.println();
            Node n = head;
            while (n!=null){
                if (n.next !=null)
                    System.out.print(n.elem+" -> ");
                else
                    System.out.println(n.elem);
                n = n.next;
            }
    }
}

