
import java.io.*;
import java.util.*;

public class TaskH {
    public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static void main(String[] args) throws Exception{
        List <Integer> [] graph = new ArrayList [26]; for(int i=0;i<26;i++){graph[i] = new ArrayList<>();}
        PriorityQueue <Integer> q = new PriorityQueue<>();
        boolean [] lets = new boolean[26];
        int N = Integer.parseInt(bf.readLine()); String words [] = new String[N];
        int inD [] = new int[26];
        for(int i=0;i<N;i++){
            words[i] = bf.readLine();
        }
        for(int i=0;i<N;i++){
            String s = words[i];
            for(int j=0;j<s.length();j++){
                lets[s.charAt(j) -'a'] = true;
            }
        }
        for(int i=0;i<N-1;i++){
            String s1 = words[i], s2 = words [i+1];
            int min = Math.min(s1.length(), s2.length());
            boolean found = false;
            for(int j=0;j<min;j++){
                if (s1.charAt(j) != s2.charAt(j)) {
                    graph[s1.charAt(j) - 'a'].add(s2.charAt(j) - 'a'); inD[s2.charAt(j) - 'a']++;
                    found = true; break;
                }
            }
            if(!found && s1.length()>s2.length()){pw.println(-1);pw.flush();return;}
        }
        for(int j=0;j<26;j++){
            if(lets[j] && inD[j] == 0){q.add(j);}
        }
        StringBuilder sb = new StringBuilder(); 
        while(!q.isEmpty()){
            int v = q.remove(); sb.append((char)(v+'a'));
            for(int j=0;j<graph[v].size();j++){
                inD[graph[v].get(j)]--;
                if(inD[graph[v].get(j)] == 0){q.add(graph[v].get(j));}
            }
        }
        int count = 0;
        for(int k=0;k<26;k++){if(lets[k]){count++;}}
        if(sb.length() == count){pw.println(sb.toString());}else{pw.println(-1);}pw.flush();

    }
}
