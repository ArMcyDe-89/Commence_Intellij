public class Summer25 {
    public static String findPath(BTNode root, int [] seq){
        return helper(root, seq,0);
    }
// Recursive Helper
    public static String helper(BTNode root, int [] seq, int i){
        // 1. Safety Check: If we ran off the tree, the path doesn't exist.
        if (root == null) return "LOST";

        // 2. Validation: Does the CURRENT node match the sequence?
        // Your original code skipped this check for the root!
        if (root.elem != seq[i]) return "LOST";

        // 3. End of Sequence Check
        if (i == seq.length - 1) {
            // If we are at the end of the sequence AND it's a leaf:
            if (root.left == null && root.right == null) {
                return "ESCAPED";
            } 
            // If we are at the end but still have children:
            else {
                return "TRAPPED";
            }
        }

        // 4. Recursive Step
        // We need to see if we can continue to the next number in the sequence (seq[i+1])
        String result = "LOST";

        // Try to go LEFT if valid
        if (root.left != null && root.left.elem == seq[i+1]) {
            result = helper(root.left, seq, i + 1);
        }

        // If going Left resulted in "LOST" (or wasn't possible), try going RIGHT
        if (result.equals("LOST") && root.right != null && root.right.elem == seq[i+1]) {
            result = helper(root.right, seq, i + 1);
        }

        return result;
    }
    static void urgent_task(int [] tasks, int deadline){
        for(int i=0; i<tasks.length;i++){
            
        }
    }
    class MaxHeap {
    private String [] tasks;
    private Integer [] heap;
    private int size;
    public MaxHeap(){}
    public MaxHeap(int capacity){
        heap= new Integer[capacity+1]; tasks = new String[capacity+1]; size = 0;
    }
    public void swim(Integer [] A, int i){
        if (i>1 && A[i/2]<A[i]) {
            int swap = A[i]; A[i] = A[i/2]; A[i/2] = swap; swim(A,i/2); 
        }
    }
    public void insert(int in){
        if (size<heap.length-1) {
            heap[++size] = in; swim(heap,size); return;
        } System.out.println("Heap is Full.");
    }
    public int extractMax(){
        int R = heap[1];
        heap[1] = heap[size]; heap[size] = null;size--; sink(heap,1,size);
        return R; 
    }
    public void sink(Integer [] A, int i, int S){
        if(2*i>S){return;}
        int big = 2*i;
        if(2*i+1<=S && A[2*i+1]>A[2*i]){big = 2*i+1;}
        if(A[big]>A[i]){int swap = A[big]; A[big]= A[i]; A[i] = swap; sink(A, big, S);}
    }
    public Integer[] heapsort(){
        Integer copy [] = new Integer[heap.length]; int S = size;
        for(int i = 1; i<=S; i++){copy[i]=heap[i];}
        while(S>1){
            int swap = copy[S];
            copy[S--] = copy[1]; copy[1] = swap; sink(copy, 1, S);
        }
        return copy;
    }

    //For task - 5
    public void swim(String [] T,Integer [] A, int i){
        if (i>1 && A[i/2]<A[i]) {
            int swap = A[i]; A[i] = A[i/2]; A[i/2] = swap;
            String S = T[i]; T[i] = T[i/2]; T[i/2] = S;
            swim(T,A,i/2); 
        }
    }
    public void insert(String task, int in){
        if (size<heap.length-1) {
            heap[++size] = in; tasks[size] = task;swim(tasks,heap,size); return;
        } System.out.println("Heap is Full.");
    }
    public void sink(String [] T,Integer [] A, int i, int S){
        if(2*i>S){return;}
        int big = 2*i;
        if(2*i+1<=S && A[2*i+1]>A[2*i]){big = 2*i+1;}
        if(A[big]>A[i]){
            int swap = A[big]; A[big]= A[i]; A[i] = swap;
            String C = T[big]; T[big]= T[i]; T[i] = C;
            sink(T, A, big, S);
        }
    }
    public String extractMaxS(){
        String R = tasks[1]; //int r = heap[1];
        heap[1] = heap[size]; heap[size] = null;
        tasks[1] = tasks[size]; tasks[size] = null;size--; sink(tasks,heap,1,size);
        return R; 
    }
    public String[] heapsortS(){
        Integer copy [] = new Integer[heap.length]; String T [] = new String[heap.length]; int S = size;
        for(int i = 1; i<=S; i++){copy[i]=heap[i]; T[i]=tasks[i];}
        while(S>1){
            int swap = copy[S]; String C = T[S]; T[S] = T[1];
            copy[S--] = copy[1]; copy[1] = swap; T[1]=C; sink(T, copy, 1, S);
        }
        return T;
    }

}

    static class BTNode {
        int elem;
        BTNode left, right;

        public BTNode(int elem) {
            this.elem = elem;
        }
    }
    public static void main(String[] args) {
        // 1. Build the Tree shown in the image
        /*
                  1
                /   \
               0     1
              / \   / \
             1   0 0   1
            /
           1 (Leaf needed for "ESCAPED" case)
        */
        
        // Leaf nodes (Level 3)
        BTNode n1_leaf = new BTNode(1);
        BTNode n0_leaf = new BTNode(0);
        
        // Level 2 nodes
        BTNode n1_L_L = new BTNode(1); n1_L_L.left = n1_leaf; // This path makes 1-0-1-1 work
        BTNode n0_L_R = new BTNode(0); // Leaf
        
        BTNode n0_R_L = new BTNode(0); 
        n0_R_L.left = new BTNode(1); // Give it a child so 1-1-0 ends at a NON-LEAF
        
        BTNode n1_R_R = new BTNode(1); // Leaf

        // Level 1 nodes
        BTNode n0_L = new BTNode(0);
        n0_L.left = n1_L_L;
        n0_L.right = n0_L_R;

        BTNode n1_R = new BTNode(1);
        n1_R.left = n0_R_L;
        n1_R.right = n1_R_R;

        // Root
        BTNode root = new BTNode(1);
        root.left = n0_L;
        root.right = n1_R;

        // 2. Run Test Cases
        System.out.println("--- Maze Game Simulation ---");

        // Case 1: ESCAPED
        int[] seq1 = {1, 0, 1, 1};
        System.out.println("Seq {1, 0, 1, 1}: " + findPath(root, seq1) + " (Expected: ESCAPED)");

        // Case 2: TRAPPED
        int[] seq2 = {1, 1, 0};
        System.out.println("Seq {1, 1, 0}   : " + findPath(root, seq2) + " (Expected: TRAPPED)");

        // Case 3: LOST
        int[] seq3 = {1, 0, 0, 1};
        System.out.println("Seq {1, 0, 0, 1}: " + findPath(root, seq3) + " (Expected: LOST)");
    }
}
