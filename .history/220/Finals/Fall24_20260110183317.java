public class Fall24 {
    static String build_key(BTNode root){
        return keyHelp(root,0);
    }
    static String keyHelp(BTNode root, int lvl){
        if(root == null){return "";}
        if((lvl%2==0)&&root.left==null && root.right == null){return root.elem;}
        return keyHelp(root.right, lvl+1) + keyHelp(root.left, lvl+1);
    }
    static void cpu_scheduler(int [] tasks, int k){
        MaxHeap max = new MaxHeap(tasks.length);
        
    }
    static class BTNode {
        String elem;
        BTNode left, right;

        public BTNode(String elem) {
            this.elem = elem;
        }
    }

    static class MaxHeap {
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

    // --- DRIVER / MAIN METHOD ---
    public static void main(String[] args) {
        // Constructing the Tree from the Sample Image
        // Level 0: U
        // Level 1: V, W
        // Level 2: X, Y, Z, I
        // Level 3: J, N, L, M
        // Level 4: K

        // 1. Create all nodes
        BTNode u = new BTNode("U");
        BTNode v = new BTNode("V");
        BTNode w = new BTNode("W");
        BTNode x = new BTNode("X");
        BTNode y = new BTNode("Y");
        BTNode z = new BTNode("Z");
        BTNode i = new BTNode("I");
        BTNode j = new BTNode("J");
        BTNode n = new BTNode("N");
        BTNode l = new BTNode("L");
        BTNode m = new BTNode("M");
        BTNode k = new BTNode("K");

        // 2. Link them manually (since constructor only takes elem)
        
        // Root links
        u.left = v;
        u.right = w;

        // Level 1 links
        v.left = x;
        v.right = y;
        w.left = z;
        w.right = i;

        // Level 2 links
        x.left = j;
        x.right = n;
        z.left = l;
        z.right = m;
        // y and i are leaves at Level 2

        // Level 3 links
        j.left = k; 
        // n, l, m are leaves at Level 3
        
        // k is a leaf at Level 4

        // --- RUN TEST ---
        System.out.println("--- Tree Key Generation ---");
        String result = build_key(u);
        System.out.println("Generated Key: " + result);

        // Expected Logic:
        // Leaves (Right-to-Left): I(Lvl 2), M(Lvl 3), L(Lvl 3), Y(Lvl 2), N(Lvl 3), K(Lvl 4)
        // Even Levels Only: I, Y, K
        if (result.equals("IYK")) {
            System.out.println("Status: CORRECT");
        } else {
            System.out.println("Status: WRONG (Expected IYK)");
        }
    }
}
