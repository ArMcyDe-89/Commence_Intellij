import java.io.*;
import java.util.*;
public class TaskD {
    public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static int max = 0, dis [];
    public static List<Integer> [] Graph;
    public static void main(String[] args) throws Exception{
        int N = Integer.parseInt(bf.readLine());
        Graph = new ArrayList[N]; dis = new int[N]; for(int i=0;i<N;i++){Graph[i] = new ArrayList<>();}
        for(int i=0;i<N-1;i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
            Graph[a-1].add(b-1); Graph[b-1].add(a-1);
        }
        int A = farBFS(0); max =0; int B = farBFS(A);
        StringBuilder sb = new StringBuilder(); sb.append(max).append("\n").append(A+1).append(" ").append(B+1);
        pw.println(sb.toString());pw.flush();
    }
    private static int farBFS(int i){
        Queue <Integer> q = new ArrayDeque<>();
        Arrays.fill(dis,-1);
        int A = i;
        q.add(i); dis[i] = 0;
        while(!q.isEmpty()){
            int v = q.remove();
            for(int j=0;j<Graph[v].size();j++){
                int t = Graph[v].get(j);
                if (dis[t] == -1) {
                    dis[t] = dis[v]+1; q.add(t);
                    if(dis[t]>max){A = t; max = dis[t];}
                }
            }
        }
        return A;
    }
}
