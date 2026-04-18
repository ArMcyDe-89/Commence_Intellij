import java.io.*;
import java.util.*;
public class TaskC {
    public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static void main(String[] args) throws Exception{
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int V = Integer.parseInt(st.nextToken()), E = Integer.parseInt(st.nextToken()), S = Integer.parseInt(st.nextToken()), D = Integer.parseInt(st.nextToken());
        List <List <Integer> > graph = new ArrayList<>(V);
        for(int i=0;i<V;i++){graph.add(new ArrayList<>());}
        StringTokenizer st1 = new StringTokenizer(E>0?bf.readLine():""), st2 = new StringTokenizer(E>0?bf.readLine():"");
        for(int i = 0;i<E;i++){
            int a = Integer.parseInt(st1.nextToken()), b = Integer.parseInt(st2.nextToken());
            graph.get(a-1).add(b-1); graph.get(b-1).add(a-1);
        }
        for(int i=0;i<V;i++){
            Collections.sort(graph.get(i));
        }
        pw.println(shortBFS(graph, S-1, D-1)); pw.flush();
    }
    private static String shortBFS(List<List<Integer>> graph, int S, int D){
        if(S == D){return 0+"\n"+(S+1);}
        Queue <Integer> q = new ArrayDeque<>();
        boolean vis [] = new boolean[graph.size()], found =false;
        StringBuilder sb = new StringBuilder();
        List <Integer> ll = new ArrayList<>();
        int [] p =new int[graph.size()], d = new int[graph.size()]; Arrays.fill(p, -1); Arrays.fill(d, -1);
        q.add(S); vis[S] = true; d[S] = 0; int f =-1;
        while(!q.isEmpty()){
            int v = q.remove();
            for(int i=0;i<graph.get(v).size();i++){
                int t = graph.get(v).get(i);
                if (!vis[t]) {
                    vis[t] = true;
                    q.add(t); p[t] = v; d[t] = d[v]+1; if(t ==D){found = true; f= t;break;}
                }
            }
            if(found){
                for(int k = f;k>-1;k = p[k]){
                    ll.add(k+1);
                }
                Collections.reverse(ll);
                for(int i=0;i<ll.size();i++){
                    sb.append(ll.get(i)).append(" ");
                }
                return d[f]+"\n"+sb.toString().trim(); 
            }
        }
        return "-1";
    }

}
