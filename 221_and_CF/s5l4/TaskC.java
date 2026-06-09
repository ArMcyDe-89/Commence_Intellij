import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class TaskC {
    public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static void main(String[] args) throws Exception{
        int n = Integer.parseInt(bf.readLine());
        int [][] A = new int[n][n];
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(bf.readLine().trim());
            int j = Integer.parseInt(st.nextToken());
            while(st.hasMoreTokens()){
                A[i][Integer.parseInt(st.nextToken())] = 1;
            }
        }
        for(int i =0;i<A.length;i++){
            for(int j =0;j<A[i].length;j++){
                pw.print(A[i][j]+" ");
            }pw.println();
        }
        pw.flush();
    }
}


// import java.io.BufferedInputStream;
// import java.io.IOException;
// import java.io.PrintWriter;

// public class TaskC {
//     private static final FastScanner fs = new FastScanner();
//     private static final PrintWriter pw = new PrintWriter(System.out);

//     public static void main(String[] args) throws Exception {
//         int n = fs.nextInt();
//         if (n <= 0) {
//             return;
//         }
//         int[][] A = new int[n][n];

//         // Expected format (common for adjacency list to matrix):
//         // for each vertex i (1..n): first integer is k = number of neighbors,
//         // followed by k neighbor indices (1-based). Adjust below if your format differs.
//         for (int i = 0; i < n; i++) {
//             int k = fs.nextInt();
//             for (int t = 0; t < k; t++) {
//                 int v = fs.nextInt();
//                 if (v >= 1 && v <= n) {
//                     A[i][v - 1] = 1;
//                 }
//             }
//         }

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 pw.print(A[i][j]);
//                 if (j + 1 < n) pw.print(' ');
//             }
//             pw.println();
//         }
//         pw.flush();
//     }

//     private static class FastScanner {
//         private final BufferedInputStream in = new BufferedInputStream(System.in);
//         private final byte[] buffer = new byte[1 << 16];
//         private int ptr = 0, len = 0;

//         private int read() throws IOException {
//             if (ptr >= len) {
//                 len = in.read(buffer);
//                 ptr = 0;
//                 if (len <= 0) return -1;
//             }
//             return buffer[ptr++];
//         }

//         int nextInt() throws IOException {
//             int c;
//             do {
//                 c = read();
//             } while (c <= ' ' && c != -1);
//             if (c == -1) return Integer.MIN_VALUE;
//             int sign = 1;
//             if (c == '-') {
//                 sign = -1;
//                 c = read();
//             }
//             int val = 0;
//             while (c > ' ') {
//                 val = val * 10 + (c - '0');
//                 c = read();
//             }
//             return val * sign;
//         }
//     }
// }
