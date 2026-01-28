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
        for(int i =0; i<tasks.length;i++){max.insert(tasks[i]);}
        for(int i =0;i<k;i++){System.out.printf("Task %d - Priority %d\n",i+1,max.extractMax());}
    }
    static class BTNode {
        String elem;
        BTNode left, right;

        public BTNode(String elem) {
            this.elem = elem;
        }
    }

    static boolean is_complete(Edge[] net){
        boolean [] met = new boolean[net.length];
        for(int i =0;i<net.length;i++){
            Edge N = net[i];
            while(N!=null){
                met[Integer.parseInt(N.destination)] = true;
                N=N.next;
            }
            int count = 0;
            //for(int j =0; j<met.length;j++){if(i==j){continue;}if(met[j] == false){return false;}}
            for(int j =0; j<met.length;j++){if(met[j] == false){count++;}}if(){}
        }

        return true;
    }

    static class Edge {
        String source;
        String destination;
        Integer weight;
        Edge next;

        public Edge(String src, String dest, int w, Edge nextEdge) {
            this.source = src;
            this.destination = dest;
            this.weight = w;
            this.next = nextEdge;
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
// --- HELPER TO ADD EDGES (For cleaner main method) ---
    // Adds an edge to the front of the list for vertex u
    static void addInteraction(Edge[] network, int u, int v) {
        // Weight is irrelevant for this problem, using 1
        String src = String.valueOf(u);
        String dest = String.valueOf(v);
        
        Edge newEdge = new Edge(src, dest, 1, network[u]);
        network[u] = newEdge;
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


        //-------------TAsk2---------------

        int [] tasks = {45,70,85,60,90,75}; cpu_scheduler(tasks, 3); 

        //===============TAsk3=====================

        // --- TEST CASE 1: COMPLETE GRAPH ---
        // Based on the first example in the image
        int N = 4;
        Edge[] network1 = new Edge[N];

        // Participant 0 interacts with 1, 2, 3
        addInteraction(network1, 0, 1);
        addInteraction(network1, 0, 2);
        addInteraction(network1, 0, 3);

        // Participant 1 interacts with 0, 2, 3
        addInteraction(network1, 1, 0);
        addInteraction(network1, 1, 2);
        addInteraction(network1, 1, 3);

        // Participant 2 interacts with 0, 1, 3
        addInteraction(network1, 2, 0);
        addInteraction(network1, 2, 1);
        addInteraction(network1, 2, 3);

        // Participant 3 interacts with 0, 1, 2
        addInteraction(network1, 3, 0);
        addInteraction(network1, 3, 1);
        addInteraction(network1, 3, 2);

        System.out.println("--- Test Case 1 ---");
        boolean result1 = is_complete(network1);
        System.out.println("Expected: true");
        System.out.println("Actual:   " + result1);
        System.out.println(result1 ? "Status: CORRECT" : "Status: WRONG");
        System.out.println();


        // --- TEST CASE 2: INCOMPLETE GRAPH ---
        // Based on the second example in the image
        Edge[] network2 = new Edge[N];

        // Participant 0: 1, 2, 3 (Met everyone)
        addInteraction(network2, 0, 1);
        addInteraction(network2, 0, 2);
        addInteraction(network2, 0, 3);

        // Participant 1: 0, 2 (Has NOT met 3)
        addInteraction(network2, 1, 0);
        addInteraction(network2, 1, 2); // 1->1 in image? Assuming 1->2 based on logic.
        addInteraction(network2, 1, 0);
        // Missing interaction with 3

        // Participant 2: 0, 1, 3 (Met everyone)
        addInteraction(network2, 2, 0);
        addInteraction(network2, 2, 1);
        addInteraction(network2, 2, 3);

        // Participant 3: 3->1, 3->2 (Has NOT met 0)
        // Wait, image says "3: (3,1)->(3,2)->(3,2)". 
        // Note: 3 interacts with 1 and 2. Missing 0.
        addInteraction(network2, 3, 1);
        addInteraction(network2, 3, 2);
        addInteraction(network2, 3, 2);
        // Missing interaction with 0

        System.out.println("--- Test Case 2 ---");
        boolean result2 = is_complete(network2);
        System.out.println("Expected: false");
        System.out.println("Actual:   " + result2);
        System.out.println(!result2 ? "Status: CORRECT" : "Status: WRONG");
    }
}
