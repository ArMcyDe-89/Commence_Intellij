import java.io.*;
import java.util.*;
public class TaskA {
    public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static List<int[]>[] graph;
    public static void main(String[] args) throws Exception{
        StringTokenizer st1 = new StringTokenizer(bf.readLine()), st2 = new StringTokenizer(bf.readLine()), st3 = new StringTokenizer(bf.readLine()), 
        st4  = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st1.nextToken()), M = Integer.parseInt(st1.nextToken()), S = Integer.parseInt(st1.nextToken()), D = Integer.parseInt(st1.nextToken());
        
        graph = new ArrayList[N]; for(int i=0;i<N;i++){graph[i] = new ArrayList<>();}

        for(int i=0;i<M;i++){
            graph[Integer.parseInt(st2.nextToken())-1].add(new int[]{Integer.parseInt(st3.nextToken())-1, Integer.parseInt(st4.nextToken())});
        }
        pw.println(Dijkstra(S-1, D-1)); pw.flush();
    }
    private static String Dijkstra(int S, int D){
        if(S==D){return "0\n"+(S+1);}
        int n = graph.length;
        int [] dist = new int[n], par = new int[n]; Arrays.fill(dist, Integer.MAX_VALUE); Arrays.fill(par, -1);
        PriorityQueue <int[]> pq = new PriorityQueue<>((a,b) -> a[1] - b[1]);
        dist[S] = 0; pq.add(new int[]{S,0}); boolean found = false;
        while(!pq.isEmpty()){
            int [] u = pq.remove();
            int x = u[0], y = u[1];

            if(y>dist[x]){continue;}

            for(int i=0;i<graph[x].size();i++){
                int t[] = graph[x].get(i), b = t[0], c = t[1];
                if (dist[x]+c<dist[b]) {
                    par[b] = x;
                    dist[b] = dist[x]+c;
                    pq.add(new int[]{b, dist[b]});
                }
            }
        }
        if(dist[D] == Integer.MAX_VALUE){return  "-1";}
        List <Integer> ll = new ArrayList<>(); 
        for(int i = D;i>-1;i = par[i]){
            ll.add(i+1);
        } Collections.reverse(ll);
        StringBuilder sb  = new StringBuilder(); for(int i=0;i<ll.size();i++){sb.append(ll.get(i)).append(" ");}
        return dist[D]+"\n"+sb.toString().trim(); 
    }
    // private static String Dijkstra(int s, int d){
    //     for(int i=0;i<dist.length;i++){
    //         dist[i] = Long.MAX_VALUE; parent[i] = -1;
    //     }
    //     PriorityQueue <long[]> pq = new PriorityQueue<>((a,b) -> Long.compare(a[0], b[0]));
    //     pq.add(new long[]{0, s});
    //     int l=0, p=-1;
    //     while(!pq.isEmpty()){
    //         long [] v = pq.remove(); boolean found = false; if(v[1] == d){found = true;}
    //         if(!(v[0]> dist[(int)v[1]])){
    //             for(int i=0;i<graph[(int)v[1]].size();i++){
    //                 long [] t = graph[(int)v[1]].get(i);
    //                 if (dist[(int)t[0]] > dist[(int)v[1]]+ t[1]) {
    //                     dist[(int)t[0]] = dist[(int)v[1]]+ t[1];
    //                     parent[(int)t[0]] = v[1]; pq.add(new long[]{dist[(int)t[0]], (int)t[0]});
    //                 }
    //                 if(found){l = (int)dist[d];break;}
    //             }
    //         }
    //     }
    //     List <Integer> ll = new ArrayList<>();
    //     for(int i=d;i>-1; i = (int)parent[i]){
    //         ll.add(i+1);
    //     } Collections.reverse(ll);
    //     StringBuilder sb  =new StringBuilder(); for(int i=0;i<ll.size();i++){sb.append(ll.get(i)).append(" ");}
    //     return l+"\n"+sb.toString().trim();
    // }
    // private static String PrimsMST(int s){
    //     boolean visited [] = new boolean[graph.length];
    //     int [] distance = new int[graph.length], parent = new int[graph.length];
    //     PriorityQueue < int[]> pq = new PriorityQueue<>((a,b) -> a[1]-b[1]);
    //     for(int i=0;i<graph.length;i++){distance[i] = Integer.MAX_VALUE; parent[i] = -1;}
    //     distance[s] = 0; pq.add(new int[]{s,0}); StringBuilder sb = new StringBuilder();
    //     while(!pq.isEmpty()){
    //         int [] u = pq.remove();if (visited[u[0]]) continue;
    //         visited[u[0]] = true; sb.append(u[0]+1).append(" ");
    //         for(int i=0;i<graph[u[0]].size();i++){
    //             int x = (int)graph[u[0]].get(i)[0], y = (int)graph[u[0]].get(i)[1];
    //             if (!visited[x] && distance[x]>y) {
    //                 parent[x] = u[0]; distance[x] = y; pq.add(new int[] {x, distance[x]});
    //             }
    //         }
    //     }
    //     return sb.toString();
    // }
    // private static String Dijkstra(int S, int D){
    //     for(int i=0;i<dist.length;i++){
    //         dist[i] = Integer.MAX_VALUE; parent[i] = -1; visited[i] = false;
    //     }
    //     PriorityQueue <Integer> pq = new PriorityQueue<>((a,b) -> dist[a] - dist[b]);
    //     dist[S] = 0; pq.add(S);
    //     List<Integer> ll = new ArrayList<>(); boolean found = false; int p = -1;
    //     while (!pq.isEmpty()) { 
    //         int v = pq.remove();
    //         if(!visited[v]){
    //             visited[v] = true;  if(v == D){found = true; p = v; l = dist[v]; break;}
    //             for(int i=0;i<graph[v].size();i++){
    //                 int t = graph[v].get(i).val, w = graph[v].get(i).weight;
    //                 if (dist[t]>dist[v]+w) {
    //                     pq.add(t); dist[t] = dist[v]+w; parent[t] = v; 
    //                 }
    //             }
    //         }
    //     }
    //     if(found){
    //         for(int i = p; i>-1;i = parent[i]){
    //             ll.add(i);
    //         }
    //         Collections.reverse(ll);
    //         return ll.toString();
    //     }
    //     return "-1";
    // }
    // static class Node{
    //     public int val, weight;
    //     public Node(int v, int w){
    //         val = v; weight = w;
    //     }
    // }
}
        // StringTokenizer st = new StringTokenizer(bf.readLine());
        // int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), S= Integer.parseInt(st.nextToken()), D = Integer.parseInt(st.nextToken());
        // StringTokenizer st1 = new StringTokenizer(bf.readLine()), st2 = new StringTokenizer(bf.readLine()), st3 = new StringTokenizer(bf.readLine());
        // graph = new ArrayList[N]; visited = new boolean[N]; dist = new long[N]; parent = new long[N]; for(int i=0;i<N;i++){graph[i] = new ArrayList<>();}
        // for(int i=0;i<M;i++){
        //     int a = Integer.parseInt(st1.nextToken()), b = Integer.parseInt(st2.nextToken());
        //     graph[a-1].add(new long[]{b-1, Integer.parseInt(st3.nextToken())}); 
        // }
        // pw.println(Dijkstra(S-1, D-1));
        // pw.flush();