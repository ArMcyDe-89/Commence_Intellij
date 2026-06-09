import java.util.*;
import java.io.*;

public class TaskG {
    public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static void main(String[] args) throws Exception{
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken());
        boolean [][] board = new boolean[N][M];
        int [][] knights = new int[K][2];
        for(int i=0;i<K;i++){
            st = new StringTokenizer(bf.readLine());
            knights[i][0] = Integer.parseInt(st.nextToken());
            knights[i][1] = Integer.parseInt(st.nextToken());
            board[knights[i][0]-1][knights[i][1]-1] = true;
        }
        int [] x = {-2,-2,-1,-1,1,1,2,2};
        int [] y = {1,-1,2,-2,2,-2,1,-1};
        for(int i=0;i<K;i++){
            int a = knights[i][0]-1, b = knights[i][1]-1;
            for(int j=0;j<8;j++){
                if(a+x[j]<0 || a+x[j]>N-1 || b+y[j]<0 || b+y[j]>M-1){continue;}
                if(board[a+x[j]][b+y[j]] == true){pw.println("YES");pw.flush();return;}
            }
        }
        pw.println("NO");pw.flush();
    }
}

//This works but could get slow
        // int [][] knights = new int[K][2];
        // for(int i=0;i<K;i++){
        //     st = new StringTokenizer(bf.readLine());
        //     knights[i][0] = Integer.parseInt(st.nextToken());
        //     knights[i][1] = Integer.parseInt(st.nextToken());
        // }
        // int [] x = {-2,-2,-1,-1,1,1,2,2};
        // int [] y = {1,-1,2,-2,2,-2,1,-1};
        // for(int i=0;i<K;i++){
        //     for(int j=0;j<8;j++){
        //         int a = knights[i][0]+x[j], b= knights[i][1]+y[j];
        //         for(int k=i+1;k<knights.length;k++){if(knights[k][0] == a && knights[k][1] == b){pw.println("YES");pw.flush();return;}}
                
        //     }
        // }
        // pw.println("NO");pw.flush();