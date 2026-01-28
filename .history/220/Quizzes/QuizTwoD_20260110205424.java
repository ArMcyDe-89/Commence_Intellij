public class QuizTwoD {
    static int findClosest(BSTNode root, int K){
        if(root == null){return 0;}
        int close = Math.abs(K-root.elem), l = findClosest(root.left, K), r = findClosest(root.right, K);
        if(l<close){close = l;} if(r<close){ close = r;}
        return  close;
    }
    class BSTNode {
        Integer elem;
        BSTNode left, right;

        public BSTNode() {
        }
        

        public BSTNode(Integer elem) {
            this.elem = elem;
        }
    }
}
