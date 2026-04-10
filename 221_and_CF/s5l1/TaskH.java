package s5l1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class TaskH {
    public static void main(String[] args) throws Exception{
        BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out,true);
        String arr []  = new String[Integer.parseInt(bf.readLine())];
        for(int i=0;i<arr.length;i++){
            arr[i] = bf.readLine();
        }
        Arrays.sort(arr,(s1,s2) -> StringComp(s1, s2));
        for(int k=0;k<arr.length;k++){
            pw.println(arr[k]);
        }
    }
    public static int StringComp(String s1, String s2){
        String train1 = s1.substring(0,s1.indexOf(' '));
        String train2 = s2.substring(0,s2.indexOf(' '));
        String time1 = s1.substring(s1.length()-5);
        String time2 = s2.substring(s2.length()-5);

        for(int i = 0;i<Math.min(train1.length(),train2.length());i++){
            if (train1.charAt(i)  !=  train2.charAt(i)) {
                return charVal(train1.charAt(i)) - charVal(train2.charAt(i));
            }
        }
        if (train1.length()  !=  train2.length()) {
            return train1.length()-train2.length();
        }
        return time2.compareTo(time1);
    }
    public static int charVal(char c){
        if(c>='a' && c<='z'){return c-'a';}
        return c-'A'+26;
    }
}
