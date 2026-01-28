import java.util.*;

public class ArrPracRegen {
    public static void main(String [] args){
        ThreeLinearArrayUnion(new int[]{6, 2},new int[]{85, 25, 1, 32, 54, 6},new int[]{85, 2});
        PosesAndNegs(new int[]{-5, 7, -3, -4, 9, 10, -1, 11});
        LinArrayMajority(new int[]{1,2,3,4,5,3,3,3,3,3,3,3,3,3,3});
        ArrayOp(new int[] {3, 9, 12, 16, 20}, 03);
        NeededPlatformsCheck(new String[]{"900", "940", "950", "1100"},//{"0900","0940","0950","1100","1500","1800"},
                             new String[]{"930", "1200", "1120", "1130"});//{"0910","1200","1120","1130","1900","2000"});
        NeededPlatformsCheck(new String[]{"0900","1100","1235"},new String[]{"1000","1200","1240"});

}
public static void NeededPlatformsCheck (String [] A, String [] D){
    int platform = 1;
    String [] arr = A; String [] dep = D;
    Boolean [] occupied; int open = 0;
    for(int i = 0; i<arr.length;i++){
        occupied = new Boolean[platform]; int occ = 0; for(int k = 0;k<platform;k++){occupied[k]=false;}
        for(int j = 0; j<i;j++){
            if(Integer.parseInt(arr[i])<Integer.parseInt(dep[j])){
                if(occ<platform){occupied[occ++] = true;}
            }
        } Boolean has  = true;
        for(int check =0;check<platform; check++){
            if(occupied[check] == false){
                continue;
            } has = false;
        }
        if (!has) {
            platform++;
        }open = occupied.length;System.out.println(Arrays.toString());
    }
    System.out.println("Minimum "+open+" platforms are required to safely arrive and depart all trains.");
}

    public static void ArrayOp(int [] arr,int k){
        int A [] =arr;
        for(int i = 0; i<A.length;i++){
            if(i%2==1){if(A[i]-k<0){A[i]+=k;}else{A[i]-=k;}continue;}
            A[i]+=k;
        }
        int min = A[0], max = A[0];
        for(int i = 0;i<A.length;i++){
            if(A[i]>max){max=A[i];} if(A[i]<min){min = A[i];}
        }
        System.out.println("Modded Array - "+Arrays.toString(A));
        System.out.println("The difference between the largest and the smallest is - "+(max-min));
    }
    public static void FindSortedMedian(Integer [] F, Integer []G){ //1.15

        Integer [] Merged = mergeSortedArray(F, G);
        double sum=0,median=0;
        if(Merged.length%2==0){sum+=Merged[Merged.length/2]+Merged[(Merged.length/2)-1];median=sum/2;}else{median+=Merged[(Merged.length/2)];} 
        System.out.println("The Merged Array-"+Arrays.toString(Merged));System.out.println("The median - "+median);
        
    }
    
    public static Integer[] mergeSortedArray( Integer[] arr1, Integer[] arr2 ){

       Integer [] Merged = new Integer [arr1.length+ arr2.length];
       int i = 0, a=0, b=0;

       while(a<arr1.length && b<arr2.length){
        if(arr1[a]<arr2[b]){Merged[i++]=arr1[a++];continue;}Merged[i++]=arr2[b++];
       }
       while(a<arr1.length){
        Merged[i++]=arr1[a++];
       }
       while(b<arr2.length){
        Merged[i++]=arr2[b++];
       }
        return Merged;
    }
    public static void LinArrayMajority(int [] arr){//1.9
        
        int [] A = arr; int pos=0;
        int copy [] =new int[A.length];
        for(int i=0; i<A.length; i++){ Boolean has = false;
            for(int j=0; j<copy.length;j++){
                if(A[i]==copy[j]){has =true;}
            }if(has == true){continue;}copy[pos++]=A[i];
        }
        int nums [] = new int [pos]; 
        for(int i=0;i<pos; i++){
            for(int j =0; j<A.length;j++){
                if(copy[i]==A[j]){nums[i]+=1;}
            }
        }int maj = 0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]>(A.length/2)){maj = i;break;}maj=-1;
        }Boolean same = true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){same = false;}
        }
        if(same==true || maj==-1){ System.out.println("No majority element.");return;}System.out.println("The majority element is : "+ copy[maj]);
        
    }

    public static void WaveTheArray(int [] A){//1.8

        int [] arr = A;
        for(int i = 0;i<arr.length;i+=2){
            int a = arr[i];
            arr[i]=arr[i+1]; arr[i+1] = a;
        }
        System.out.println("Array elements after sorting it in wave form are "+Arrays.toString(arr));
        
    }
    public static void WaterVolOfPillars(int [] A, int width){//1.7
        
        int widthOfPiller = width;
        int [] arr = A;
        int Len = arr.length-(2*widthOfPiller);
        int negArea = 0;
        for(int i = 1; i<arr.length-1; i++){
            if(arr[i]!=0){negArea+=arr[i]*widthOfPiller;}
        }
        int H=0;if(arr[0]>arr[arr.length-1]){H = arr[arr.length-1];}else{H=arr[0];}
        int WaterVol = (H*Len) - negArea; if(WaterVol<0){WaterVol=0;}
        System.out.println("The amount of stored water is - "+WaterVol);
            
    }
    public static void LinArrSum(int [] A,int S){//1.3
        
        int sum = S, calc = 0; int [] arr = A;
        int sub [] =new int [arr.length];int start=0,end = 0,pos=0;
        for(int i =0; i<arr.length;i++){
            calc = 0;
            for(int j=i;j<arr.length;j++){
                calc+=arr[j]; if(calc==sum){start=i;end=j;break;}
            }if(calc==sum){break;}
        }
        for(int i = start; i<end; i++){
            sub[pos++] = arr[i];
        }
        System.out.println("The sum of elements from index "+start+" to index "+end+" is "+calc);       
    }
    public static void PosesAndNegs(int A[]){//1.2
        int arr [] = A;
                int neg=0,pos=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<0){neg++;continue;}pos++;
        }
        int negs[]=new int[neg]; int poses [] =new int[pos];
        neg=0;pos=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){negs[neg++]=arr[i];continue;}poses[pos++]= arr[i];
        }
        System.out.printf("the positives - \n"+Arrays.toString(poses)+"\nthe negatives - \n"+Arrays.toString(negs)+"\n");
        for(int p =0, n=poses.length; p<poses.length || n<arr.length;p++,n++){
            if(p<poses.length){arr[p] = poses[p];} if(p<negs.length){arr[n] = negs[p];}
        }
        System.out.println("Positives and Negatives without changing original order - \n"+Arrays.toString(arr));
    }
    public static void ThreeLinearArrayUnion(int A[], int [] B, int []C){ //1.1
        
        int a [] = A; int [] b = B; int [] c = C; int [][] N = new int[3][];N[0] = a;N[1] = b; N[2]=c;
        int un [] = new int [a.length+b.length+c.length]; int pos=0;
        for(int i=0; i<a.length;i++){
            un[pos] = a[i];pos++;
        }
        for(int i=0; i<b.length;i++){
            un[pos] = b[i];pos++;
        }
        for(int i=0; i<c.length;i++){
            un[pos] = c[i];pos++;
        }int dup=0;
        for(int i =0; i<un.length;i++){
            for(int j = i+1;j<un.length;j++){
                if((un[j] == un[i]) && (un[j]!=Integer.MAX_VALUE)){un[j] = Integer.MAX_VALUE; dup++;} 
            }
        }
        int [] union = new int[pos-dup]; pos=0;
        for(int i=0; i<un.length;i++){
            if(un[i]!= Integer.MAX_VALUE){union[pos++]=un[i];}
        }
        System.out.println("The array - "+Arrays.toString(union));
        System.out.println("Number of elements in array - "+union.length);
    }
}
