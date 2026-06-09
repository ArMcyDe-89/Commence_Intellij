
import java.io.*;
import java.util.*;

public class TaskG{
    public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static String  [] words;
    public static List <Integer> [] alph = new ArrayList[26];
    public static void main(String[] args) throws Exception{
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken()); String start = st.nextToken(), end = st.nextToken();
        words = new String[N];for(int i=0;i<26;i++){alph[i] = new ArrayList<>();}
        int A = -1, B = -1;
        for(int i=0;i<N;i++){
            String s = bf.readLine();
            if(s.equals(start)){A = i;}
            if(s.equals(end)){B = i;}
            alph[s.charAt(0) - 'A'].add(i);
            words[i] = s;
        }
        pw.println(findWord(A, B)); pw.flush();
    }
    private static String findWord(int A, int B){
        if(A == -1 || B == -1){return "NO";}
        if(A == B){return "YES";}
        Queue <Integer> q = new ArrayDeque<>();
        boolean vis [] = new boolean[words.length], used []  = new boolean[26];
        q.add(A); vis[A] = true;
        while(!q.isEmpty()){
            int v = q.remove(); if(v == B){return "YES";}
            int last = words[v].charAt(words[v].length()-1) - 'A';
            if(!used[last]){
                used[last] = true;
                for(int i=0;i<alph[last].size();i++){
                    int t = alph[last].get(i);
                    if (!vis[t]) {
                        vis[t] = true; q.add(t);
                    }
                }
            }
        }
        return "NO";
    } 
}