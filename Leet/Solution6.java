import java.util.Arrays;

public class Solution6 {
    public String convert(String s, int numRows) {
        String arr [][] = new String [numRows][s.length()];
        int c =0,i=0,j=0;
        while(c<s.length()){
            if (i == 0) {
                while(i<numRows){System.out.println(i+"  "+j+"  "+c); arr[i++][j] = ""+s.charAt(c++);}
            }
            else{
                while(i>0){System.out.println(i+"  "+j+"  "+c); arr[--i][j++] = ""+s.charAt(c++);}
            }
        }
        System.out.println(Arrays.deepToString(arr));
        String R = "";
        for(int k=0;k<numRows;k++){
            for(int l =0;l<arr[k].length;l++){
                R+=arr[k][l];
            }
        }
        return R;
    }
    public void main(String[] args) {
        String S = convert ("PAYPALISHIRING",3);
        System.out.println(S);
    }
}
