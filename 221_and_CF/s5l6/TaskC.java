
import java.io.*;
import java.util.*;

public class TaskC {
    public static BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static int [][] board;
    public static void main(String[] args) throws Exception{
        int N = Integer.parseInt(bf.readLine());
        board = new int[N][N];
        for(int i=0;i<N;i++){Arrays.fill(board[i], -1);}
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int x1 = Integer.parseInt(st.nextToken()), y1 = Integer.parseInt(st.nextToken()), x2 = Integer.parseInt(st.nextToken()), y2 = Integer.parseInt(st.nextToken());
        pw.println(KnightBFS(x1-1, y1-1, x2-1, y2-1)); pw.flush();
    }
    private static int KnightBFS(int x1, int y1, int x2, int y2){
        int x [] = {2 ,2, -2, -2, 1, -1, 1, -1}, y [] = {-1, 1, -1, 1, 2, 2, -2, -2};
        Queue <int[]> q = new ArrayDeque<>();
        q.add(new int[]{x1, y1}); board[x1][y1] = 0;
        while(!q.isEmpty()){
            int [] v = q.remove(); if(v[0] == x2 && v[1] == y2){return board[v[0]][v[1]];}
            for(int i=0;i<x.length;i++){
                int l = v[0]+x[i], h = v[1]+y[i];
                if (l<board.length && l>-1 && h<board.length && h>-1 && board[l][h] == -1){
                    board[l][h] = board[v[0]][v[1]]+1; q.add(new int[]{l, h});
                }
            }
        }
        return board[x2][y2];
    }
}
