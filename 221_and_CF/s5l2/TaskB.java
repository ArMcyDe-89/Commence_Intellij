import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class TaskB{
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out,true);
        StringTokenizer st1 = new StringTokenizer(bf.readLine());
        int A [] = new int[Integer.parseInt(st1.nextToken())], B [] = new int[Integer.parseInt(st1.nextToken())], K = Integer.parseInt(st1.nextToken());
        StringTokenizer st2 = new StringTokenizer(bf.readLine()); for(int i=0;i<A.length;i++){A[i] = Integer.parseInt(st2.nextToken());}
        StringTokenizer st3  = new StringTokenizer(bf.readLine()); for(int i=0;i<B.length;i++){B[i] = Integer.parseInt(st3.nextToken());}
        int fA = 0,lB = B.length-1,in1 = -1, in2 =-1; long min = Long.MAX_VALUE;
        while(fA<A.length && lB>=0){
            long check = (long)A[fA]+B[lB];
            if (Math.abs(check-K)<min) {
                min = Math.abs(check-K); in1 = fA; in2 = lB;
            }
            if (check<K) {
                fA++;
            }else{ lB--;}
            if(min == 0){pw.println((in1+1)+" "+(in2+1));return;}
        }
        pw.println((in1+1)+" "+(in2+1));
    }
}