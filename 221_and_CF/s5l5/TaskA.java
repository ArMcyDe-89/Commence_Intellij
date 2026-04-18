import java.io.*;
import java.util.*;

public class TaskA {
    public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static void main(String[] args) throws Exception{
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int cities = Integer.parseInt(st.nextToken()), roads = Integer.parseInt(st.nextToken());
        List<Integer>[] graph = new ArrayList[cities];
        for(int i=0;i<cities;i++){
            graph[i] = new ArrayList<>();
        }
        for(int i =0;i<roads;i++){
            st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
            graph[a-1].add(b-1); graph[b-1].add(a-1);
        }
        pw.println(BFS(graph)); pw.flush();
    }
    private static String BFS(List<Integer> [] graph){
        Queue<Integer> q  = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        boolean [] b = new boolean[graph.length];
        q.add(0); b[0] = true;
        while(!q.isEmpty()){
            int v = q.remove();
            sb.append(v+1).append(" ");
            for(int i=0;i<graph[v].size();i++){
                int k = graph[v].get(i);
                if(b[k]){continue;}
                b[k] = true;
                q.add(k);
            }
        }
        return sb.toString();
    }
}
