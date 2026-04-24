import java.io.*;
import java.util.*;

public class TaskF {
    public static BufferedReader bf  = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static int [] combs = new int[10000];
    public static  boolean forbs [] = new boolean[10000];
    public static void main(String[] args) throws Exception{
        StringTokenizer st = new StringTokenizer(bf.readLine());
        String start = st.nextToken(), correct = st.nextToken();
        int forb = Integer.parseInt(bf.readLine()); for(int i=0;i<forb;i++){forbs[Integer.parseInt(bf.readLine())] = true;}
        Arrays.fill(combs, -1);
        pw.println(LockBFS(start, correct));pw.flush();
    }
    private static int LockBFS(String s, String c){
        Queue <String> q = new ArrayDeque<>();
        q.add(s); combs[Integer.parseInt(s)] = 0;
        while(!q.isEmpty()){
            String r = q.remove(); if(r.equals(c)){return combs[Integer.parseInt(r)];}
            List <String> ll = upDownCount(r);
            for(int i=0;i<ll.size();i++){
                String k = ll.get(i);
                if (!forbs[Integer.parseInt(k)] && combs[Integer.parseInt(k)] == -1) {
                    combs[Integer.parseInt(k)] = combs[Integer.parseInt(r)]+1;
                    q.add(k);
                }
            } 
        }
        return -1;
    }
    private static List upDownCount(String s){
        List<String> ll = new ArrayList<>();
        int l = s.length();
        for(int i=0;i<l;i++){
            int x = Integer.parseInt(""+s.charAt(i));
            int x1 = (x+1)%10, x2 = (x-1)%10; if(x2 == -1){x2 = 9;} String s1 = s.substring(0,i)+ x1 + s.substring(i+1, l), s2 = s.substring(0, i) + x2 + s.substring(i+1,l); ll.add(s1); ll.add(s2);
        }
        // int a = Integer.parseInt(""+s.charAt(0)), b = Integer.parseInt(""+s.charAt(1)), c = Integer.parseInt(""+s.charAt(2)), d = Integer.parseInt(""+s.charAt(3));
        // int a1 = (a+1)%10, a2 = (a-1)%10; if(a2 == -1){a2 = 9;} String s1 = a1 + s.substring(1, l), s2 = a2 + s.substring(1,l); ll.add(s1); ll.add(s2);
        // int b1 = (b+1)%10, b2 = (b-1)%10; if(b2 == -1){b2 = 9;} s1 = s.substring(0, 1)+ b1 + s.substring(2, l); s2 = s.substring(0, 1)+ b2 + s.substring(2, l); ll.add(s1); ll.add(s2);
        // int c1 = (c+1)%10, c2 = (c-1)%10; if(c2 == -1){c2 = 9;} s1 = s.substring(0, 2)+ c1 + s.substring(3, l); s2 = s.substring(0, 2)+ c2 + s.substring(3, l); ll.add(s1); ll.add(s2);
        // int d1 = (d+1)%10, d2 = (d-1)%10; if(d2 == -1){d2 = 9;} s1 = s.substring(0, 3)+ d1; s2 = s.substring(0, 3)+ d2; ll.add(s1); ll.add(s2);
        return ll;
    }
}
