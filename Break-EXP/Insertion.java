public class Insertion {
    public static int [] Sort(int [] A){
        for(int  i=1;i<A.length;i++){
            int j=i;
            while(j>=0 && A[j-1]<A[j]){
                int swap = A[j]; A[j] = A[j-1]; A[j-1] = swap; j--;
            }
        }
        return A;
    }
}
