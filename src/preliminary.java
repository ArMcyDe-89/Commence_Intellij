import java.util.Arrays;
import java.util.Scanner;

public class preliminary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Task_1
//        double sum =0.0;
//        int odd = 0;
//        double average;
//        int min =  Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//        for(int i = 1; i<= 10; i++){
//            System.out.println("Enter an integer: ");
//            int num = sc.nextInt();
//            if(num>0 && num%2!=0){
//                sum+=num;
//                odd++;
//                if(num>max){
//                    max = num;
//                }
//                if(num<min){
//                    min = num;
//                }
//            }
//        }
//        average = sum/odd;
//        System.out.printf("Sum = %.0f\nMinimum = %d\nMaximum = %d\nAverage = %.2f\n", sum, min,max,average);
//        if(odd ==0){
//            System.out.println("No odd positive numbers found");
//          }

        //Task_2
/*        System.out.println("Enter the first int");
        int fir = sc.nextInt();
        System.out.println("Enter the second int");
        int sec = sc.nextInt();
        int start;
        int end;
        if (fir > sec) {
            start = sec;
            end = fir;
        } else {
            start = fir;
            end = sec;
        }
        int primes = 0;
        int divs = 0;
        for (int i = start; i <= end; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divs++;
                }
            }
            if (divs == 2) {
                primes++;
            }
            divs = 0;
        }
        System.out.printf("There are %d primes between %d and %d.", primes, start, end);
        //TASk_3
        System.out.println("First string input:");
        String S1 = sc.nextLine();
        S1 = sc.nextLine();
        System.out.println("Second string input:");
        String S2 = sc.nextLine();
        String S3 = S1 + " " + S2;
        System.out.println(S3);
        int sum = 0;
        for (int i = 0; i < S3.length(); i++) {
            if (!((S3.charAt(i) >= 'a' && S3.charAt(i) <= 'z') || (S3.charAt(i) >= 'A' && S3.charAt(i) <= 'Z'))) {
                continue;
            } else {
                sum += (int) S3.charAt(i);
            }
        }
        System.out.println(sum);*/

        //TASK_6

/*        System.out.print("how many digits do you want in the array?");
        int N = sc.nextLine();

        int[] A = new int[N];
        boolean[] U = new boolean[N];
        for (int i = 0; i < N; i++) {
            System.out.println("enter the digit for the index " + i);
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (A[i] == A[j]) {
                    U[j] = false;
                }
            }
        }
        int unique = 0;
        for (int i = 0; i < N; i++) {
            if (U[i] == false) {
                unique++
            }
        }
        int[] AU = new int[unique];
        for (int i = 0; i < N; i++) {
            if (U[i] == false) {
                AU[k] = A[i];
                k++;
            }
        }*/

        //Task_5

        System.out.println("Enter the length of the array: ");
        int len = sc.nextInt();
        int [] IntArr = new int [len];
        for(int i =0; i<len; i++){
            System.out.println("Enter the element at index " + i);
            IntArr[i] = sc.nextInt();
        }
        int red = len-1;
        int temp;
        for(int i = 0; i<len/2; i++){
            temp = IntArr[i];
            IntArr[i] = IntArr[red];
            IntArr[red] = temp;
            red--;
        }
        System.out.println(Arrays.toString(IntArr));

        //Task_8

//        System.out.println("Enter the row length:");
//        int row = sc.nextInt();
//        System.out.println("Enter the column length:");
//        int col =  sc.nextInt();
//
//        int [][] arr2D = new int[row][col];
//        int [] arr1D = new int [row*col];
//        for(int i = 0; i<row; i++){
//            for(int j = 0; j<col; j++){
//                System.out.printf("Input at the index %d, %d will be - \n", i,j);
//                arr2D[i][j] = sc.nextInt();
//            }
//        }
//        int k = 0;
//        for(int i = 0; i<row; i++){
//            for(int j = 0; j<col; j++){
//                if(k<(arr1D.length)){
//                 arr1D[k] = arr2D[i][j]; k++;
//                }
//            }
//        }
//        System.out.println("The 2D Array: ");
//        for(int i = 0; i<row; i++){
//            for(int j = 0; j<col; j++){
//                System.out.print(arr2D[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println("The 1D Array: ");
//        for(int i = 0; i<arr1D.length; i++){
//            System.out.print(arr1D[i] +" ");
//        }

        //Task_9

        int [ ] [ ] A = {{1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}};
        boolean identity = true;
        for(int i =0; i<A.length; i++){
            for(int j =0; j<A[0].length; j++){
                if(i!=j){
                    if(A[i][j] != 0){
                        identity = false; break;
                    }
                }
                else{
                    if(A[i][j] != 1){
                        identity = false; break;
                    }
                }
            }
            if(identity == false){
                break;
            }
        }
        if(identity == false){
            System.out.println("Not an Identity Matrix");
        }
        else{
            System.out.println("Identity Matrix");
        }

        //LAST sem mid
        int [] marks = {12,15,20,17,20,13};
        System.out.print("Enter the value of k:"); int k = sc.nextInt();
        double [] avgs = new double[marks.length-k+1]; int count = 0; double max_a=0;
        for(int i =0; i<marks.length && i+k<=marks.length; i++){
            double sum = 0.0;
            for(int j = i; j<i+k ; j++){
                sum += marks[j];
            }
            double avg = sum/k; avgs[count] = avg; count++;
        }
        for(int i = 0; i <count; i++){
            if(avgs[i]>max_a){
                max_a = avgs[i];
            }
        }
        System.out.println(Arrays.toString(avgs)); System.out.println(max_a);
    }
}
