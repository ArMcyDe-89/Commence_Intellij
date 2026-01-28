public class QuizThreeF {
    static void minValue(String s, int k){
        int cs [] = new int[26];
        for(int i =0;i<s.length();i++){
            cs[s.charAt(i) - 'a']++;
        }
        int max =-1,ind = -1;
        for(int i=0;i<cs.length;i++){
            if(cs[i]== max){
                if () {
                    
                }
            }
            if(cs[i]>max){max = cs[i]; ind = i;}
        }
        max-=k; cs[ind] = max; int sum=0;
        for(int i=0;i<cs.length;i++){sum+=Math.pow(cs[i], 2);}
        System.out.println(sum);
    }
    public static void main(String[] args) {
        System.out.println("--- Test Case 1 ---");
        String s1 = "abbccc";
        int k1 = 2;
        System.out.println("Input: s = \"" + s1 + "\", k = " + k1);
        System.out.print("Output: ");
        QuizThreeF.minValue(s1, k1);
        // Explanation of your logic: 
        // Counts: a=1, b=2, c=3. Max is 3. 
        // 3 - 2 = 1. New counts: 1, 2, 1. 
        // 1^2 + 2^2 + 1^2 = 1 + 4 + 1 = 6. (Matches Sample)

        System.out.println("\n--- Test Case 2 ---");
        String s2 = "aaab";
        int k2 = 2;
        System.out.println("Input: s = \"" + s2 + "\", k = " + k2);
        System.out.print("Output: ");
        QuizThreeF.minValue(s2, k2);
        // Explanation of your logic:
        // Counts: a=3, b=1. Max is 3.
        // 3 - 2 = 1. New counts: 1, 1.
        // 1^2 + 1^2 = 2. (Matches Sample)

        System.out.println("\n--- Test Case 3 (Edge Case) ---");
        // This case checks if your logic handles splitting k between two characters
        String s3 = "aabb"; 
        int k3 = 2;
        System.out.println("Input: s = \"" + s3 + "\", k = " + k3);
        System.out.print("Output: ");
        QuizThreeF.minValue(s3, k3);
        System.out.println("Expected (Optimal): 2"); 
        // Your logic will likely output 4 here (2^2 + 0^2) instead of 2 (1^2 + 1^2),
        // because your code subtracts k from only one single max value.
    }
}
