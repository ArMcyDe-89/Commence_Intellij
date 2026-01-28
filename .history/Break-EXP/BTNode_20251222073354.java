//DO NOT MAKE ANY CHANGES HERE
class BTNode {
    Object elem;
    BTNode left, right;

    public BTNode(Object elem) {
        this.elem = elem;
    }
    public static String findPath( BTNode root, Integer key ){
        if (root == null) {
            return "No Path Found";
        }
        if (root.elem == key) {
            return ""+root.elem;
        }
        else if((int)root.elem > key){
            String R = findPath(root.left, key);
            if(R.equalsIgnoreCase("No Path Found")){return R;}
            return root.elem+" "+R;
        }
        else{
            String R = findPath(root.right, key);
            if(R.equalsIgnoreCase("No Path Found")){return R;}
            return root.elem+" "+R;
        }
        // TO DO
        //remove this line
    }
    public static int findDepth(BTNode root, int find, int level) {
        if (root == null) {
            return 0;
        }
        if ((int)root.elem == find) {
            return level;
        }
        return findDepth(root.left, find, level+1) + findDepth(root.right, find, level+1);
    }
    public static void main(BTNode) {
        
    }
}