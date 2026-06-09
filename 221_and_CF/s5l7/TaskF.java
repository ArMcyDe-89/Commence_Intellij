import java.io.*;
import java.util.*;
public class TaskF {
    public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw= new PrintWriter(System.out);
    public static List<int[]> [] graph;
    public static void main(String[] args) throws  Exception{
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), S =Integer.parseInt(st.nextToken()), D = Integer.parseInt(st.nextToken());
        
        graph = new ArrayList[N]; for(int i=0;i<N;i++){graph[i] = new ArrayList<>();}
        
        for(int i=0;i<M;i++){
            st = new StringTokenizer(bf.readLine());
            int  a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
            graph[a-1].add(new int[]{b-1,c}); graph[b-1].add(new int[]{a-1,c});
        }

        pw.println(secDijkstra(S-1, D-1)); pw.flush();
    }

    private static int secDijkstra(int S, int D){
        int dist[][] = new int[graph.length][2];
        for(int i=0;i<dist.length;i++){dist[i][0] = Integer.MAX_VALUE; dist[i][1] = Integer.MAX_VALUE;}
        PriorityQueue <int[]> pq= new PriorityQueue<>((a,b) -> a[1]-b[1]);
        dist[S][0] = 0; dist[S][1] = Integer.MAX_VALUE; pq.add(new int[]{S,0});

        while(!pq.isEmpty()){
            int u [] = pq.remove(), x = u[0], y = u[1];

            if(dist[x][0]<y && dist[x][1]<y){continue;}

            for(int i=0;i<graph[x].size();i++){
                int t[] = graph[x].get(i), b = t[0], c = t[1];
                if (y+c < dist[b][0]) {
                    dist[b][1] = dist[b][0]; dist[b][0] = y+c; pq.add(new int[]{b, y+c});
                } else if (y+c < dist[b][1]) {
                    dist[b][1] = y+c; pq.add(new int[]{b, y+c});
                }
            }
        }
        if(dist[D][1] == Integer.MAX_VALUE){return -1;}
        return dist[D][1];
    }
}
