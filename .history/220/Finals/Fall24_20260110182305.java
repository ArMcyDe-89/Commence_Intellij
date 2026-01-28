public class Fall24 {
    static String build_key(BTNode root){
        return keyHelp(root,0);
    }
    static String keyHelp(BTNode root, int lvl){

    }
    static class BTNode {
        int elem;
        BTNode left, right;

        public BTNode(int elem) {
            this.elem = elem;
        }
    }
}
