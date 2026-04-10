package s5l1;
import java.io.*;
import java.util.StringTokenizer;

public class TaskE {
    public static void main(String[] args) throws Exception{
        BufferedReader bf  = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw  = new PrintWriter(System.out,true);
        int arr [] = new int[Integer.parseInt(bf.readLine())];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i =0;i<arr.length;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int in []  = new int[(int)Math.pow(arr.length, 2)]; int c=0;
        for(int j=0;j<arr.length;j++){
            for(int i = 0;i<arr.length-2;i++){
                if (arr[i]>arr[i+2]) {
                    int swap = arr[i];arr[i] = arr[i+2]; arr[i+2] = swap; in[c++] = i;
                }
            }
        }boolean b =true;
        for(int i=0;i<arr.length-1;i++){
            if (arr[i]>arr[i+1]) {
                b = false; break;
            }
        }
        if(b){pw.println("YES");pw.println(c);for(int i=0;i<c;i++){pw.println(in[i]+1+" "+(in[i]+1+2));}}
        else{pw.println("NO");}
    }
}
