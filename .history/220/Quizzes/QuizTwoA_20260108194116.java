public class QuizTwoA {
    public Integer maxTreasurePath(BTNode root){
        if(root == null){return null;}
        String maxL = ""+root.elem+maxTreasurePath(root.left);
        String maxR = ""+root.elem+maxTreasurePath(root.right);
        if()
    }
    class BTNode {
        Object elem;
        BTNode left, right;

        public BTNode(Object elem) {
            this.elem = elem;
        }
    }
}
