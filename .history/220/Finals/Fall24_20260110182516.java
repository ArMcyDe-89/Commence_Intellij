public class Fall24 {
    static String build_key(BTNode root){
        return keyHelp(root,0);
    }
    static String keyHelp(BTNode root, int lvl){
        if(root == null){return "";}
        if((lvl%2==0)&&root.left==null && root.right == null){return root.elem;}
        return keyHelp(root.left, lvl+1) + 
    }
    static class BTNode {
        String elem;
        BTNode left, right;

        public BTNode(String elem) {
            this.elem = elem;
        }
    }
}
