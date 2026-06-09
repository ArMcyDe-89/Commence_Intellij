
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class TaskB {
    public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static void main(String[] args) throws Exception{
        StringTokenizer st = new StringTokenizer(bf.readLine().trim());
        LinkedList [] A = new LinkedList[Integer.parseInt(st.nextToken())]; int n = Integer.parseInt(st.nextToken());
        StringTokenizer sta = new StringTokenizer(bf.readLine()), en = new StringTokenizer(bf.readLine()), we = new StringTokenizer(bf.readLine());
        for(int i=0;i<n;i++){
            int s = Integer.parseInt(sta.nextToken()) -1, e = Integer.parseInt(en.nextToken()), w = Integer.parseInt(we.nextToken());
            if(A[s] == null){A[s] = new LinkedList(e, null,w); continue;}
            LinkedList S = A[s];
            while(S.next!=null){S = S.next;}
            S.next = new LinkedList(e, null, w);
        }
        for(int i=0;i<A.length;i++){
            LinkedList B = A[i];
            pw.print((i+1)+": ");
            while(B!=null){
                pw.printf("(%d,%d) ",B.elem,B.weight); B = B.next;
            }pw.println();
        }
        pw.flush();
    }
    static class LinkedList{
        public int elem,weight;
        public LinkedList next;
        public LinkedList(int e, LinkedList ll,int w){
            elem = e; next = ll; weight = w;
        }  
    }
}
