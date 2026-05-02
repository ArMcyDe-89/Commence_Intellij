import java.io.*;
import java.util.*;
public class TaskD {
    public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static List<Integer>[] graph;
    public static int [] weights;
    public static int [] dist;
    public static void main(String[] args) throws Exception{
        StringTokenizer st = new StringTokenizer(bf.readLine()), st1 = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), S = Integer.parseInt(st.nextToken()), D = Integer.parseInt(st.nextToken());

        graph = new ArrayList[N]; for(int i=0;i<N;i++){graph[i] = new ArrayList<>();}

        weights = new int[N]; int f=0; while(st1.hasMoreTokens()){weights[f++] = Integer.parseInt(st1.nextToken());}
        dist = new int[N]; Arrays.fill(dist, Integer.MAX_VALUE);
        for(int i=0;i<M;i++){
            st = new StringTokenizer(bf.readLine()); int a = Integer.parseInt(st.nextToken())-1, b = Integer.parseInt(st.nextToken())-1;
            graph[a].add(b);
        }
        pw.println(weightDijkstra(S-1, D-1)); pw.flush();
    }

    private static int weightDijkstra(int S, int D){
        PriorityQueue <int [] > pq = new PriorityQueue<>((a,b) -> a[1]-b[1]);
        dist[S] = weights[S]; pq.add(new int[]{S, weights[S]});

        while(!pq.isEmpty()){
            int u[] = pq.remove(), x = u[0], y = u[1];

            if(dist[x]!=y){continue;}

            for(int i=0;i<graph[x].size();i++){
                int t = graph[x].get(i);
                if (dist[t]> dist[x]+weights[t]) {
                    dist[t] = dist[x] + weights[t]; pq.add(new int[]{t,dist[t]});
                }
            }
        }
        if(dist[D] == Integer.MAX_VALUE){return -1;}
        return dist[D];
    }

}
