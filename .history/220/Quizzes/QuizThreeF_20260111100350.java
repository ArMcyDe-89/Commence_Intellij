public class QuizThreeF {
    static minValue(String s, int k){
        Integer cs [] = new Integer[26];
        for(int i =0;i<s.length();i++){
            cs[s.charAt(i) - 'a']++;
        }
        int max =-1,ind = -1;
        for(int i=0;i<cs.length;i++){
            if(cs[i]>max){max = cs[i]; ind = i;}
        }
        max-=k; cs[ind] = max; int sum=0;
        for(int i=0;i<cs.length;i++){sum+=Math.pow(cs[i], i)}
    }
}
