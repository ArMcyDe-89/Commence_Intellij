import java.io.*;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.StringTokenizer;

public class TaskE {
    public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static void main(String[] args) throws Exception{
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
        StringTokenizer st1 = new StringTokenizer(bf.readLine()), st2 = new StringTokenizer(bf.readLine());
        int [] ins = new int[N], outs = new int[N];
        for(int i=0;i<M;i++){
            outs[Integer.parseInt(st1.nextToken())-1]++;
            ins[Integer.parseInt(st2.nextToken())-1]++;
        }
        for(int i=0;i<N;i++){
            pw.printf("%d ",(ins[i]-outs[i]));
        }pw.println();pw.flush();
    }
}