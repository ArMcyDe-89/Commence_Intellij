import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class TaskA {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw= new PrintWriter(System.out,true);
        StringTokenizer st1 = new StringTokenizer(bf.readLine());
        int length= Integer.parseInt(st1.nextToken());
        int sum = Integer.parseInt(st1.nextToken());
        int arr [] = new int[length];
        StringTokenizer st2 = new StringTokenizer(bf.readLine());
        for(int i=0;i<length;i++){
            arr[i] = Integer.parseInt(st2.nextToken());
        }
        int first =0,last = length-1;
        while(first<last){
            if(arr[first]+arr[last]>sum){
                last--;
            }
            else if(arr[first]+arr[last]<sum){
                first++;
            }
            else if (arr[first]+arr[last] == sum) {
                pw.println((first+1)+" "+(last+1));
                return;
            }
        }
        pw.println("-1"); pw.flush();
    }
}
