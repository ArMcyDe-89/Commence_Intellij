import java.io.*;
import java.util.*;
public class TaskA {
    public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static void main(String[] args) throws Exception{
        int T = Integer.parseInt(bf.readLine());
        for(int t=0;t<T;t++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
            List<Integer> [] graph = new ArrayList[N];
            for(int i=0;i<N;i++){
                graph[i] = new ArrayList<>();
            }
            int inD[] =new int[N];
            for(int i=0;i<M;i++){
                st = new StringTokenizer(bf.readLine());
                int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
                graph[a-1].add(b-1); inD[b-1]++;
            }
            Queue <Integer> q = new ArrayDeque<>(); StringBuilder sb = new StringBuilder();
            for(int i=0;i<N;i++){if(inD[i] == 0){q.add(i);}}
            int count = 0;
            while(!q.isEmpty()){
                int v = q.remove(); sb.append(v+1).append(" "); count++;
                for(int i=0;i<graph[v].size();i++){
                    int neighbor = graph[v].get(i);
                    inD[neighbor]--;
                    if(inD[neighbor] == 0){q.add(neighbor);}
                }
            }
            if(count == N){pw.println(sb.toString().trim());}else{pw.println(-1);} pw.flush();
        }
    }

}
