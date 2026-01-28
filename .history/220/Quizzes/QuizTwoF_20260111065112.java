public class QuizTwoF {
    static String find_equal_sum_path(BTNode root,int lvl, int Oddsum, int EvenSum, String line){
        if(root == null){return "";}
        if(root.left==null && root.right == null && EvenSum == Oddsum){
            return line;
        }
        else if(root.left==null && root.right == null && EvenSum == Oddsum){
            return line;
        }
        if(lvl%2==0){EvenSum+=root.elem;line+=""+root.elem;}
        else{Oddsum+=root.elem;line+=""+root.elem;}

        
    }
    static class BTNode {
        int elem;
        BTNode left, right;

        public BTNode(int elem) {
            this.elem = elem;
        }
    }
}
