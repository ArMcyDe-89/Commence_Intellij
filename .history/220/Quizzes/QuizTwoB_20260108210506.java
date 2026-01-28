public class QuizTwoB {
    public Integer faulty(BTNode root, Integer D){
        if(root == null){ return  0;}
        if(root.left == null && root.right == null){return 0;}
        if(root.left == null || root.right == null){return  faulty(root.left, D) + faulty(root.right, D)}

    }
    class BTNode {
        Object elem;
        BTNode left, right;

        public BTNode(Object elem) {
            this.elem = elem;
        }
    }
}
