import java.io.*;
import java.util.*;


public class CITRev {
    public static long inversion=0;
    public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
	public static void main(String []  args) throws Exception{
        int [] arr =new int[Integer.parseInt(bf.readLine().trim())], temp = new int[arr.length];
        StringTokenizer st =new StringTokenizer(bf.readLine());
        int i=0;
        while(st.hasMoreTokens()){
            arr[i++] = Integer.parseInt(st.nextToken());
        }
        mergeSort(arr, temp, 0, arr.length-1);
        pw.println(inversion);
        pw.flush();
    }
    private static void mergeSort(int [] A, int  [] temp, int start, int end){
        if(start>=end){return;}
        int mid = start + (end-start)/2;
        mergeSort(A, temp, start, mid);
        mergeSort(A, temp, mid+1, end);
        for(int i=start;i<=mid;i++){
            if(A[i]>0){
                long l = (long) A[i]-1, root = (long) Math.sqrt(l);
                int left = findFirst(A, mid+1,end, -root), right = findLast(A,mid+1, end, root);
                if (left <= right) {
                    inversion += (right - left + 1);
                }
            }
        }
        merge(A, temp, start, mid, end);
    }
    private static void merge(int [] A, int[] temp, int start, int mid, int end){
        int i = start, j = mid+1, k =start;
        while(i<=mid && j<=end){
            if (A[i]<=A[j]) {
                temp[k++] = A[i++];
            }else{
                temp[k++] = A[j++];
            }
        }
        while(i<=mid){temp[k++] = A[i++];}
        while(j<=end){temp[k++] = A[j++];}
        for(int g=start;g<=end;g++){A[g]=temp[g];}
    }
    private static int findFirst(int [] A, int left, int right, long T){
        int first = right+1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if (A[mid]>=T) {
                first = mid; right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return first;
    }
    private static int findLast(int [] A, int left, int right, long T){
        int last = left-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if (A[mid]<=T) {
                last = mid; left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return last;
    }

}
    // private static void mergeSort(int[] A, int[] temp, int start, int end){ //Too Naive... Does not work
    //     if(start>=end){return;}
    //     int mid = start+(end-start)/2;
    //     mergeSort(A, temp, start, mid); mergeSort(A, temp, mid+1, end);
    //     int i=start,j=mid+1;
    //     while(i<=mid){
    //         while(j<=end && A[i]>(long)A[j]*A[j]){
    //             j++;
    //         }
    //         inversion+=(j-(mid+1));
    //         i++;
    //     }
    //     merge(A, temp, start, mid, end);
    // }
    
    // private static int [] merge(int [] A, int[] B){ //works but not enough
    //     int i=0,j=0,k=0;
    //     int [] C = new int[A.length+B.length];
    //     while(i<A.length && j<B.length){
    //         if(A[i]<=B[j]){
    //             C[k++] = A[i++];
    //         }else{
    //             int o=i;
    //             while(o<A.length && A[o]<=Math.powExact(B[j], 2)){o++;}
    //             inversion+=A.length-o;
    //             C[k++] = B[j++];
    //         }
    //     }
    //     while(i<A.length){
    //         C[k++] = A[i++];
    //     }
    //     while(j<B.length){
    //         C[k++] = B[j++];
    //     }
    //     return C;
    // }

    // private static int [] mergeSort(int [] A,int s, int e){
    //     if(A.length<=1){return A;}
    //     int mid = s+(e-s)/2; int [] a = Arrays.copyOfRange(A, s, mid), b = Arrays.copyOfRange(A, mid, e);
    //     a = mergeSort(a, 0, a.length); b = mergeSort(b, 0, b.length);
    //     return merge(a, b);
    // }
