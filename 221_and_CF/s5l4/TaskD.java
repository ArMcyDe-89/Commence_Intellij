import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
public class TaskD {
    public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static void main(String[] args) throws Exception{
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int [] degree  = new int[Integer.parseInt(st.nextToken())];
        StringTokenizer st2 = new StringTokenizer(bf.readLine()), st1 = new StringTokenizer(bf.readLine());
        while(st1.hasMoreTokens()){
            degree[Integer.parseInt(st2.nextToken())-1]++;
            degree[Integer.parseInt(st1.nextToken())-1]++;
        }
        int odd=0;
        for(int i=0;i<degree.length;i++){if(degree[i]%2!=0){odd++;}}
        if(odd==2 || odd == 0){pw.println("YES");}
        else{pw.println("NO");}
        pw.flush();
    }
}
