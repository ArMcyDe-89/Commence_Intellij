import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class OBT { //TaskE

    public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static void main(String[] args) throws Exception{
        int size = Integer.parseInt(bf.readLine()); int [] arr = new int[size];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i=0;i<size;i++){arr[i] = Integer.parseInt(st.nextToken());}
        StringBuilder sb = new StringBuilder();
        push(arr, 0, size-1,sb);
        pw.println(sb);
        pw.flush();
    }
    public static void push(int [] A, int left,int right, StringBuilder sb){
        if (left>right) {
            return ;
        }
        int mid = left+(right-left)/2;
        sb.append(A[mid]).append(" ");
        push(A, left, mid-1, sb);
        push(A, mid+1, right, sb);
    }
    //     public static void main(String[] args) throws Exception{
    //     int size = Integer.parseInt(bf.readLine()); int [] arr = new int[size];
    //     StringTokenizer st = new StringTokenizer(bf.readLine());
    //     for(int i=0;i<size;i++){arr[i] = Integer.parseInt(st.nextToken());}
    //     BSTNode B = null; 
    //     //B = create(arr, 0, size-1);
    //     //B = push(arr, 0, size-1, B);
    //     BSTPrinter(B);pw.println();pw.flush();
    // }
    // public static void BSTPrinter(BSTNode root){
    //     if (root == null) return;
    //     pw.print(root.elem+" ");
    //     BSTPrinter(root.left);
    //     BSTPrinter(root.right);
    // }
    // Either use insert() and create() together or just push() alone
    // public static BSTNode insert(BSTNode B, int val){
    //     if(B==null){return new BSTNode(val);}
    //     if(B.elem>val){
    //         insert(B.left, val);
    //     }else{
    //         insert(B.right, val);
    //     }
    //     return B;
    // }
    // public static BSTNode create(int [] A, int left,int right){
    //     if (left>right) {
    //         return null;
    //     }
    //     int mid = left+(right-left)/2; BSTNode B = insert(null, A[mid]);
    //     B.left = create(A, left, mid-1); B.right = create(A, mid+1, right);
    //     return B;
    // }
    // public static BSTNode push(int [] A, int left,int right,BSTNode B){
    //     if (left>right) {
    //         return null;
    //     }
    //     int mid = left+(right-left)/2;
    //     B = new BSTNode(A[mid]);
    //     B.left = push(A, left, mid-1, B.left);
    //     B.right = push(A, mid+1, right, B.right);
    //     return B;
    // }
    // static class BSTNode{
    //     public int elem;
    //     public BSTNode left,right;
    //     public BSTNode() {
    //         elem=0;
    //         this.left=null;this.right=null;
    //     }
    //     public BSTNode(int e){
    //         elem = e; left = null; right =null;
    //     }
    //     public BSTNode(int e, BSTNode l, BSTNode r){
    //         elem = e;
    //         left =l; right=r;
    //     }
        
    // }
}
