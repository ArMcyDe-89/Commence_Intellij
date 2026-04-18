import java.io.*;
import java.util.*;

public class TaskD {
    public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static List < Integer >[] graph;
    public static int dis;
    public static void main(String[] args) throws Exception{
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), S = Integer.parseInt(st.nextToken()), D = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken());
        graph = new ArrayList[N];
        for(int i=0;i<graph.length;i++){graph[i] = new ArrayList<>();}
        for(int i=0;i<M;i++){
            st = new StringTokenizer(bf.readLine());
            graph[Integer.parseInt(st.nextToken())-1].add(Integer.parseInt(st.nextToken())-1);
        }
        List <Integer> l1 = shortBFS(graph, S-1, K-1), l2 = shortBFS(graph, K-1, D-1); if(l1.getFirst().equals(-1) || l2.getFirst().equals(-1)){pw.println(-1);pw.flush();return;}
        l2.removeFirst(); l1.addAll(l2); dis = l1.size()-1;
        StringBuilder sb = new StringBuilder();for(int i=0;i<l1.size();i++){sb.append(l1.get(i)).append(" ");}
        pw.println(dis+"\n"+sb.toString().trim());pw.flush();
    }
    private static List<Integer> shortBFS(List<Integer>[] graph,int S, int D){
        Queue <Integer> q = new ArrayDeque<>(); List <Integer> ll = new ArrayList<>(); boolean[] vis = new boolean[graph.length];
        if(S == D){ll.add(S+1); return ll;}
        q.add(S); vis[S] = true;
        int par [] = new int[graph.length]; Arrays.fill(par, -1); boolean found = false; int f =-1;
        while(!q.isEmpty()){
            int v = q.remove();
            for(int i=0;i<graph[v].size();i++){
                if (!vis[graph[v].get(i)]) {
                    vis[graph[v].get(i)] = true; q.add(graph[v].get(i)); par[graph[v].get(i)] = v; 
                    if(graph[v].get(i) == D){f = graph[v].get(i);found = true;break;}
                }
            }
            if(found){
                for(int i=f; i>-1;i = par[i]){
                    ll.add(i+1);
                }
                Collections.reverse(ll);
                return ll;
            }
        }
        ll.add(-1);
        return ll;
    }


}
