import java.io.*;
import java.util.*;

public class TaskC {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw =new PrintWriter(System.out,true);
        StringTokenizer st1 = new StringTokenizer(bf.readLine());
        int [][] AA = new int[Integer.parseInt(st1.nextToken())][2]; long x = Long.parseLong(st1.nextToken());
        st1 = new StringTokenizer("");
        for(int i=0;i<AA.length;i++){
            while(!st1.hasMoreElements()){st1=new StringTokenizer(bf.readLine());}
            AA[i][0] = Integer.parseInt(st1.nextToken());
            AA[i][1] = i+1;
        }
        Arrays.sort(AA,(r1,r2)->Integer.compare(r1[0],r2[0]));
        for(int i = 0;i<AA.length-2;i++){
            long sum = x-AA[i][0];
            int f = i+1,l=AA.length-1;
            while(f<l){
                if ((long)AA[f][0]+AA[l][0] == sum) {
                    pw.println(AA[i][1]+" "+AA[f][1]+" "+AA[l][1]); return;
                }
                else if(AA[f][0]+AA[l][0]<sum){
                    f++;
                }else{l--;}
            } 
        }
        pw.println(-1);
    }
}
