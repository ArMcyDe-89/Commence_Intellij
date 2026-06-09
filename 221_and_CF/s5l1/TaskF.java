package s5l1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class TaskF {
    public static void main(String[] args) throws Exception{
        BufferedReader bf  = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out,true);
        int arr []  = new int[Integer.parseInt(bf.readLine())];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        for(int i =0;i<arr.length-1;){
            boolean b = false;
            // if (arr[i]>arr[i+1] && (arr[i]%2==0 && arr[i+1]%2==0)) {  //me
            //     int s = arr[i]; arr[i] = arr[i+1]; arr[i+1] = s; b = true;
            // }
            // else if(arr[i]>arr[i+1] && (arr[i]%2==1 && arr[i+1]%2==1)){
            //     int s = arr[i]; arr[i] = arr[i+1]; arr[i+1] = s; b = true;
            // }
            if (arr[i]>arr[i+1] && (arr[i]%2 == arr[i+1]%2)) { // gpt
                int s = arr[i]; arr[i] = arr[i+1]; arr[i+1] = s; b = true;
            }
            i++;
            if(b){i=0;}
        }
        for (int x : arr) {
            pw.print(x + " ");
        }
        pw.println();
        pw.flush();
    }
}
