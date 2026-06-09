import java.io.*;
import java.util.*;

public class TaskH {
    public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static char [][] graph;
    public static boolean  [][] d;
    // public static Queue <Character> q = new ArrayDeque<>();
    // public static Queue <Integer> in = new ArrayDeque<>();
    // public static Queue <Integer> out = new ArrayDeque<>();
    public static void main(String[] args) throws Exception{
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int row = Integer.parseInt(st.nextToken()), col = Integer.parseInt(st.nextToken()), max =0;
        graph = new char[row][col]; d = new boolean[row][col];
        for(int i=0;i<graph.length;i++){
            String input  = bf.readLine();
            for(int j=0;j<graph[i].length;j++){
                graph[i][j] = input.charAt(j);
            }
        }
        // for(int i=0;i<graph.length;i++){
        //     for(int j=0;j<graph[i].length;j++){
        //         if (!(graph[i][j] == '#') && !d[i][j]) {
        //             max = Math.max(DFS(i,j),max);
        //         }
        //     }
        // }
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].length;j++){
                if (!(graph[i][j] == '#') && !d[i][j]) {
                    max = Math.max(BFS(i,j),max);
                }
            }
        }
        pw.println(max); pw.flush();
    }
    private static int BFS(int i, int j){
        Queue<Integer> in = new ArrayDeque<>(), out = new ArrayDeque<>();
        in.add(i); out.add(j); d[i][j] = true; int count = 0;
        int [] x = {1, 0, -1, 0}, y = {0, 1, 0, -1};
        while(!in.isEmpty()){
            int a = in.remove(), b = out.remove();
            if(graph[a][b] == 'D'){count++;}
            for(int k=0;k<4;k++){
                int A = a + x[k], B = b+y[k];
                if (A>=0 && B>=0 && A<graph.length && B<graph[A].length && !d[A][B] && graph[A][B] != '#') {
                    in.add(A); out.add(B); d[A][B] = true;
                }
            }
        }
        return count;
    }
    // private static int BFS(int i, int j){
    //     q.add(graph[i][j]); d[i][j] = true; in.add(i); out.add(j); count = 0;
    //     while(!q.isEmpty()){
    //         char s = q.remove(); int a = in.remove(), b = out.remove(); if(s =='D'){count++;}
    //         if (a+1<graph.length && !d[a+1][b] && !(graph[a+1][b]== '#')) {
    //             q.add(graph[a+1][b]); in.add(a+1); out.add(b); d[a+1][b] = true;
    //         }
    //         if (b+1<graph[a].length && !d[a][b+1] && !(graph[a][b+1]=='#')) {
    //             q.add(graph[a][b+1]); in.add(a); out.add(b+1); d[a][b+1] = true;
    //         }
    //         if (a-1>=0 && !d[a-1][b] && !(graph[a-1][b]== '#')) {
    //             q.add(graph[a-1][b]); in.add(a-1); out.add(b); d[a-1][b] = true;
    //         }
    //         if (b-1>=0 && !d[a][b-1] && !(graph[a][b-1]== '#')) {
    //             q.add(graph[a][b-1]); in.add(a); out.add(b-1); d[a][b-1] = true;
    //         }
    //     }
    //     return count;
    // }

    private static int DFS(int i, int j){
        if (i<graph.length && i>=0 && j<graph[i].length && j>=0 && !d[i][j] && !(graph[i][j] == '#')) {
            d[i][j] = true;
            if(graph[i][j] == 'D'){
                return 1+DFS(i-1, j)+DFS(i+1, j)+DFS(i, j-1)+DFS(i, j+1);
            }
            return 0+DFS(i-1, j)+DFS(i+1, j)+DFS(i, j-1)+DFS(i, j+1);
            
        }
        return 0;
    }
}
