public class QuizThreeD {
    // ---------------- NODE CLASS ----------------
    static class Node {
        Integer time;
        Integer room;

        public Node(Integer t, Integer r) {
            time = t;
            room = r;
        }          
        // Optional: toString for easy printing
        public String toString() {
            return "[Time: " + time + ", Room: " + room + "]";
        }
    }
    static Integer maxOccupiedRoom(int n, int[][] meetings, MaxHeap heap) {
        Integer rooms [] = new Integer[n];

        for(int i=0;i<meetings.length;i++){
            rooms[meetings[i][2]] = meetings[i][1] - meetings[i][0];
        }
        for(int i=0;i<rooms.length;i++){
            heap.insert(new Node(rooms[i], i));
        }
        return heap.extractMaxNode().room;
    }

        static class MaxHeap {
            private String[] tasks;
            private Integer[] heap;
            private Node[] nodes; // Added Node array
            private int size;

            public MaxHeap() {
            }

            public MaxHeap(int capacity) {
                heap = new Integer[capacity + 1];
                tasks = new String[capacity + 1];
                nodes = new Node[capacity + 1]; // Initialize Node array
                size = 0;
            }

            // ---------------- EXISTING INTEGER METHODS ----------------
            public void swim(Integer[] A, int i) {
                if (i > 1 && A[i / 2] < A[i]) {
                    int swap = A[i];
                    A[i] = A[i / 2];
                    A[i / 2] = swap;
                    swim(A, i / 2);
                }
            }

            public void insert(int in) {
                if (size < heap.length - 1) {
                    heap[++size] = in;
                    swim(heap, size);
                    return;
                }
                System.out.println("Heap is Full.");
            }

            public int extractMax() {
                int R = heap[1];
                heap[1] = heap[size];
                heap[size] = null;
                size--;
                sink(heap, 1, size);
                return R;
            }

            public void sink(Integer[] A, int i, int S) {
                if (2 * i > S) { return; }
                int big = 2 * i;
                if (2 * i + 1 <= S && A[2 * i + 1] > A[2 * i]) { big = 2 * i + 1; }
                if (A[big] > A[i]) {
                    int swap = A[big];
                    A[big] = A[i];
                    A[i] = swap;
                    sink(A, big, S);
                }
            }

            // ---------------- EXISTING STRING/TASK METHODS ----------------
            public void swim(String[] T, Integer[] A, int i) {
                if (i > 1 && A[i / 2] < A[i]) {
                    int swap = A[i];
                    A[i] = A[i / 2];
                    A[i / 2] = swap;
                    String S = T[i];
                    T[i] = T[i / 2];
                    T[i / 2] = S;
                    swim(T, A, i / 2);
                }
            }

            public void insert(String task, int in) {
                if (size < heap.length - 1) {
                    heap[++size] = in;
                    tasks[size] = task;
                    swim(tasks, heap, size);
                    return;
                }
                System.out.println("Heap is Full.");
            }

            public String extractMaxS() {
                String R = tasks[1];
                heap[1] = heap[size];
                heap[size] = null;
                tasks[1] = tasks[size];
                tasks[size] = null;
                size--;
                sink(tasks, heap, 1, size);
                return R;
            }

            public void sink(String[] T, Integer[] A, int i, int S) {
                if (2 * i > S) { return; }
                int big = 2 * i;
                if (2 * i + 1 <= S && A[2 * i + 1] > A[2 * i]) { big = 2 * i + 1; }
                if (A[big] > A[i]) {
                    int swap = A[big];
                    A[big] = A[i];
                    A[i] = swap;
                    String C = T[big];
                    T[big] = T[i];
                    T[i] = C;
                    sink(T, A, big, S);
                }
            }

            // ---------------- NEW NODE METHODS ----------------

            // Swim for Nodes (compares based on 'time')
            void swim(Node[] N, int i) {
                if (i > 1 && N[i / 2].time < N[i].time) {
                    Node swap = N[i];
                    N[i] = N[i / 2];
                    N[i / 2] = swap;
                    swim(N, i / 2);
                }
            }

            // Insert for Node
            void insert(Node n) {
                if (size < nodes.length - 1) {
                    nodes[++size] = n;
                    swim(nodes, size);
                    return;
                }
                System.out.println("Heap is Full.");
            }

            // Extract Max for Node
            Node extractMaxNode() {
                if (size == 0) return null;
                Node root = nodes[1];
                nodes[1] = nodes[size];
                nodes[size] = null;
                size--;
                sink(nodes, 1, size);
                return root;
            }

            // Sink for Nodes (compares based on 'time')
            void sink(Node[] N, int i, int S) {
                if (2 * i > S) { return; }
                int big = 2 * i;
                // Compare children based on 'time'
                if (2 * i + 1 <= S && N[2 * i + 1].time > N[2 * i].time) {
                    big = 2 * i + 1;
                }
                // Compare parent with larger child
                if (N[big].time > N[i].time) {
                    Node swap = N[big];
                    N[big] = N[i];
                    N[i] = swap;
                    sink(N, big, S);
                }
            }
    }

    // --- Driver Main ---
    public static void main(String[] args) {
        // Test Case 1
        int n1 = 3;
        int[][] meetings1 = {{0,10,0}, {5,15,1}, {20,30,0}, {0,5,1}};
        MaxHeap max1 = new MaxHeap(meetings1.length);
        System.out.println("Test Case 1: " + MaxOccupiedRoom(n1, meetings1, max1)); 
        // Expected: 0 (Room 0: 20, Room 1: 15, Room 2: 0)

        // Test Case 2
        int n2 = 2;
        int[][] meetings2 = {{1,4,0}, {5,8,1}, {2,6,0}};
        MaxHeap max2 = new MaxHeap(meetings2.length);
        System.out.println("Test Case 2: " + MaxOccupiedRoom(n2, meetings2,max2)); 
        // Expected: 0 (Room 0: 7, Room 1: 3)

        // Test Case 3
        int n3 = 3;
        int[][] meetings3 = {{0,5,1}, {5,10,2}, {10,15,1}};
        System.out.println("Test Case 3: " + MaxOccupiedRoom(n3, meetings3)); 
        // Expected: 1 (Room 1: 10, Room 2: 5, Room 0: 0)
    }

}
