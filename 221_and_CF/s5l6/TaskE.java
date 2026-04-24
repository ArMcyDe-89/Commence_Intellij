import java.io.*;
import java.util.*;

public class TaskE {
    public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static int  [] dis;
    public static void main(String[] args) throws Exception{
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), S = Integer.parseInt(st.nextToken()), Q = Integer.parseInt(st.nextToken());
        List<Integer> [] graph = new ArrayList[N]; dis = new int[N]; Arrays.fill(dis, -1);
        for(int i=0;i<N;i++){graph[i] = new ArrayList<>();}
        for(int i=0;i<M;i++){
            st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
            graph[a-1].add(b-1); graph[b-1].add(a-1);
        }
        Queue <Integer> q = new ArrayDeque<>();
        st = new StringTokenizer(bf.readLine()); while(st.hasMoreTokens()){int s = Integer.parseInt(st.nextToken())-1;q.add(s); dis[s] = 0;}
        multiBFS(graph, q);
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(bf.readLine()); while(st.hasMoreTokens()){sb.append(dis[Integer.parseInt(st.nextToken())-1]).append(" ");}
        pw.println(sb.toString().trim());
        pw.flush();
    }
    private static void multiBFS(List<Integer>[] graph, Queue<Integer> q){
        while(!q.isEmpty()){
            int v = q.remove();
            for(int i=0;i<graph[v].size();i++){
                int t = graph[v].get(i);
                if(dis[t] == -1){
                    dis[t] = dis[v]+1; q.add(t);
                }
            }
        }
    }
        
}
