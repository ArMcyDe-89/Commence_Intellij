// THIS CLASS IS FOR PRINTING THE BINARY TREE ONLY
// source: https://stackoverflow.com/questions/4965335/how-to-print-binary-tree-diagram-in-java
// This is a slightly modified version of the source to accomodate the lab tasks
// !!!!!!! DO NOT TOUCH THIS FILE AT ALL !!!!!!!
public class QuizTwoB {
    public Integer faulty(BTNode root, Integer D){
        if(root == null){ return  0;}
        if(root.left == null && root.right == null){return 0;}
        int count =0;
        if((root.left!=null && (Math.abs((int)root.elem - (int)root.left.elem)>D)) || (root.right!=null && (Math.abs((int)root.elem - (int)root.right.elem)>D))){
            count++;
        }
        //if(root.left == null || root.right == null){return  count +faulty(root.left, D) + faulty(root.right, D);}
        return  count +faulty(root.left, D) + faulty(root.right, D);

    }
    class BTNode {
        Object elem;
        BTNode left, right;

        public BTNode(Object elem) {
            this.elem = elem;
        }
    }
    
}
 