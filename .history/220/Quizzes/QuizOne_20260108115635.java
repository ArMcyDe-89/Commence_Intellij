public class QuizOne {
    public static void warehouseDataRow(int [][]matrix, Node list1, Node list2){
        Node num = list1, pos = list2;
        for(int row =0; row<matrix.length;row++){
            Integer max = Integer.MIN_VALUE;
            for(int col = 0;col<matrix[row].length;col++){
                if(matrix[row][col]>max){max = matrix[row][col]; num.next.elem = new Node(max, null); pos.next.elem = new Node(col+1, null);}
            }num = num.next; pos = pos.next;
        } 
    }

    class Node{
        Integer elem;
        Node next;
        public Node(){elem = null; next = null;}
        public Node(int e, Node n){ this.elem = e; this.next = n;}
    }

    public static void printList(Node head) {
        System.out.print("DH-> ");
        Node current = head.next; // Skip the dummy head for printing data
        while (current != null) {
            System.out.print(current.elem + "-> ");
            current = current.next;
        }
        System.out.println("Null");
    }

    // ==========================================
    // DRIVER / MAIN METHOD
    // ==========================================
    public void main(String[] args) {
        // 1. Setup the Sample Matrix from the image
        int[][] matrix = {
            {21, 129, 43},
            {54, 23,  35},
            {12, 67,  66},
            {77, 45,  89},
            {33, 70,  68},
            {103, 122, 58}
        };

        // 2. Create Dummy Head Nodes (Values don't matter, usually -1 or 0)
        Node list1_DH = new Node(); 
        Node list2_DH = new Node();

        // 3. Run the analysis
        warehouseDataRow(matrix, list1_DH, list2_DH);

        // 4. Print results to verify against the Sample Output
        System.out.println("List 1 (Max Values):");
        printList(list1_DH);

        System.out.println("\nList 2 (Positions):");
        printList(list2_DH);
    }

}
