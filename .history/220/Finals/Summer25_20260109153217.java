public class Summer25 {
    public static String findPath(BTNode root, int [] seq){
        return helper(root, seq,0);
    }
    public static String helper(BTNode root, int []seq, int i){
        if(root.left == null && root.right == null && (int)root.elem == seq[i]){ return "ESCAPED";}
        if((int)root.left.elem == seq[i+1]){ return helper(root.left, seq,++i);}
        if((int)root.left.elem == seq[i+1]){ return helper(root.right, seq,++i);}
    }
    class BTNode {
        Object elem;
        BTNode left, right;

        public BTNode(Object elem) {
            this.elem = elem;
        }
    }
}
