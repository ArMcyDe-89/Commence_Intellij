package s5l1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class TaskD {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out,true);
        int tests = Integer.parseInt(bf.readLine());
        for(int i =0;i<tests;i++){
            int arr [] = new int[Integer.parseInt(bf.readLine())];
            StringTokenizer st = new StringTokenizer(bf.readLine());
            for(int j=0;j<arr.length;j++){
                arr[j] = Integer.parseInt(st.nextToken());
            } boolean b = false;
            for(int k =0;k<arr.length-1;k++){
                if(arr[k]>arr[k+1]){b=true; break;}
            }
            if(b){pw.println("NO");}else{pw.println("YES");}
        }
    }
}
