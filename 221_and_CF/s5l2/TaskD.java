import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class TaskD {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out,true);
        int [] N = new int[Integer.parseInt(bf.readLine())];
        StringTokenizer st1 = new StringTokenizer(bf.readLine());
        for(int i=0;i<N.length;i++){N[i]=Integer.parseInt(st1.nextToken());}
        int [] M = new int[Integer.parseInt(bf.readLine())];
        st1 = new StringTokenizer(bf.readLine());
        for(int i=0;i<M.length;i++){M[i] = Integer.parseInt(st1.nextToken());}
        int [] T = new int[N.length+M.length];
        int i = 0, j = 0,t=0;
        while(i<N.length && j<M.length){
            if (N[i]<=M[j]) {
                T[t++] = N[i++];
            }else{
                T[t++] = M[j++];
            }
        }
        while(i<N.length){T[t++] = N[i++];} while(j<M.length){T[t++] = M[j++];}t=0;
        while(t<T.length){pw.print(T[t++]);pw.print(" ");}pw.println();pw.flush();
    }

    //THIS ONE IS BETTER!!!!!   AND I DID IT!!! NOT AI
    
    //  public static void main(String[] args) throws Exception{
    //     BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    //     PrintWriter pw = new PrintWriter(System.out,true);
    //     int A [] = new int[Integer.parseInt(bf.readLine())];
    //     StringTokenizer st1 = new StringTokenizer(bf.readLine());
    //     int B[] = new int[Integer.parseInt(bf.readLine())];
    //     StringTokenizer st2 = new StringTokenizer(bf.readLine());
    //     for(int i=0;i<A.length;i++){A[i] = Integer.parseInt(st1.nextToken());}
    //     for(int i=0;i<B.length;i++){B[i] = Integer.parseInt(st2.nextToken());}
    //     StringBuilder sb = new StringBuilder((A.length+B.length)*2);
    //     pw.println(SortedList(A, B, sb));
    // }
    // private static String SortedList(int [] A, int[]B, StringBuilder sb){
    //     int i=0,j=0;
    //     while(i<A.length && j<B.length){
    //         if (A[i]<=B[j]) {
    //             sb.append(A[i++]).append(" ");
    //         }else{sb.append(B[j++]).append(" ");}
    //     }
    //     while(i<A.length){
    //         sb.append(A[i++]).append(" ");
    //     }
    //     while(j<B.length){
    //         sb.append(B[j++]).append(" ");
    //     }
    //     return ""+sb;
    // }


}
