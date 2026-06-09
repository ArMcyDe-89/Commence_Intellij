import java.io.*;
import java.util.*;

public class TaskG {
    public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static List<Integer>[] graph;
    public static boolean [] vis;
    public static int[] col;

    public static void main(String[] args) throws Exception{
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
        graph = new ArrayList[N]; vis = new boolean[N]; col = new int[N];
        for(int i =0;i<N;i++){graph[i] = new ArrayList<>();}
        for(int i=0;i<M;i++){
            st = new StringTokenizer(bf.readLine());
            graph[Integer.parseInt(st.nextToken())-1].add(Integer.parseInt(st.nextToken())-1);
        }
        for(int i=0;i<N;i++){
            if(col[i] == 0){
                if(cycleDFS(i).equals("YES")){pw.println("YES");pw.flush();return;}
            }
        } pw.println("NO"); pw.flush();
    }
    private static String cycleDFS(int i){
        if(col[i] == 2){return "";}
        if(col[i] == 1){return "YES";}
        col[i] = 1;
        for(int j=0;j<graph[i].size();j++){
            if (col[graph[i].get(j)] != 2) {
                if(cycleDFS(graph[i].get(j)).equals("YES")){
                    return "YES";
                }
            }
        }
        col[i] = 2;
        return "NO";
    }
}
