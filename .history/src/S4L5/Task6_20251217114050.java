// Complete the levelSum method
//ASSIGNMENT TASK MUST SUBMIT
public class Task6 {

    //===================================TASK#6===================================
    // This method takes only 1 parameter which is root of the given tree
    // This method returns an Integer
    // At times you may need to typeCast root.elem to Integer
    // You can use extra helper private static methods with extra extra params as per need
    public static Integer levelSum( BTNode root ){
        int sum = 0;
        if(root == null){
            return 0;
        }
        else{
            
            if(getDepth(root)%2 == 0){
                sum = sub(root);
            }
            else{ sum = add(root);}
        }
        return sum;
        //TO DO
    }
    private static int add(BTNode root){
        if (root == null) {
            return 0;
        }
        else{
            return (int)root.elem + sub(root.left)+sub(root.right);
        }
    }
    private static int sub(BTNode root){
        if (root == null) {
            return 0;
        }
        else{
            return -(int)root.elem + add(root.left)+add(root.right);
        }
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
