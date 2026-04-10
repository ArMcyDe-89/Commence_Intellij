import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringBufferInputStream;
import java.util.StringTokenizer;

public class Trees220 { //TaskG
    public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static void main(String[] args) throws Exception{
        int size = Integer.parseInt(bf.readLine());
        int [] in = new int[size], pre = new int[size];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i=0;i<size;i++){in[i]=Integer.parseInt(st.nextToken());}
        st = new StringTokenizer(bf.readLine());
        for(int i=0;i<size;i++){pre[i]=Integer.parseInt(st.nextToken());}
        int [] indices = new int[size+1]; for(int i=0;i<size;i++){indices[in[i]] = i;}
        StringBuilder sb = new StringBuilder(size*2);
        findPost(0, size-1, 0, size-1, pre, indices, sb);
        pw.println(sb);pw.flush();
    }
    private static void findPost(int instart, int inend, int prestart, int preend, int[] pre, int[] indices, StringBuilder sb){
        if(instart>inend){return;}
        int root = pre[prestart],rootIn = indices[root],leftArr = rootIn-instart;
        findPost(instart, rootIn-1, prestart+1, prestart+leftArr, pre, indices, sb);
        findPost(rootIn+1, inend, prestart+leftArr+1, preend, pre, indices, sb);
        sb.append(root).append(" ");
    }
}



//GPT vers.
// static int postIndex;

// static void buildPre(int inStart, int inEnd,
//                      int[] inorder, int[] post,
//                      int[] index,
//                      StringBuilder sb) {

//     if (inStart > inEnd) return;

//     int root = post[postIndex--];
//     sb.append(root).append(" ");

//     int rootPos = index[root];

//     // Build right subtree first
//     buildPre(rootPos + 1, inEnd, inorder, post, index, sb);

//     // Then build left subtree
//     buildPre(inStart, rootPos - 1, inorder, post, index, sb);
// }

//Calling it inside main
// int n = inorder.length;

// int[] index = new int[n + 1];
// for (int i = 0; i < n; i++) {
//     index[inorder[i]] = i;
// }

// postIndex = n - 1;

// StringBuilder sb = new StringBuilder();

// buildPre(0, n - 1, inorder, postorder, index, sb);

// System.out.println(sb.toString());