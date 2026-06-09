
import java.io.*;
import java.util.*;

public class Merge {
    public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static void main(String[] args) throws Exception{
        while(true){
            pw.println("Give nums");pw.flush(); String S = bf.readLine(); if(S.equals("break")){break;} 
            StringTokenizer st = new StringTokenizer(S);
            ArrayList <Integer> arr = new ArrayList<>();
            while(st.hasMoreTokens()){
                arr.add(Integer.parseInt(st.nextToken()));
            }
            int A [] = new int[arr.size()]; for(int i =0;i<A.length;i++){A[i] = arr.get(i);} A = ThreeDiv(A, 0, A.length);
            pw.println(Arrays.toString(A));
        }
    }
    public static int[] ThreeDiv(int [] arr, int start, int end){
        if(arr.length <= 1){return arr;}
        int b1 = arr.length/3, b2 = (arr.length*2)/3;
        int [] a =Arrays.copyOfRange(arr, start, b1), 
        b = Arrays.copyOfRange(arr, b1, b2),
        c = Arrays.copyOfRange(arr, b2, end);
        a = ThreeDiv(a, 0, a.length); b = ThreeDiv(b, 0, b.length); c= ThreeDiv(c, 0, c.length);
        return Merge(Merge(a, b),c);
    }
    // public static int[] ThreeDiv(int [] arr, int start, int end){ //GPT
    //     int len = end - start;
    //     if(len <= 1){
    //         return Arrays.copyOfRange(arr, start, end);
    //     }

    //     int rem = len % 3;
    //     int size1 = len/3 + (rem > 0 ? 1 : 0);
    //     int size2 = len/3 + (rem > 1 ? 1 : 0);
    //     int mid1 = start + size1;
    //     int mid2 = mid1 + size2;

    //     int[] a = ThreeDiv(arr, start, mid1);
    //     int[] b = ThreeDiv(arr, mid1, mid2);
    //     int[] c = ThreeDiv(arr, mid2, end);

    //     return Merge(Merge(a, b), c);
    // }
    public static int[] mergeSort(int [] arr) {
        if(arr.length <= 1){return arr;}
        else{
            int [] A1 = new int[arr.length/2], A2 = new int[arr.length-arr.length/2];
            for(int i=0;i<arr.length;i++){
                if (i<arr.length/2) {
                    A1[i] = arr[i];
                }else{
                    A2[i-arr.length/2] = arr[i];
                }
            }
            A1 = mergeSort(A1); A2 = mergeSort(A2); arr = Merge(A1, A2);

        }
        return arr;
    }
    private static int[] Merge(int[]A, int[]B){
        int i=0,j=0,k=0;
        int [] C = new int[A.length+B.length];
        while(i<A.length && j<B.length){
            if (A[i]<=B[j]) {
                C[k++] = A[i++];
            }
            else{
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
}
