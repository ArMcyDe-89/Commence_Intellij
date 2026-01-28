public class Merge {
    public static int[] mergeSort(int [] arr) {
        int length = arr.length;
        int [] A =new int[length];
        if(arr.length == 1){return arr;}
        else{
            int [] c1 =new int[length/2], c2  =new int[length/2]; int c = 0;
            for(int i =0; i<length;i++){if(c<length/2){c1[c++] = arr[i];continue;}c2[c++] = arr[i];}
            mergeSort(c)
        }
    }
}
