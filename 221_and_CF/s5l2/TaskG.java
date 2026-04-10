import java.io.*;
import java.util.*;

public class TaskG {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st1 = new StringTokenizer(bf.readLine());
        int a [] = new int[Integer.parseInt(st1.nextToken())]; int n = Integer.parseInt(st1.nextToken()),i=0;
        st1 =  new StringTokenizer(bf.readLine());
        for(int j=0;j<a.length;j++){a[j] = Integer.parseInt(st1.nextToken());}
        while (i<n) { 
            st1 = new StringTokenizer(bf.readLine());
            int first = Integer.parseInt(st1.nextToken()), last= Integer.parseInt(st1.nextToken());
            int ff = findFirst(a, first), ll = findLast(a, last);
            pw.println(ll-ff);i++;
        }pw.flush();
    }
    private static int findFirst(int [] a,int x){
        int l=0,r=a.length;
        while(l<r){
            int mid = l+(r-l)/2;
            if(a[mid]>=x){
                r=mid;
            }
            else{l=mid+1;}
        }return l;
    } 
    private static int findLast(int [] a,int x){
        int l=0,r=a.length;
        while(l<r){
            int mid = l+(r-l)/2;
            if(a[mid]>x){
                r=mid;
            }
            else{
                l=mid+1;
            }
        }return l;
    }
}
        // Pair [] P  = new Pair[n]; int nums [] = new int [n];
        // while(i<n){
        //     st1 = new StringTokenizer(bf.readLine());
        //     P[i++] = new Pair(Integer.parseInt(st1.nextToken()), Integer.parseInt(st1.nextToken()));
        // }
    // while(a[start]<p.front){start++;}while(a[end]>p.back){end--;}
    // static class Pair{
    //     public int front,back;
    //     public Pair(int f, int b){
    //         this.front = f; this.back = b;
    //     }
    // }
