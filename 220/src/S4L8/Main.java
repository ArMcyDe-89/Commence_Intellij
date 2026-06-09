public class Main {
    public static void main(String[] args) {
        MaxVer solver = new MaxVer();

        // ==========================================
        // TEST 1: ADJACENCY MATRIX
        // ==========================================
        System.out.println("--- TESTING ADJACENCY MATRIX ---");
        
        // Sample Graph: 
        // 0 -> 1 (5)
        // 1 -> 0 (3), 1 -> 2 (2)
        // 2 -> (no outgoing)
        Integer[][] matrix = {
            {0, 5, 0},
            {3, 0, 2},
            {0, 0, 0}
        };

        // 1. Check Max Degree (Count of edges) - expecting Node 1 (count 2)
        // Note: Your MaxDeg logic for Matrix counts edges with value '1'. 
        // Since this is a weighted graph, this might return 0 unless we treat >0 as edge.
        // For this test, I will assume your MaxDeg is intended for unweighted 0/1 matrices.
        Integer[][] binaryMatrix = { {0, 1, 0}, {1, 0, 1}, {0, 0, 0} };
        System.out.println("Max Degree (Count): " + solver.MaxDeg(binaryMatrix));

        // 2. Check Out-Degree Sum (Task 2a/3a)
        // Node 0 sum = 5. Node 1 sum = 3+2=5. Max should be 5.
        System.out.println("Max Out-Degree Sum: " + solver.task_2a_MAT(matrix));

        // 3. Check Conversion (Directed -> Undirected)
        // Expectation: 0-1 becomes 5+3=8. 1-2 becomes 2+0=2.
        solver.GraphConvert_arr(matrix);
        System.out.println("Matrix after Conversion (Expected Symmetric):");
        printMatrix(matrix);


        // ==========================================
        // TEST 2: ADJACENCY LIST
        // ==========================================
        System.out.println("\n--- TESTING ADJACENCY LIST ---");

        // Building the Graph:
        // 0 -> 1 (weight 5)
        // 1 -> 0 (weight 3) -> 2 (weight 2)
        EdgeNode[] list = new EdgeNode[3];
        
        // Node 0 list: Head -> [1 | 5] -> null
        list[0] = new EdgeNode(1, 5);
        
        // Node 1 list: Head -> [0 | 3] -> [2 | 2] -> null
        list[1] = new EdgeNode(0, 3);
        list[1].next = new EdgeNode(2, 2);
        
        // Node 2 list: null

        // 1. Check Conversion (Directed -> Undirected)
        EdgeNode[] undirectedList = solver.GraphConvert_list(list);
        System.out.println("List after Conversion:");
        printList(undirectedList);
        
        // Note: I am skipping MaxDeg(Node[]) and task_2b(Node[]) in this specific run
        // because your code uses 'Node' class for those but 'EdgeNode' for conversion.
        // If 'Node' and 'EdgeNode' are the same, you can cast or rename them.
    }

    // --- HELPER TO PRINT MATRIX ---
    public static void printMatrix(Integer[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // --- HELPER TO PRINT LIST ---
    public static void printList(EdgeNode[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(i + ": ");
            EdgeNode curr = list[i];
            while (curr != null) {
                System.out.print("-> [" + curr.toV + " | w:" + curr.weight + "] ");
                curr = curr.next;
            }
            System.out.println();
        }
    }
}