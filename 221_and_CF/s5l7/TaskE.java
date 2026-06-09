import java.io.*;
import java.util.*;
public class TaskE {
    public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static List<int[]> []graph;
    public static void main(String[] args) throws Exception{
        StringTokenizer st = new StringTokenizer(bf.readLine()), st1 = new StringTokenizer(bf.readLine()), st2 = new StringTokenizer(bf.readLine()), st3 = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
        
        graph = new ArrayList[N]; for(int i=0;i<N;i++){graph[i] = new ArrayList<>();}
        
        for(int i=0;i<M;i++){
            int a = Integer.parseInt(st1.nextToken()), b = Integer.parseInt(st2.nextToken()), c = Integer.parseInt(st3.nextToken());
            graph[a-1].add(new int[]{b-1,c});
        }
        pw.println(conDijkstra(N)); pw.flush();
    }
    private static int conDijkstra(int N){
        int [][] dist = new int[N][2]; for(int i=0;i<N;i++){dist[i][0] = Integer.MAX_VALUE; dist[i][1] = Integer.MAX_VALUE;}
        PriorityQueue <int[]> pq = new PriorityQueue<>((a,b) -> a[1]-b[1]);
        dist[0][0] = 0; dist[0][1] = 0;
        pq.add(new int[]{0,0,0}); pq.add(new int[]{0,0,1});
        
        while(!pq.isEmpty()){
            int u [] = pq.remove(), x = u[0], y = u[1], p = u[2];

            if(y>dist[x][p]){continue;}

            for(int i=0;i<graph[x].size();i++){
                int t[] = graph[x].get(i), b = t[0], c = t[1];
                if ( (p != c%2) && (dist[b][c%2]>dist[x][p]+c) ){
                    dist[b][c%2] = dist[x][p]+c; pq.add(new int[]{b,dist[b][c%2], c%2});
                }
            }
        }
        if(dist[N-1][0] == Integer.MAX_VALUE && dist[N-1][1] == Integer.MAX_VALUE){return -1;}
        return Math.min(dist[N-1][0], dist[N-1][1]);
    }
}
