import java.io.*;
import java.util.StringTokenizer;

public class TaskH {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int T = Integer.parseInt(bf.readLine()),i=0;
        while(i<T){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int k = Integer.parseInt(st.nextToken()), x= Integer.parseInt(st.nextToken());
            int out = k+((k-1)/(x-1));
            pw.println(out);i++;
        }pw.flush();
    }
}
        // for(int g=0;g<T;g++){
        //     StringTokenizer st = new StringTokenizer(bf.readLine());
        //     int k = Integer.parseInt(st.nextToken()), x = Integer.parseInt(st.nextToken()), count=0;
        //     for(int i=0;i<k;i++){boolean b =false;
        //         for(int j=1;j<x;j++){
        //             int num = x*i+j;count++;if(count==k){pw.println(num);b=true;break;}
        //         }if(b){break;}
        //     }
        // }pw.flush();