import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class TaskF {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int A [] = new int[Integer.parseInt(st.nextToken())],K=Integer.parseInt(st.nextToken()),count = 0,len=0;
        st = new StringTokenizer(bf.readLine()); for(int i=0;i<A.length;i++){A[i] = Integer.parseInt(st.nextToken());}
        int [] reps = new int[A.length+1];
        int i=0,j=0;
        while(j<A.length){
            if (reps[A[j]] == 0) {
                count++;
            }reps[A[j]]++;
            while(count>K){
                reps[A[i]]--;
                if(reps[A[i]] == 0){
                    count--;
                }
                i++;
            }
            len = Math.max(len, j-i+1); j++;
        }
        pw.println(len); pw.flush();
    }
}
        // int i=0,j=0; boolean [] copy = new boolean[A.length];
        // while(j<A.length){
        //     if(A.length == K){pw.println(K);pw.flush();return;}
        //     if(!copy[A[j]-1]){copy[A[j]-1]=true;count++;} if(count > K){ copy = new boolean[A.length];count=0;len = Math.max(len, j-i);i=j--;}
        //     j++;
        // }pw.println(len); pw.flush();