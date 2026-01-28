public class QuizTwoA {
    public Integer maxTreasurePath(BTNode root){
        if(root == null){return null;}
        String maxL = ""+root.elem+maxTreasurePath(root.left);
        String maxR = ""+root.elem+maxTreasurePath(root.right);
        if(Integer.parseInt(maxR)>Integer.parseInt(maxL)){ return  Integer.parseInt(maxR);} return Integer.parseInt(maxL);
    }
    class BTNode {
        Object elem;
        BTNode left, right;

        public BTNode(Object elem) {
            this.elem = elem;
        }
    }
    public void main(String[] args) {
        BTNode root = new BTNode(8); root.left = new BTNode(3): root.right = new BTNode(9); root.left.left = new BTNode(1)
        BTPrinter.printNode(root);
    }
}
