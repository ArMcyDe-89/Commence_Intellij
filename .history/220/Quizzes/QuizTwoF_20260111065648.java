public class QuizTwoF {
    static String find_equal_sum_path(BTNode root,int lvl, int Oddsum, int EvenSum, String line){
        if(root == null){return "";}
        if(lvl%2==0){EvenSum+=root.elem;line+=""+root.elem;}
        else{Oddsum+=root.elem;line+=""+root.elem;}
        if(root.left==null && root.right == null && EvenSum == Oddsum){
            return line;
        }
        else if(root.left==null && root.right == null && EvenSum != Oddsum){
            return "";
        }
        return find_equal_sum_path(root.left, lvl+1, Oddsum, EvenSum, line)+find_equal_sum_path(root.right, lvl+1, Oddsum, EvenSum, line);
        
    }
    static class BTNode {
        int elem;
        BTNode left, right;

        public BTNode(int elem) {
            this.elem = elem;
        }
    }

    // --- Driver Code ---
    public static void main(String[] args) {
        // Constructing a Sample Maze (Tree)
        // Level 0:        10 (Even Sum: 10)
        //               /    \
        // Level 1:     15     5  (Odd Sums...)
        //             /  \     \
        // Level 2:   5    3     7
        
        // Path A: 10 -> 15 -> 5
        //   Level 0 (10) -> Even=10
        //   Level 1 (15) -> Odd=15
        //   Level 2 (5)  -> Even=10+5=15
        //   Result: Even(15) == Odd(15). This path should be returned.

        BTNode root = new BTNode(10);
        
        // Left Subtree
        root.left = new BTNode(15);
        root.left.left = new BTNode(5);  // Target Node
        root.left.right = new BTNode(3);
        
        // Right Subtree
        root.right = new BTNode(5);
        root.right.right = new BTNode(7);

        System.out.println("Maze Structure Created.");
        System.out.println("Looking for path where Sum(Even Levels) == Sum(Odd Levels)...");

        // Execute Function
        String result = find_equal_sum_path(root,0,0,0,"");

        // Display Result
        if (result.length() > 0) {
            System.out.println("Path Found: " + result);
        } else {
            System.out.println("No such path exists.");
        }
        
        // Verification for the example:
        // Path: 10 -> 15 -> 5
        // Even Levels (0, 2): 10 + 5 = 15
        // Odd Levels (1): 15
        // 15 == 15 -> True
    }
}
