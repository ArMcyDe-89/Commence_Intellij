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
    static int maxOccupiedRoom(int n, int[][] meetings, MaxHeap heap) {
        Integer rooms [] = new Integer[n]; MaxHeap max = new MaxHeap(meetings.length);
        for(int i=0;i<meetings.length;i++){
            rooms[meetings[i][2]] = meetings[i][1] - meetings[i][0];
        }
        for(int i=0;i<rooms.length;i++){
            max.insert(new Node(rooms[i], i));
        }
    }

        class MaxHeap {
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

}
