import java.io.*;
import java.util.*;

public class TaskB {
    public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static List<int[]>[] graph;
    public static void main(String[] args) throws Exception{
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), S = Integer.parseInt(st.nextToken()), T = Integer.parseInt(st.nextToken());
        
        graph = new ArrayList[N]; for(int i=0;i<N;i++){graph[i] = new ArrayList<>();}
        int [] dist1 = new int[N], dist2 = new int[N]; Arrays.fill(dist1, Integer.MAX_VALUE); Arrays.fill(dist2, Integer.MAX_VALUE);
        for(int i=0;i<M;i++){
            StringTokenizer st1 = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st1.nextToken())-1, b = Integer.parseInt(st1.nextToken())-1, c =Integer.parseInt(st1.nextToken());
            graph[a].add(new int[]{b,c});
        }
        dist1 = DoubleDijkstra(S-1, dist1);
        dist2 = DoubleDijkstra(T-1, dist2);
        for(int i=0;i<N;i++){
            dist1[i] = Math.max(dist1[i], dist2[i]);
        }
        int count = 0, min_d = Integer.MAX_VALUE, min_t = -1;
        for(int i=0;i<N;i++){
            if(dist1[i] == Integer.MAX_VALUE){count++;continue;}
            if(dist1[i]<min_d){min_d = dist1[i]; min_t = i+1;}
        }
        if(count == N){pw.println(-1);}else{pw.println(min_d+" "+min_t);}
        pw.flush();
    }
    private static int [] DoubleDijkstra(int start, int [] dist){
        PriorityQueue <int[]> pq = new PriorityQueue<>((a,b) -> a[1]-b[1]);
        pq.add(new int[]{start,0});
        dist[start] = 0;

        while(!pq.isEmpty()){
            int [] u = pq.remove(); int x = u[0], y = u[1];

            if(y>dist[x]){continue;}

            for(int i=0;i<graph[x].size();i++){
                int t[] = graph[x].get(i), b = t[0], c= t[1];
                if (dist[x]+c<dist[b]) {
                    dist[b] = dist[x]+c;
                    pq.add(new int[]{b,dist[b]});
                }
            }
        }
        return dist;
    }
}
