
import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int [] a ={3,45,2,5,6753,424,3,223,3,26,6,778,8,43};
        a = mergeSort(a);
        System.out.println(Arrays.toString(a));
    }
    public static int[] mergeSort(int [] arr) {
        int length = arr.length;
        int [] A =new int[length];
        if(arr.length == 1){return arr;}
        else{
            int [] c1 =new int[length/2], c2  =new int[length/2]; int c = 0,b=0;
            for(int i =0; i<length/2;i++){
                c1 [c++] = arr[i]; 
            }c=0;
            for(int i = length/2; i<length;i++ ){
                c2[c++]
            }
            c1 = mergeSort(c1); c2 = mergeSort(c2); c=0;
            for(int i = 0; i<length;i++){
                if(i<length/2){
                    arr[i] = c1[c++];continue;
                }
                arr[i] = c2[i-c++];
            }
        }
        return arr;
    }
}
