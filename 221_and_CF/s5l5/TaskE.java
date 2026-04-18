import java.io.*;
import java.util.*;

public class TaskE {
    public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static List<List<Integer>> graph;
    public static boolean pos [];
    public static int[] connected;
    public static int a , b, x;
    public static void main(String[] args) throws Exception{
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int cities = Integer.parseInt(st.nextToken()), roads = Integer.parseInt(st.nextToken()), queries = Integer.parseInt(st.nextToken());
        graph= new ArrayList<>(cities); connected = new int[cities];
        for(int i=0;i<cities;i++){graph.add(new ArrayList<>());}
        for(int i=0;i<roads;i++){
            st = new StringTokenizer(bf.readLine()); int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
            graph.get(a-1).add(b-1); graph.get(b-1).add(a-1);
        }
        
        // pw.println(graph);pw.flush();

        // for(int i=0;i<queries;i++){
        //     st = new StringTokenizer(bf.readLine());  TaskE.a = Integer.parseInt(st.nextToken()); TaskE.b = Integer.parseInt(st.nextToken());
        //     pos = new boolean[cities];
        //     pw.println(DFS(a-1));
        // }

        pos = new boolean[cities];

        for(int i=0;i<cities;i++,x++){
            conDFS(i);
        }

        for(int i=0;i<queries;i++){
            st = new StringTokenizer(bf.readLine());  TaskE.a = Integer.parseInt(st.nextToken()); TaskE.b = Integer.parseInt(st.nextToken());
            if(connected[a-1] == connected[b-1]){pw.println("YES");continue;}pw.println("NO");
        }

        pw.flush();
    }
    // private static String DFS(int i){
    //     if(i == b-1){return "YES";}
    //     String s = "NO";
    //     pos[i] = true;
    //     for(int go = 0; go<graph.get(i).size();go++){
    //         if(!pos[graph.get(i).get(go)]){
    //             s = DFS(graph.get(i).get(go));
    //             if(s.equals("YES")){break;}
    //         }
    //     }
    //     return s;
    // }
    private static void conDFS(int i){
        if(pos[i]){return;}
        pos[i] = true;
        connected[i] = x;
        for(int j =0;j<graph.get(i).size();j++){
            if (!pos[graph.get(i).get(j)]) {
                conDFS(graph.get(i).get(j));
            }
        }
    }
}
