
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.*;

public class Algorithms {

    public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static void main(String[] args) throws Exception{
        // String s = PotionMix("6 10", "1 3 4 6 7 9"); pw.println(s);
        // s=LineThemUp("11 3", "1 2 3 3 4 4 6 8 9 9 11"); pw.println(s);
        // int wood = Needwood("10 8", "53 41 32 30 47 31 40 35 25 49"); pw.println(wood);
        // pw.println(PerfectPlaylist("6", "1 2 1 3 2 4"));
        // pw.println(FrogJumps(bf.readLine()));
        // pw.println(TreasureMap("13","1 2 3 3 4 4 6 7 8 9 9 9 11", 3, 9));
        // pw.println(BalancedTeam("12", "11 10 12 12 16 17 8 13 16 8 16 9"));
        // pw.println(findPeak(new int[]{2,3,4,5,6,8,4,3,2,1}));
        // pw.println(findValley(new int[]{9,8,7,5,2,7,8,9,11}));
        // pw.println(LinearSearchToFindSquareRoot(80));
        // pw.println(BinarySearchToFindSquareRoot(77));
        // pw.println(TwoSum(new long[]{1,5,8,9,9,10},18));
        // pw.println(TSRev(new long[]{-5 ,-2,-1,5}, new long[]{-5,0,1,1}, 0));
        // pw.println(ThreeSum(new long[]{2,1,1,2,2,1,1}, 5));
        // int a [] = PosNeg(new int[] {-1, 6,9,-15, 0,- 13, 3, - 4, 5, - 6});
        // pw.println(Arrays.toString(a));
        // pw.println(leftestPos(a));
        // pw.println(FindMinwDnC(new int[] {-1, 6,9,-15, 0,- 13, 3, - 4, 5, - 6},0,9));
        // pw.println(minPossible(new int[]{3, 4, 5}));
        // // pw.println(Arrays.toString(QuickSort(new int[] {5,4,3,2,1},0,4)));
        // pw.println(Arrays.toString(CountingSortWithNegs(new int[] {1, 6,9,15, 0,13, 3, 4, 5,6})));
        // pw.println(Karatsuba(134, 48));
        // pw.println(KadaneAlgo(new int[] {-1, 6,9,-15, 0, 13, 3, - 4, 5, - 6}));
        // int [] A = {-1, 6,9,-15, 0, 13, 3, - 4, 5, - 6}, B = MaxSumSubwDivandConq(A, 0, A.length-1);
        // pw.printf("Max sum is = %d\nStarting index: %d\nEnding Index: %d\n",B[2],B[0],B[1]);
        pw.println(RetMin(new int[] {-6, 3, -4, -3, 5, -1, 2, -2}, 0, 7));
        pw.flush();
    }
    private static int minPossible(int [] arr){
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] < arr[mid + 1]){
                left = mid + 1;
            }
            else{
                right = mid;
            }
        }
        return arr[left];
    }
    private static String TwoSum(long [] A, int Targ){
        int start =0, end = A.length-1;
        while(start<end){
            long sum = A[start]+A[end];
            if(sum < Targ){start++;}
            else if(sum>Targ){end--;}
            else{return (start+1)+" "+(end+1);}
        }
        return ""+-1;
    }
    private static String TSRev(long [] A, long [] B, long T){
        long min = Long.MAX_VALUE; int start=0,end = B.length-1, close1=-1,close2=-1;
        while(start<A.length && end>=0){
            long sum = A[start]+B[end];
            if(Math.abs(sum-T) == 0){return (start+1)+" "+(end+1);}
            if(Math.abs(sum-T)<min){min = Math.abs(sum-T); close1 = start; close2 = end;}
            if(sum<T){start++;}else{end--;}
            
        }
        return (close1+1)+" "+(close2+1);
    }
    private static String ThreeSum(long[] A, long T){
        long [][] mat = new long[A.length][2];
        for(int i=0;i<A.length;i++){mat[i][0] = A[i]; mat[i][1] = i+1;}
        Arrays.sort(mat,(a,b)->Long.compare(a[0],b[0]));
        for(int i=0;i<A.length;i++){
            long x = mat[i][0];
            int left = i+1, right = A.length-1;
            while(left<right){
                long sum = x+mat[left][0]+mat[right][0];
                if(sum<T){
                    left++;
                }else if (sum>T) {
                    right--;
                }else{
                    return (mat[i][1])+" "+(mat[left][1])+" "+(mat[right][1]);
                }
            }
        }
        return ""+-1;
    }
    private static int[] SortedList(int [] A, int[]B){
        int[]C=new int[A.length+B.length];
        int i=0,j=0,k=0;
        while(i<A.length && j<B.length){
            if (A[i]<=B[j]) {
                C[k++] = A[i++];
            }else{C[k++] = B[j++];}
        }
        while(i<A.length){
            C[k++] = A[i++];
        }
        while(j<B.length){
            C[k++] = B[j++];
        }
        return C;
    }
    private static int MaxSub(long [] A, long T){
        int upI=0,upJ=0,i=0,j=0, max=0;
        while(j<A.length){
            long sum = A[i];
            while(j<A.length && sum+A[j]<T){
                sum+=A[j++];
            }
            if(j-i>max){max=j-i;}
            while(i<A.length && sum-A[i]>T){
                sum-=A[i++];
            }
            if(j-i>max){max=j-i;}
        }
        return max;
    }
    private static int RangeCount(int [] A, int f, int l){
        int U = findFforRangecount(A, f), L = findLforRangecount(A, l);
        return L-U+1;
    }
    private static int findFforRangecount(int [] A, int f){
        int left =0, right = A.length;
        while(left<right){
            int mid  = left +(right-left)/2;
            if (A[mid]>=f) {
                right = mid;
            }else if (A[mid]<f) {
                left = mid+1;
            }
        }
        return left;
    }
    private static int findLforRangecount(int [] A, int L){
        int left =0, right =A.length;
        while(left<right){
            int mid = left+(right-left)/2;
            if(A[mid]>L){right = mid;}
            else{left = mid+1;}
        }
        return left;
    }
    private static int LongestSub(int [] A, int max){
        int repeats [] = new int[A.length+1];
        int i=0,j=0, length=0,count=0;
        while(j<A.length){
            if (repeats[A[j]]==0) {
                count++;
            }repeats[A[j]]++;
            while(count>max){
                repeats[A[i]]--;
                if (repeats[A[i]] == 0) {
                    count--;
                }
                i++;
            }
            length = Math.max(length, j-i+1);
            j++;
        }
        return length;
    }
    private static String PotionMix(String A, String B){
        StringTokenizer st = new StringTokenizer(A); int N = Integer.parseInt(st.nextToken()), X = Integer.parseInt(st.nextToken());
        st=new StringTokenizer(B); int arr[]=new int[N]; for(int i=0;i<N;i++){arr[i]=Integer.parseInt(st.nextToken());}
        int left=0,right=N-1, count=0; String S = "";
        while(left<right){
            if(arr[left]+arr[right] == X){
                S+=arr[left]+" & "+arr[right]+"\n";count++; left++;right--;
            }
            else if(arr[left]+arr[right]>X){right--;}else{left++;}
        }
        return count+"\n"+S;
    }
    private static String LineThemUp(String A, String B) throws Exception{
        StringTokenizer st = new StringTokenizer(A); int N = Integer.parseInt(st.nextToken()), X = Integer.parseInt(st.nextToken());
        st=new StringTokenizer(B); int arr[]=new int[N]; for(int i=0;i<N;i++){arr[i]=Integer.parseInt(st.nextToken());}StringBuilder s= new StringBuilder();
        for(int i=0;i<X;i++){
            int left=0,right=N; int H = Integer.parseInt(bf.readLine());
            while(left<right){
                int mid =left+(right-left)/2;
                if (H<=arr[mid]) {
                    right=mid;
                }else{left = mid+1;}
            }s.append(left).append("\n");
        }
        return s.toString();
    }
    private static int Needwood(String A, String B) throws Exception{
        StringTokenizer st = new StringTokenizer(A);
        int N = Integer.parseInt(st.nextToken()); Long M = Long.parseLong(st.nextToken());
        st= new StringTokenizer(B); int arr[]=new int[N]; for(int i=0;i<N;i++){arr[i]=Integer.parseInt(st.nextToken());}
        int low=0,high=Integer.MAX_VALUE;
        while(low<=high){
            int i=0,mid = low+(high-low)/2; long sum=0;
            while(i<N){
                if (arr[i]> mid) {
                    sum+=arr[i]-mid;
                }i++;
            }
            if(sum>=M){
                low=mid+1;
            }else{high=mid-1;}
        }
        return high;
    }
    private static int PerfectPlaylist(String A, String B){
        StringTokenizer st = new StringTokenizer(B);
        int left =0,right=0, len = 0, songs [] = new int[Integer.parseInt(A)], ID [] = new int[100000+1];
        for(int i=0;i<songs.length;i++){songs[i]=Integer.parseInt(st.nextToken());}
        while(right<songs.length){
            ID[songs[right]]++;
            while (ID[songs[right]]>1) {
                ID[songs[left]]--;left++;
            }
            len = Math.max(len, right-left+1);
            right++;
        }
        return len;
    }
    private static long FrogJumps(String S) throws Exception{
        StringTokenizer ss = new StringTokenizer(S);
        long A = Long.parseLong(ss.nextToken()), B  = Long.parseLong(ss.nextToken()), K  = Long.parseLong(ss.nextToken());
        long o = 0, e=0;
        if (K%2==1) {
            o=K/2+1; e= K-o;
        }else{o=K/2; e=K/2;}
        return A*o - B*e;
    }
    //For F
    private static long TreasureMap(String N, String A, int L, int R){
        long [] arr = new long[Integer.parseInt(N)+1];
        StringTokenizer st =new StringTokenizer(A); 
        for(int i=1;i<arr.length;i++){arr[i] = arr[i-1]+ Long.parseLong(st.nextToken());}
        return arr[R]-arr[L-1];
        // ArrayList <Long> arr = new ArrayList<>(); arr.add(Long.parseLong(st.nextToken())); int i=1; // still SLOOOOOWW
        // while(st.hasMoreTokens()){arr.add(arr.get(i-1)+Long.parseLong(st.nextToken()));i++;}
        // while(st.hasMoreElements()){arr.add(Integer.parseInt(st.nextToken()));} //Great and AMAZING but TIME LIMIT!!!! So we use pREfix Sum
        // int i=0,j=arr.size(), l=0,r=j; 
        // while(i<j){
        //     int mid = i+(j-1)/2;
        //     if(arr.get(mid)>=L){
        //         j=mid;
        //     }else{i=mid+1;}
        // }
        // while(l<r){
        //     int mid = l+(r-l)/2;
        //     if(arr.get(mid)<=R){
        //         l=mid;
        //     }else{r=mid-1;}
        // }
        // long sum = 0;
        // for(int g=i;g<=l;g++){sum+=arr.get(g);}
        
    }
    //For G
    private static int BalancedTeam(String A, String B){
        long players [] = new long[Integer.parseInt(A)]; StringTokenizer st = new StringTokenizer(B);
        for(int i=0;i<players.length;i++){
            players[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(players);
        // long max = Long.MIN_VALUE; // Veeeeeeeery FaAAAAAst but takes a LOT of space!!!
        // long [] freq = new long[(int)max+1]; for(int i=0;i<players.length;i++){freq[(int)players[i]]++;} int count=0;
        // for(int i=0;i<freq.length;i++){
        //     while(freq[i]>0){
        //         players[count++] = i; freq[i]--;
        //     }
        // }
        int left=0,right=0,team=0;
        while(right<players.length){
            while (players[right]-players[left]>5) {
                left++;
            }
            team = Math.max(team, right-left+1);
            right++;
        }
        return team;
    }
    private static int findPeak(int [] arr){  //I WROTE THIS Perfectly, seemingly. But is NAIVE.
        if (arr == null || arr.length == 0) return -1; // empty array //Edge cases provided by GPT
        if (arr.length == 1) return arr[0];           // single element
        int left=0, right = arr.length;
        while(left<right){
            int mid = left+(right-left)/2;
            if(mid<arr.length-1 && arr[mid+1]>arr[mid]){left = mid+1;}
            else if(mid>0 && arr[mid-1]>arr[mid]){right = mid-1;}
            else{
                return arr[mid];
            }
        }
        return Integer.MIN_VALUE;
    }
    private static int findValley(int [] arr){ //I WROTE THIS Perfectly, seemingly. But is NAIVE.
        if (arr == null || arr.length == 0) return -1; // empty array //Edge cases provided by GPT
        if (arr.length == 1) return arr[0];           // single element
        int left=0, right = arr.length;
        while(left<right){
            int mid = left+(right-left)/2;
            if (mid>0 && arr[mid-1]<arr[mid]) {
                right = mid-1;
            }else if (mid<arr.length-1 && arr[mid+1]<arr[mid]) {
                left = mid+1;
            }
            else{return arr[mid];}
        }
        return Integer.MIN_VALUE;
    }
    private static int LinearSearchToFindSquareRoot(int key){
        int result =-1;
        for(int i=1;i*i<=key;i++){
            result=i;
        }
        return result;
    }
    private static int BinarySearchToFindSquareRoot(int key){
        if(key<=0){return 0;}
        int i = 1, j = key, root = -1;
        while(i<=j){
            int mid = i+(j-i)/2;
            if (mid*mid<key) {
                root = mid;
                i=mid+1;
            }
            else if(mid*mid>key){j=mid-1;}
            else{return mid;}
        }
        return root;
        //return Math.abs(i*i-key)>Math.abs(j*j-key)?j:i;
    }
    private static int[] PosNeg(int [] arr){
        int i =0,j=0;
        while(j<arr.length){
            if (arr[j]<0) {
                int swap = arr[j]; arr[j] = arr[i]; arr[i++] = swap;
            }j++;
        }
        return arr;
    }
    private static int leftestPos(int [] arr){
        int i=0, j= arr.length;
        while(i<j){
            int mid = i+(j-i)/2;
            if(arr[mid]<=0){
                i = mid+1;
            }else{j=mid;}
        }
        return j;
    }
    private static  int FindMinwDnC(int [] arr){ // Original O(nlogn)
        if(arr.length ==1){return arr[0];}
        if(arr.length == 2){return arr[0]<arr[1]?arr[0]:arr[1];}
        int [] a1 =Arrays.copyOfRange(arr, 0, arr.length/2), a2 = Arrays.copyOfRange(arr, arr.length/2, arr.length);
        int m1 = FindMinwDnC(a1), m2 = FindMinwDnC(a2);
        return m1<m2?m1:m2;
    }
    private static  int FindMinwDnC(int [] arr, int start, int end){ //Updated O(n)
        if(start == end){return arr[start];}
        if(end - start == 1){return arr[start]<arr[end]?arr[start]:arr[end];}
        int m = start+(end-start)/2;
        int m1 = FindMinwDnC(arr,start, m), m2 = FindMinwDnC(arr,m+1, end);
        return m1<m2?m1:m2;
    }
    private static void BubbleSort(int [] arr){ //compare two side by side. then swap.
        for(int i=0;i<arr.length;i++){
            boolean swapped = false;
            for(int j = 0;j<arr.length;j++){
                if (arr[j]>arr[j+1]) {
                    int s = arr[j]; arr[j] = arr[j+1]; arr[j+1] = s; swapped = true;
                }
            }
            if(swapped){break;}
        }
    }
    private static void SelectionSort(int [] arr){  // keep picking one and find the palce for it, then swap outside inner loop.
        for(int i=0;i<arr.length;i++){
            int min  = i;
            for(int j = i+1;j<arr.length;j++){
                if (arr[j]<arr[min]) {
                    min = j;
                }
            }
            int s = arr[min]; arr[min] = arr[i]; arr[i] = s;
        }
    }
    private static void InsertionSort(int [] arr){ // find an element that is smaller, save it. Then move everything forward and then push it to the front.
        for(int i=1;i<arr.length;i++){
            int j = i-1, key = arr[i];
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j]; j--;
            }
            arr[j+1] = key;
        }
    }

    private static int Quick_Parti(int [] A, int start, int end){
        if(end<=start){return start;}
        Random ran = new Random();
        int p = ran.nextInt(end-start+1) + start, pivot = A[p]; A[p] = A[start]; A[start] = pivot; p =start;
        int i = p,j=p+1;
        while(j<=end){
            if(A[j]<=pivot){
                i++;
                int s = A[i]; A[i] = A[j]; A[j] = s;
            }
            j++;
        }
        int s = A[i]; A[i] = pivot; A[p] = s;
        return i;
    }
    private static int[] QuickSort(int [] A, int start, int end){
        if(start<end){
            int pivot = Quick_Parti(A, start, end);
            QuickSort(A, start, pivot-1); QuickSort(A, pivot+1, end);
            return A;
        }
        else{return A;}
    }

    private static int[] CountingSort(int [] A){
        int max =-1;
        //loop for finding MAXXX
        for(int i=0;i<A.length;i++){
            if (A[i]>max) {
                max =A[i];
            }
        }
        //frequency array for counting appearences
        int freq [] = new int[max+1];
        for(int i=0;i<A.length;i++){
            freq[A[i]]++;
        }
        //prefix sum for perrrrfect positioning
        for(int i=1;i<freq.length;i++){freq[i] +=freq[i-1];}
        //new array for sorting and returning
        int B [] = new int[A.length];
        //loop to read different arrays and final sorting
        for(int i = A.length-1;i>=0;i--){
            B[freq[A[i]]-1]=A[i];
            freq[A[i]]--;
        }
        return B;
    }
    private static int[] CountingSortWithNegs(int [] A){
        int min =A[0], max = A[0];
        // Loop to find min and max
        for(int i=0;i<A.length;i++){
            if(A[i]>max){max=A[i];}
            if(A[i]<min){min = A[i];}
        }
        // variable to manage negs
        int push= -min;
        // array to count appearances 
        int freq[] = new int[max+push+1];
        for(int i=0;i<A.length;i++){
            freq[A[i]+push]++;
        }
        //loop to get prefix sum
        for(int i=1;i<freq.length;i++){
            freq[i]+= freq[i-1];
        }
        //new Array to store soorteds
        int [] B = new int[A.length];
        //loop to get values in the array
        for(int i=A.length-1;i>=0;i--){
            B[freq[A[i]+push]-1] = A[i];
            freq[A[i]+push]--;
        }
        return B;
    }

    private static long Karatsuba(int x, int y){
        if((x<=9 && x>=-9) || (y<=9 && y>=-9)){ return x*y;}
        
        int n1 = (int)numCount(x), n2 = (int)numCount(y);
        int n = Math.max(n1, n2); //n1>n2?n1:n2;

        if(n>n1){if(n%2==1){n++;}x = (int)EqualNumforKaratsuba(x, n1, n);}
        if(n>n2){if(n%2==1){n++;}y = (int)EqualNumforKaratsuba(y, n2, n);}

        int pow2 = Math.powExact(10, n/2), pow = Math.powExact(10, n);
        int xH = x/pow2, xL = x%pow2, yH = y/pow2, yL = y%pow2;
        
        long a = Karatsuba(xH, yH), b = Karatsuba(xL, yL), c= Karatsuba(xH+xL, yL+yH);
        return (a*pow + (c-a-b)*pow2+b);
    }
    private static long EqualNumforKaratsuba(int x, int n1, int n){
        String s1= ""+x;
        while(n1<n){
            s1 = "0"+s1;
            n1++;
        }
        return Long.parseLong(s1);
    }
    private static long numCount(long x){
        if(Math.abs(x)<=9){return 1;}
        return 1+numCount(x/10);
    }
    private static int[] MaxSumSubwDivandConq(int [] A, int start, int end){
        if(start == end){return new int[]{start, end, A[start]};}
        int mid = start + (end-start)/2;
        int [] leftSub = MaxSumSubwDivandConq(A, start, mid);
        int [] rightSub = MaxSumSubwDivandConq(A, mid+1, end);
        int [] crossSub = CrossSumCount(A, start, mid, end);

        if (leftSub[2]>=rightSub[2] && leftSub[2]>=crossSub[2]) {
            return leftSub;
        }else if(rightSub[2]>=leftSub[2] && rightSub[2]>=crossSub[2]){
            return rightSub;
        }else{
            return crossSub;
        }
    }
    private static int[] CrossSumCount(int[]A, int start, int mid, int end){
        int maxR = -1, maxL = -1, leftSum = Integer.MIN_VALUE, rightSum = Integer.MIN_VALUE, temp=0;
        for(int i = mid;i>=start;i--){
            temp+=A[i];
            if (temp>leftSum) {
                leftSum = temp; maxL = i;
            }
        }
        temp=0;
        for(int i = mid+1; i<=end;i++){
            temp+=A[i];
            if (temp>rightSum) {
                rightSum = temp; maxR = i;
            }
        }
        return new int[]{maxL, maxR, leftSum+rightSum};
    }
    private static String KadaneAlgo(int [] A){ // I did this
        int i = 0,j =0, max =Integer.MIN_VALUE, temp = 0, m_i = -1, m_j = -1;
        while(j<A.length){
            temp+=A[j];
            if(temp<=A[j]){ i = j; temp = A[j];}
            if(temp>max){max = temp; m_i = i; m_j = j;}
            j++;
        }
        return "Max Sum is  = "+max+" from "+m_i+" to "+m_j;
    }
    private static int[] LongPosSub(int[] A, int start, int end) { // AI ovbiously
        // Base case: returns [start_index, end_index, length]
        if (start == end) {
            if (A[start] > 0) {
                return new int[]{start, end, 1}; // Valid streak of length 1
            } else {
                return new int[]{start, end, 0}; // Invalid, length 0
            }
        }
        
        int mid = start + (end - start) / 2;
        int[] leftSub = LongPosSub(A, start, mid);
        int[] rightSub = LongPosSub(A, mid + 1, end);
        int[] crossSub = CrossPos(A, start, mid, end);

        // The rest of your comparison logic is PERFECT!
        if (leftSub[2] >= crossSub[2] && leftSub[2] >= rightSub[2]) {
            return leftSub;
        } else if (rightSub[2] >= leftSub[2] && rightSub[2] >= crossSub[2]) {
            return rightSub;
        } else {
            return crossSub;
        }
    }
    private static int[] CrossPos(int[] A, int start, int mid, int end) { // AI ovbiously
        int leftCount = 0, rightCount = 0;
        int maxi = mid, maxj = mid + 1; // Default bounds

        // Go left from mid
        for (int i = mid; i >= start; i--) {
            if (A[i] > 0) {
                leftCount++; // Add 1 to length!
                maxi = i;
            } else {
                break; // Streak broken by a 0 or negative number
            }
        }

        // Go right from mid+1
        for (int i = mid + 1; i <= end; i++) {
            if (A[i] > 0) {
                rightCount++; // Add 1 to length!
                maxj = i;
            } else {
                break; // Streak broken!
            }
        }

        // Return the bounds and the total LENGTH of the crossing streak
        return new int[]{maxi, maxj, leftCount + rightCount};
    }
    
    // private static int leftPos(int [] A){ // midprep
    //     int s =0, e = A.length -1;
    //     while(s<e){int mid = s+(e-s)/2;
    //         if(A[mid]>0){e=mid;}
    //         else{s=mid+1;}
    //     }
    //     return e;
    // }
    private static int RetMin(int [] A, int start, int end){
        if(end<=start){return A[start];}
        int mid = start+(end-start)/2;
        return Math.min(RetMin(A, start, mid), RetMin(A, mid+1, end));
    }

}
