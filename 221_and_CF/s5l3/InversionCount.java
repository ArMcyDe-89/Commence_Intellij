import java.io.*;
import java.util.*;

public class InversionCount {
    public static long inversion=0;
	public static void main(String []  args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int [] arr =new int[Integer.parseInt(bf.readLine().trim())];
        StringTokenizer st =new StringTokenizer(bf.readLine());
        int i=0;
        while(st.hasMoreTokens()){
            arr[i++] = Integer.parseInt(st.nextToken());
        }
        arr = mergeSort(arr, 0, arr.length);
        pw.println(inversion); StringBuilder sb = new StringBuilder(); for(int j:arr){sb.append(j).append(" ");}
        pw.println(sb);
        pw.flush();
    }
    private static int [] merge(int [] A, int[] B){
        int i=0,j=0,k=0;
        int [] C = new int[A.length+B.length];
        while(i<A.length && j<B.length){
            if(A[i]<=B[j]){
                C[k++] = A[i++];
            }else{
                inversion+=A.length-i;
                C[k++] = B[j++];
            }
        }
        while(i<A.length){
            C[k++] = A[i++];
        }
        while(j<B.length){
            C[k++] = B[j++];
        }
        return C;
    }

    private static int [] mergeSort(int [] A,int s, int e){
        if(A.length<=1){return A;}
        int mid = s+(e-s)/2; int [] a = Arrays.copyOfRange(A, s, mid), b = Arrays.copyOfRange(A, mid, e);
        a = mergeSort(a, 0, a.length); b = mergeSort(b, 0, b.length);
        return merge(a, b);
    }
}
