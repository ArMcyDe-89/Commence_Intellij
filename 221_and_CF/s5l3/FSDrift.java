import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class FSDrift {
    public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);

    public static void main(String[] args) throws Exception{
        int n =Integer.parseInt(bf.readLine());
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            long base = Long.parseLong(st.nextToken()), exp = Long.parseLong(st.nextToken()), mod = Long.parseLong(st.nextToken());
            long res [] = moddedSumAndPower(base, exp, mod);
            pw.println(res[0]);
        }
        pw.flush();
    }
private static long[] moddedSumAndPower(long base, long exp, long mod){
        if(exp == 0){ return new long[]{0, 1};}
        if(exp == 1){ return new long[]{base % mod, base % mod}; }
        long[] half = moddedSumAndPower(base, exp / 2, mod);
        long halfSum = half[0];
        long halfPow = half[1];
        long currentSum = (halfSum + (halfSum * halfPow) % mod) % mod;
        long currentPow = (halfPow * halfPow) % mod;
        if(exp % 2 == 0){
            return new long[]{currentSum, currentPow};
        }
        else {
            currentPow = (currentPow * (base % mod)) % mod;
            currentSum = (currentSum + currentPow) % mod;
            return new long[]{currentSum, currentPow};
        }
    }

    // public static long FSD(long a, long n, long m){ // tried this, does not work --- 3 reasons
    //     long sum = a*((long)Math.pow(a, n))/(a-1);
    //     return sum%m;
    // }
}
