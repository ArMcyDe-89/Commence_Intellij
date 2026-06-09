import java.io.*;
import java.util.*;
public class TaskF {
    public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static int [] children;
    public static List <Integer> [] graph;
    public static boolean [] b;
    public static void main(String[] args) throws Exception{
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int nodes  = Integer.parseInt(st.nextToken()), root = Integer.parseInt(st.nextToken());
        graph = new ArrayList[nodes]; children = new int[nodes];  b = new boolean[nodes];
        for(int i=0;i<nodes;i++){graph[i]= new ArrayList<>();}
        for(int i=0;i<nodes-1;i++){
            st = new StringTokenizer(bf.readLine());
            int a  = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
            graph[a-1].add(b-1); graph[b-1].add(a-1);
        }
        DFScount(root-1);
        int Q = Integer.parseInt(bf.readLine());
        for(int i=0;i<Q;i++){
            pw.println(children[Integer.parseInt(bf.readLine())-1]);
        }
        pw.flush();
    }
    private static int DFScount(int root){
        if(b[root]){return 1;}
        b[root] = true; children[root]++;
        for(int i=0;i<graph[root].size();i++){
            if (!b[graph[root].get(i)]) {
                children[root]+= DFScount(graph[root].get(i));
            }
        }
        return children[root];
    }
    // private static int TreeBFS(List<Integer>[]  graph, int root, int X){
    //     if(graph.length == 1){return 1;}
    //     Queue <Integer> q = new ArrayDeque<>();
    //     boolean b [] = new boolean[graph.length];
    //     q.add(root); b[root] = true; int count=0;
    //     while(!q.isEmpty()){
    //         int v = q.remove();
    //         for(int i =0;i<graph[v].size();i++){
    //             if (!b[graph[v].get(i)]) {
    //                 q.add(graph[v].get(i)); b[graph[v].get(i)] = true;
    //                 if (graph[v].get(i) == X) {
    //                     count =  DFScount(b,graph,X);
    //                 }
    //             }
    //         }
    //     }
    //     return count;
    // }
    // private static int BFScount (boolean []b, List<Integer> []graph, int X){
    //     Queue <Integer> q = new ArrayDeque<>();
    //     int count = 0;
    //     q.add(X); b[X] = true;
    //     while(!q.isEmpty()){
    //         int v = q.remove(); count++;
    //         for(int i=0;i<graph[v].size();i++){
    //             if (!b[graph[v].get(i)]) {
    //                 b[graph[v].get(i)] = true; q.add(graph[v].get(i));
    //             }
    //         }
    //     }
    //     return count;
    // }
    // private static int DFScount(boolean [] b, List<Integer> []  graph, int X){
    //     if(b[X]){return 0;}
    //     b[X] = true; int count = 1;
    //     for(int i = 0;i<graph[X].size();i++){
    //         if(!b[graph[X].get(i)]){
    //             count+=DFScount(b, graph, graph[X].get(i));
    //         }
    //     }
    //     return count;
    // }
}
