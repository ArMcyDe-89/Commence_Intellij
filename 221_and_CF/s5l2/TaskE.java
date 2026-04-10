import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class TaskE {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out,true);
        StringTokenizer st1 = new StringTokenizer(bf.readLine());
        int arr[] = new int[Integer.parseInt(st1.nextToken())];
        long K = Long.parseLong(st1.nextToken()),max = 0;
        st1 = new StringTokenizer(bf.readLine()); for(int i=0;i<arr.length;i++){arr[i]=Integer.parseInt(st1.nextToken());}
        long sum=0;int j=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            while(sum>K){
                sum-=arr[j++];
            }
            max = Math.max(max, i-j+1);
        }
        pw.println(max);
    }
}

        // for(int i=0;i<arr.length;i++){
        //     int sum=0,j=i;
        //     while(j<arr.length && sum<=K){
        //         sum+=arr[j++];
        //     }
        //     if(max<(j-i)){if(j==arr.length && sum<=K){max = j-i;}else{j--; max = j-i;}}
        // }