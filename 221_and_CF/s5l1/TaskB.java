package s5l1;
import java.io.*;
import java.util.*;
public class TaskB {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out,true);
        pw.println("Give number of inputs:");
        int T  = Integer.parseInt(br.readLine());
        for(int i = 0;i<T;i++){
            pw.println("Give an Input");
            StringTokenizer st = new StringTokenizer(br.readLine()); 
            String [] arr = new String[4];
            for(int j =0;j<4;j++){
                arr[j] = st.nextToken();
            }
            float m = Float.parseFloat(arr[1]), n = Float.parseFloat(arr[3]);
            switch (arr[2]) {
                case "+" : pw.println(m+n);break;
                case "-" : pw.println(m-n);break;
                case "*" : pw.println(m*n);break;
                case "/" : pw.println(m/n);break;
                default:
                    throw new AssertionError();
            }
        }
    }

}
