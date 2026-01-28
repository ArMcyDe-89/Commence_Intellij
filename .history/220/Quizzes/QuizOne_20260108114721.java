public class QuizOne {
    public static void warehouseDataRow(int [][]matrix, Node list1, Node list2){
        Node num = list1, pos = list2;
        for(int row =0; row<matrix.length;row++){
            Integer max = Integer.MIN_VALUE;
            for(int col = 0;col<matrix[row].length;col++){
                if(matrix[row][col]>max){max = matrix[row][col]; num.next.elem = max; pos.next.elem}
            }
        } 
    }

    class Node{
        Integer elem;
        Node next;
        public Node(){elem = null; next = null;}
        public Node(int e, Node n){ this.elem = e; this.next = n;}
    }

}
