import java.io.*;
import java.util.*;

public class TaskB {
    public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static List <Integer> [] graph;
    public static StringBuilder sb = new StringBuilder();
    public static boolean b []; 
    public static void main(String[] args) throws Exception{
        StringTokenizer st = new StringTokenizer(bf.readLine()), st1 = new StringTokenizer(bf.readLine()), st2 = new StringTokenizer(bf.readLine());
        int cities = Integer.parseInt(st.nextToken()), roads = Integer.parseInt(st.nextToken());
        graph = new ArrayList[cities]; 
        b = new boolean[cities];
        for(int i = 0;i<cities;i++){
            graph[i] = new ArrayList<>();
        }
        for(int i=0;i<roads;i++){
            int a = Integer.parseInt(st1.nextToken()) , b = Integer.parseInt(st2.nextToken()); 
            graph[a-1].add(b-1); graph[b-1].add(a-1);
        }
        DFS(0);
        pw.println(sb.toString());pw.flush();
    }
    private static void DFS(int i){
        if(b[i]){return;}
        b[i] = true;
        sb.append(i+1).append(" ");
        for(int j = 0;j<graph[i].size();j++){
            if(b[graph[i].get(j)]){continue;}
            DFS(graph[i].get(j));
        }
    }
}
