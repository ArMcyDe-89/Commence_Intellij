package s5l1;

import java.io.*;
import java.util.*;

public class TaskA {
        public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr = new PrintWriter(System.out,true);
        int T = Integer.parseInt(bf.readLine());
        for(int i =0; i<T;i++){
            int n = Integer.parseInt(bf.readLine());
            String r = "";
            if(n%2 == 0){r="Even";}else{r="Odd";}
            pr.printf("%d is an %s number.\n",n,r);
        }

        //Resource and Time heavy Method
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        for(int i = 0;i<t;i++){
            int g = sc.nextInt();
            if (g%2 == 0) {
                System.out.println(g+" is an Even number."); continue;
            } System.out.println(g+" is an Odd number.");
        }
    }
}
