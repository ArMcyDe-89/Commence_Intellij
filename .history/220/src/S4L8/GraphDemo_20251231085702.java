// EdgeNode.java
class EdgeNode {
    int toV;
    int weight;
    EdgeNode next;

    public EdgeNode(int toV, int weight) {
        this.toV = toV;
        this.weight = weight;
        this.next = null;
    }
}

// GraphUtils.java
class GraphUtils {
    // Print a single adjacency list (linked list)
    public static void printLL(EdgeNode head) {
        EdgeNode n = head;
        while (n != null) {
            System.out.print(" -> (" + n.toV + "," + n.weight + ")");
            n = n.next;
        }
        System.out.println();
    }

    // Append a new edge node to adjacency list
    public static void appendLL(EdgeNode head, EdgeNode eNode) {
        EdgeNode n = head;
        while (n.next != null) {
            n = n.next;
        }
        n.next = eNode;
    }

    // Add an edge to adjacency list (undirected graph)
    public static void addEdge(EdgeNode[] adjList, int from, int to, int weight) {
        EdgeNode newNode = new EdgeNode(to, weight);
        if (adjList[from] == null) {
            adjList[from] = newNode;
        } else {
            GraphUtils.appendLL(adjList[from], newNode);
        }

        // For undirected graph: also add reverse edge
        EdgeNode reverseNode = new EdgeNode(from, weight);
        if (adjList[to] == null) {
            adjList[to] = reverseNode;
        } else {
            GraphUtils.appendLL(adjList[to], reverseNode);
        }
    }

    // Show adjacency list for all vertices
    public static void showAdjList(EdgeNode[] adjList) {
        for (int i = 0; i < adjList.length; i++) {
            System.out.print("Vertex " + i + ":");
            printLL(adjList[i]);
        }
    }
}

// GrpahDemo.java
public class GraphDemo {
    public static void main(String[] args) {
        int V = 5; // number of vertices
        EdgeNode[] adjList = new EdgeNode[V]; // array of adjacency lists

        // Add edges (undirected)
        GraphUtils.addEdge(adjList, 0, 1, 2);
        GraphUtils.addEdge(adjList, 0, 3, 6);
        GraphUtils.addEdge(adjList, 2, 3, 1);
        GraphUtils.addEdge(adjList, 2, 4, 4);

        // Show adjacency list
        System.out.println("Adjacency List Representation:");
        GraphUtils.showAdjList(adjList);
    }

}
