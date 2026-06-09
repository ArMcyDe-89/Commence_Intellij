import java.util.*;
import java.io.*;
public class TaskF {
    public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static void main(String[] args) throws Exception{
        int N = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine()); int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
        int count = 0;
        ArrayList <String> aa = new ArrayList<>();
        if(x-1>=1 && y-1>=1){count++; aa.add((x-1)+" "+(y-1));}
        if(x-1>=1){count++; aa.add((x-1)+" "+y);}
        if(x-1>=1 && y+1<=N){count++; aa.add((x-1)+" "+(y+1));}
        if(y-1>=1){count++; aa.add((x)+" "+(y-1));}
        if(y+1<=N){count++; aa.add((x)+" "+(y+1));}
        if(x+1<=N && y-1>=1){count++; aa.add((x+1)+" "+(y-1));}
        if(x+1<=N){count++; aa.add((x+1)+" "+y);}
        if(x+1<=N && y+1<=N){count++; aa.add((x+1)+" "+(y+1));}
        pw.println(count);
        for(String a:aa){
            pw.println(a);
        }pw.flush();
    }
}


        // if(x<=N && y<=N){
        //     if(x+1<=N){b[0] = true; count++;}
        //     if(x-1>=1){b[1] = true; count++;}
        //     if(y+1<=N){b[2] = true; count++;}
        //     if(y-1>=1){b[3] = true; count++;}
        //     switch(count) {
        //         case 4 -> {
        //             count += 4;
        //             pw.println(count);
        //         }
        //         case 3 -> {
        //             count += 2;
        //             pw.println(count);
        //         }
        //         default -> {
        //             count += 1;
        //             pw.println(count);
        //         }
        //     }
        //     if(b[1] && b[3]){pw.println((x-1)+" "+(y-1));}
        //     if(b[1]){pw.println((x-1)+" "+y);}
        //     if(b[1] && b[2]){pw.println((x-1)+" "+(y+1));}
        //     if(b[3]){pw.println((x)+" "+(y-1));}
        //     if(b[2]){pw.println((x)+" "+(y+1));}
        //     if(b[0] && b[3]){pw.println((x+1)+" "+(y-1));}
        //     if(b[0]){pw.println((x+1)+" "+y);}
        //     if(b[0] && b[2]){pw.println((x+1)+" "+(y+1));}
            
        // }else{pw.println(count);}
        // pw.flush();


        //  for(int i = -1;i<=1;i++){ //GPT... but mine is slightly better- for some reason
        //     for(int j = -1;j<=1;j++){
        //         if(i == 0 && j == 0){continue;}
        //         if(x+i<=N && x+i>=1 && y+j<=N && y+j>=1){
        //             aa.add((x+i)+" "+(y+j));count++;
        //         }
        //     }
        // }