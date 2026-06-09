package s5l1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class TaskG {
    public static void main(String[] args) throws Exception{
        BufferedReader bf  = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int n = Integer.parseInt(bf.readLine());
        for(int x = 0;x<n;x++){
            int ID []  = new int[Integer.parseInt(bf.readLine())], marks[]= new int[ID.length] ;
            StringTokenizer st1 = new StringTokenizer(bf.readLine()),st2 = new StringTokenizer(bf.readLine());
            for(int i=0;i<ID.length;i++){ID[i] = Integer.parseInt(st1.nextToken());marks[i]= Integer.parseInt(st2.nextToken());}
            int swaps = 0;
            for(int i=0;i<marks.length-1;i++){
                boolean b =false; int max = i;
                for(int j=i+1;j<marks.length;j++){
                    if (marks[j]>marks[max]) {
                        max = j; b = true;
                    }
                    else if(marks[j] == marks[max] && ID[j]<ID[max]){
                        max = j; b = true;
                    }
                }
                if(b){int sw = marks[i]; marks[i] = marks[max]; marks[max] = sw; sw = ID[i]; ID[i] = ID[max]; ID[max] = sw; swaps++;}
            }
            pw.println("Minimum swaps: "+swaps);
            for(int k=0;k<ID.length;k++){
                pw.printf("ID: %d Mark: %d\n",ID[k],marks[k]);
            }
        }pw.flush();
    }
}
