import java.io.*;
import java.util.*;
public class TaskB {
    public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static List <Integer> [] graph;
    public static int cols [], ans = 0;
    public static void main(String[] args) throws Exception{
        StringTokenizer st = new StringTokenizer(bf.readLine().trim());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
        graph = new ArrayList[N]; cols =new int[N]; Arrays.fill(cols, -1); for(int i=0;i<N;i++){graph[i] = new ArrayList<>();}
        for(int i = 0;i<M;i++){
            st = new StringTokenizer(bf.readLine()); int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
            graph[a-1].add(b-1); graph[b-1].add(a-1);
        }
        for(int i=0;i<N;i++){
            colBip(i);
        }
        pw.println(ans);pw.flush();
    }
    private static void  colBip(int i){
        if(cols[i] != -1){return;}
        Queue <Integer> q  = new ArrayDeque<>(); int R= 0, H=0;
        q.add(i); cols[i] = 0; boolean bipartite = true;
        while(!q.isEmpty()){
            int v = q.remove(); if(cols[v] == 1){R++;}else{H++;}
            for(int j=0;j<graph[v].size();j++){
                int t= graph[v].get(j);
                if (cols[t] == -1) {
                    cols[t] = 1- cols[v]; q.add(t);
                }else if(cols[t] == cols[v]){
                    bipartite = false;
                }
            }
        }
        if(bipartite){ans+=Math.max(R, H);}else{ans+=R+H;}
    }
}


    // private static void colBip(int i){ //this is not really working
    //     if(cols[i]!=-1){return;}
    //     Queue <Integer> q = new ArrayDeque<>();
    //     q.add(i); cols[i] = 0; boolean bip =false;
    //     while(!q.isEmpty()){
    //         int v = q.remove(); if(cols[v] == 1){R++; ans = Math.max(R, ans);}else{H++; ans = Math.max(ans, H);}
    //         for(int j=0;j<graph[v].size();j++){
    //             int t = graph[v].get(j);
    //             if(cols[t] == -1){
    //                 cols[t] = 1 - cols[v]; q.add(t);
    //             }else if (cols[t] == cols[v]) {
    //                 ans = graph.length; bip = true; break;
    //             }
    //         }
    //         if(bip){break;}
    //     }
    // }