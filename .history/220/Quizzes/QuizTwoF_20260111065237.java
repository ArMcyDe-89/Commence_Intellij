public class QuizTwoF {
    static String find_equal_sum_path(BTNode root,int lvl, int Oddsum, int EvenSum, String line){
        if(root == null){return "";}
        if(lvl%2==0){EvenSum+=root.elem;line+=""+root.elem;}
        else{Oddsum+=root.elem;line+=""+root.elem;}
        if(root.left==null && root.right == null && EvenSum == Oddsum){
            return line;
        }
        else if(root.left==null && root.right == null && EvenSum != Oddsum){
            return "";
        }
        return find_equal_sum_path(root.left, lvl+1, Oddsum, EvenSum, line)+find_equal_sum_path(root.right, lvl+1, Oddsum, EvenSum, line);
        
    }
    static class BTNode {
        int elem;
        BTNode left, right;

        public BTNode(int elem) {
            this.elem = elem;
        }
    }
}
