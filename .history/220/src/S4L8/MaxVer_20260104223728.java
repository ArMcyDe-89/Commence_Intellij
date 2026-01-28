import org.w3c.dom.Node;

public class MaxVer {
    public Integer MaxDeg(Integer [][] arr) {
        int vertex = 0, Max = 0;
        for(int i =0; i< arr.length; i++){ int count = 0;
            for(int j = 0; j<arr[i].length; j++){
                if(arr[i][j] == 1){count++;}
            }
            if (count>Max) {
                Max = count; vertex = i;
            }
        }
        return Max;        
    }
    public Integer MaxDeg(EdgeNode [] arr) {
        int Max = 0, vertex = 0;
        for(int i =0; i< arr.length; i++){
            EdgeNode N = arr[i]; int count = 0;
            while (N!=null) {
                count++; N= N.next;
            }if(count>Max){Max=count; vertex=i;}
        }
        return Max;        
    }

    public Integer task_2a_MAT(Integer [][] arr) {
        int vertex = 0, Max = 0;
        for(int i =0; i< arr.length; i++){ int sum = 0;
            for(int j = 0; j<arr[i].length; j++){
                if(arr[i][j] != 0){sum+=arr[i][j];}
            }
            if (sum>Max) {
                Max = sum; vertex = i;
            }
        }
        return Max;        
    }

    public Integer task_2b_LIST(EdgeNode [] arr) { 
        int Max = 0, vertex = 0; EdgeNode MV = null;
        for(int i =0; i<arr.length; i++){
            EdgeNode N = arr[i]; int sum =0;
            while(N!=null){sum+=N.weight;N=N.next;}
            if(sum>Max){Max =sum; vertex=i; MV = arr[i];}
        }
        return Max;        
    }
        public Integer task_3a_MAT(Integer [][] arr) { 
        int vertex = 0, Max = 0;
        for(int i =0; i< arr.length; i++){ int sum = 0;
            for(int j = 0; j<arr[i].length; j++){
                if(arr[i][j] != 0){sum+=arr[i][j];}
            }
            if (sum>Max) {
                Max = sum; vertex = i;
            }
        }
        return Max;        
    }

    public Integer task_3b_LIST(Node [] arr) { 
        int Max = 0, vertex = 0; Node MV = null;
        for(int i =0; i<arr.length; i++){
            Node N = arr[i]; int sum =0;
            while(N!=null){sum+=N.weight;N=N.next;}
            if(sum>Max){Max =sum; vertex=i; MV = arr[i];}
        }
        return Max;        
    }
    public void GraphConvert_arr(Integer [][] arr) {
        for(int i =0; i<arr.length;i++){
            for(int j = i+1; j<arr[i].length;j++){
                int sum = arr[i][j]+arr[j][i];
                arr[i][j] = sum; arr[j][i] =sum;
            }
        }
    }
    public EdgeNode[] GraphConvert_list(EdgeNode [] list){
        EdgeNode [] copy = new EdgeNode[list.length];
        for(int i =0; i<list.length;i++){
            EdgeNode N = list[i];
            while(N!=null){
                Integer weight = N.weight, value = N.toV;
                GraphConvert_Helper(copy, i, value, weight);
                GraphConvert_Helper(copy, value, i, weight);
                N=N.next;
            }
        }
        return copy;
    }
    public void GraphConvert_Helper(EdgeNode [] copy, Integer i, Integer find, Integer weight){
        EdgeNode N = copy[i];
        while(N!=null){
            if(N.toV == find){N.weight+=weight;return;}
            N=N.next;
        }
        EdgeNode lost = new EdgeNode(find, weight); lost.next = copy[i];
        copy[i] = lost;
    }



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


}
