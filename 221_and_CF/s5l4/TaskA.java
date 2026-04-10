
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class TaskA {
    public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static void main(String[] args) throws Exception{
        StringTokenizer st = new StringTokenizer(bf.readLine().trim());
        int len = Integer.parseInt(st.nextToken());
        int [][] A = new int[len][len];
        int n = Integer.parseInt(st.nextToken());
        for(int i=0;i<n;i++){
            st = new StringTokenizer(bf.readLine().trim());
            A[Integer.parseInt(st.nextToken())-1][Integer.parseInt(st.nextToken())-1] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0;i<len;i++){
            for(int j=0;j<len;j++){
                pw.print(A[i][j]+" ");
            }pw.println();
        }
        pw.flush();        
    }
}
