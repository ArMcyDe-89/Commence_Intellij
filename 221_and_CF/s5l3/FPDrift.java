import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class FPDrift {
    public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static void main(String[] args) throws  Exception{
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int l1 = Integer.parseInt(st.nextToken()); long l2 = Long.parseLong(st.nextToken());
        //pw.println(FPD(72, 33, 22));
        l1=l1%107; l2 = l2%106;
        long p=1; while(l2>0){p=(p*l1)%107;l2--;}
        pw.println(p%107);
        pw.flush();
    }
    // private static long FPD(long base, long exp, long mod){
    //     long res = 1;
    //     base = base%mod;
    //     while(exp>0){
    //         if (exp%2 == 1) {
    //             res = (res*base)%mod;
    //         }
    //         base = (base*base)%mod;
    //         exp = exp/2;
    //     }
    //     return res;
    // }
}
