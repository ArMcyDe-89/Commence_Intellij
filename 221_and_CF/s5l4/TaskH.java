import java.util.*;
import java.io.*;

public class TaskH {
    public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static void main(String[] args) throws Exception{
        StringTokenizer st = new StringTokenizer(bf.readLine());
        ArrayList <Integer> [] graph  = new ArrayList[Integer.parseInt(st.nextToken())]; int [][] Qs= new int[Integer.parseInt(st.nextToken())][2];
        for(int i =1;i<=graph.length;i++){
            graph[i-1] = new ArrayList<>();
            for(int j=1;j<=graph.length;j++){
                if(i!=j && EucildeanGCD(i, j) == 1){graph[i-1].add(j);}
            }
        }
        for(int i=0;i<Qs.length;i++){
            StringTokenizer st1 = new StringTokenizer(bf.readLine()); Qs[i][0] = Integer.parseInt(st1.nextToken()); Qs[i][1] = Integer.parseInt(st1.nextToken());
        }
        for(int i=0;i<Qs.length;i++){
            if(Qs[i][1]>graph[Qs[i][0]-1].size()){pw.println(-1);continue;}
            pw.println(graph[Qs[i][0]-1].get(Qs[i][1]-1));
        }
        pw.flush();
    }
    private static int EucildeanGCD(int i , int j){
        int max = Math.max(i, j), min = Math.min(i, j);
        if(max%min == 0){return min;}
        return 1*EucildeanGCD(min, max%min);
    }
    // public static void main(String[] args) throws Exception{ ////// This was SOOOOOOOOOOOOOOOOO SLOOOOOOOOOOOOOOOOOOOOOWWWWWW
    //     StringTokenizer st = new StringTokenizer(bf.readLine());
    //     int [][] graph  = new int[Integer.parseInt(st.nextToken())][], Qs= new int[Integer.parseInt(st.nextToken())][2];
    //     for(int i =1;i<=graph.length;i++){
    //         int k=0, count = rowElemCount(i,graph.length);
    //         graph[i-1] = new int[count];
    //         for(int j=1;j<=graph.length;j++){
    //             if(i!=j && gcd(i, j) == 1){graph[i-1][k++] = j;}
    //         }
    //     }
    //     for(int i=0;i<Qs.length;i++){
    //         StringTokenizer st1 = new StringTokenizer(bf.readLine()); Qs[i][0] = Integer.parseInt(st1.nextToken()); Qs[i][1] =Integer.parseInt(st1.nextToken());
    //     }
    //     for(int i=0;i<Qs.length;i++){
    //         if(Qs[i][1]>graph[Qs[i][0]-1].length){pw.println(-1);pw.flush();continue;}
    //         pw.println(graph[Qs[i][0]-1][Qs[i][1]-1]);pw.flush();
    //     }
    // }
    // private static int rowElemCount(int i, int size){
    //     int k=0;
    //         for(int j=1;j<=size;j++){
    //             if(i!=j && gcd(i, j) == 1){k++;}
    //         }
    //     return k;
    // }
    // private static int gcd(int i, int j){// TOOOOOOOO SLOOOOOOOOOOOOOOOOOOOOOOOOOOOOOWWWWWWWW
    //     int max = Math.max(i, j), gcd = 1;
    //     for(int k=1;k<=max;k++){
    //         if(i%k == 0 && j%k == 0){gcd = k;}
    //     }
    //     return gcd;
    // }

}
