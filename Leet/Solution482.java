class Solution482 {
    public String licenseKeyFormatting(String s, int k) {
        String N ="", n ="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ('-')){
                continue;
            }N+=s.charAt(i);
        }
        N=N.toUpperCase(); int count =0;
        for(int i = N.length()-1; i>=0;i--,count++){
            if(count == k){n+='-'; count = 0;}
            n+=N.charAt(i);
        } N=n;n="";
        for(int i=N.length()-1;i>=0;i--){n+=N.charAt(i);}
        return n;
    }
    public String licenseKeyFormattingV2(String s, int k) { // takes 150ms less time with slightly more space
        String N ="", n ="";
        for(int i = s.length()-1;i>=0;i--){
            if(s.charAt(i)=='-'){continue;}
            N+=s.charAt(i);
        } N= N.toUpperCase(); int count =0;
        for(int i=0;i<N.length();i++,count++){
            if(count == k){n='-'+n;count=0;}
            n = N.charAt(i)+n; 
        }
        return n;
    }
    public void main(String[] args) {
        String s = licenseKeyFormatting("2-5g-3-J",2);
        System.out.println(s);
    }
}