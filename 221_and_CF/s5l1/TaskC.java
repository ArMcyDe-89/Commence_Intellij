package s5l1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TaskC {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader( new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out,true);
        int T = Integer.parseInt(bf.readLine());
        for(int i=0;i<T;i++){
            pw.println(allsum(Long.parseLong(bf.readLine())));
        } pw.flush();
    }
    private static int fastrecsum(int s){
        if (s == 1) {
            return 1;
        }
        return s+fastrecsum(s-1);
    }
    private static Long allsum(Long s){
        return s*(s+1)/2;
    }
}


