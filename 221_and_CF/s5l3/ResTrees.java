import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class ResTrees { //TaskH
    public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static void main(String[] args) throws Exception{
        int size = Integer.parseInt(bf.readLine());
        int [] in = new int[size], post = new int[size];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i=0;i<size;i++){in[i]=Integer.parseInt(st.nextToken());}
        st = new StringTokenizer(bf.readLine());
        for(int i=0;i<size;i++){post[i]=Integer.parseInt(st.nextToken());}
        int [] indices = new int[size+1]; for(int i=0;i<size;i++){indices[in[i]] = i;}
        StringBuilder sb = new StringBuilder(size*2);
        findPre(0, size-1, 0, size-1, indices, post, sb);
        pw.println(sb);pw.flush();
    }
    private static void findPre(int instart, int inend, int poststart, int postend, int [] indices, int [] post, StringBuilder sb){
        if(instart > inend){return;}
        int root = post[postend], rootIn = indices[root], rightArr = inend-rootIn;
        sb.append(root).append(" ");
        findPre(instart, rootIn-1, poststart, postend-(rightArr+1), indices, post, sb);
        findPre(rootIn+1, inend, postend - rightArr, postend-1, indices, post, sb);
        // findPost(rootIn+1, inend, indices[root], postend-1, indices, post, sb); //this works as well
    }
}


// For Postorder:

// |----- Left -----|----- Right -----| Root |
// poststart                         postend

// This is the only thing you must remember.

// Step 1️⃣ Identify the root

// Postorder rule:

// root = post[postend]
// Step 2️⃣ Split inorder

// Inorder rule:

// Left | Root | Right

// Example:

// Inorder:
// 1 2 3 4 5
//   ^
//  root

// So:

// Left subtree size  = rootIn - instart
// Right subtree size = inend - rootIn
// Step 3️⃣ Place subtree sizes inside the postorder box

// Example:

// Postorder:

// | L | R R R | Root |
// 0             4

// Right subtree size = 3

// So the right subtree must occupy the 3 elements before root.

// | L | R R R | Root |
//       ^

// So:

// rightStart = postend - rightSize
// rightEnd   = postend - 1
// Step 4️⃣ Left subtree automatically fills the rest
// leftStart = poststart
// leftEnd   = rightStart - 1
// Final formulas

// Left subtree:

// poststart → postend - rightSize - 1

// Right subtree:

// postend - rightSize → postend - 1
// Visual Summary
// Postorder array

// |------ Left ------|--- Right ---| Root |
// poststart        postend-right   postend

// Where:

// rightSize = inend - rootIndex
// ⚡ Why this trick works

// Instead of memorizing formulas, you only remember:

// Postorder = Left + Right + Root

// Then you count backwards from the root.

// That automatically gives:

// rightStart = postend - rightSize
// 🚀 Extra Tip (very useful in exams)

// For tree reconstruction:

// Traversal	Root Position
// Preorder	first element
// Inorder	splits tree
// Postorder	last element

// So the typical workflow is:

// Root from Pre/Post
// Split using Inorder
// Compute subtree sizes
// Derive ranges