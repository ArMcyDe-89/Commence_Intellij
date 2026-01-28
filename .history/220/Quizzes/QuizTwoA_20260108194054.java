public class QuizTwoA {
    public Integer maxTreasurePath(BTNode root){
        if(root == null){return null;}
        String max = ""+root.elem+maxTreasurePath(root.left);
        String max = ""+root.elem+maxTreasurePath(root.left);
    }
    class BTNode {
        Object elem;
        BTNode left, right;

        public BTNode(Object elem) {
            this.elem = elem;
        }
    }
}
