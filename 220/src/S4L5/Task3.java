//LAB TASK NO NEED TO SUBMIT
// Complete the kthLevelPrint method
public class Task3{

        //===================================TASK#3===================================
        // This method takes 2 parameters, root and level
        // This method returns nothing
        // You can use extra helper private static methods as per need
        public static void kthLevelPrint( BTNode root, int lvl ){
            if(root==null){
                return;
            }
            if(lvl == 0){
                System.out.print(root.elem+" ");
            }
            else{
                kthLevelPrint(root.left, lvl-1); kthLevelPrint(root.right, lvl-1);
            }
            // int count = 0;
            // if (root==null) {
            //     return;
            // }
            // else if(lvl == count){
            //     System.out.print(root.elem+" ");
            // }
            // left(root.left, lvl, count+1); right(root.right, lvl, count+1);
        }
    private static void left(BTNode root, int lvl, int count) {
        if (root==null) {
            return;
        }
        if(count == lvl){
            System.out.print(root.elem+" ");
        }
        else{
            left(root.left, lvl, count+1); right(root.right, lvl, count+1); 
        }
    }
    private static void right(BTNode root, int lvl, int count) {
        if (root==null) {
            return;
        }
        if(count == lvl){
            System.out.print(root.elem+" ");
        }
        else{
            left(root.left, lvl, count+1); 
            right(root.right, lvl, count+1);  
        }
    }
            //TO DO
        
        //============================================================================
    private static int maxLevel(BTNode node) {
        if (node == null)
            return 0;

        return Math.max(maxLevel(node.left), maxLevel(node.right)) + 1;
    }
    private static int getlvl( BTNode root , BTNode find){
        int lvl = 0; BTNode R = root;
        if (root == null) {
            return lvl;
        }
        while (R.elem != find.elem) {
            lvl++;
        }

        return lvl;
    }

    private static int getDepth( BTNode root ){
        return getDepthHelper(root,0);
    }
    
    private static int getDepthHelper( BTNode root, int lvl ){
        if( root==null){
            return lvl;
        }
        int leftLvl = getDepthHelper(root.left, lvl+1);
        int rightLvl = getDepthHelper(root.right, lvl+1);
        
        return leftLvl>rightLvl ? leftLvl: rightLvl;
    }

}
