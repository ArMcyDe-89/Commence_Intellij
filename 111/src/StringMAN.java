import java.util.*;
public class StringMAN {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println("Original String: " + str);

        switch(str.charAt(0).equals("H")){

            case (true){
                System.out.println("Original String: " + str); break;
            }
            case(false){
                System.out.println("NOT Original String: " + str);
            }
        }
        
        // Convert to uppercase
        String upperStr = str.toUpperCase();
        System.out.println("Uppercase: " + upperStr);
        
        // Convert to lowercase
        String lowerStr = str.toLowerCase();
        System.out.println("Lowercase: " + lowerStr);
        
        // Replace characters
        String replacedStr = str.replace('o', '0');
        System.out.println("Replaced 'o' with '0': " + replacedStr);
        String rep = swap("mgvkwuor", "e", "i");
        System.out.println("Replaced 'o' with '0': " + rep);
       
        
        
        // Check if string contains a substring
        boolean containsWorld = str.contains("World");
        System.out.println("Contains 'World': " + containsWorld);
        
        // Split the string
        String[] words = str.split(", ");
        System.out.println("Split into words: ");
        for (String word : words) {
            System.out.println(word);
        }
        String em = "hello@World123@gmail@.@com";
        String[] emailParts = em.split("@");
        for(int i = 0; i < emailParts.length; i++) {
            System.out.println("Email part " + (i + 1) + ": " + emailParts[i]);

        }
        System.out.println("Email username: " + emailParts[0]); 
        StringBuilder ns = new StringBuilder();
        for(int i = em.length() -1;i>=0; i--){
            ns.append(em.charAt(i));
        }
        System.out.println("Reversed email: " + ns.toString());
        ns.setCharAt(ns.length()-1, 'H'); ns.setCharAt(ns.length()-1-4,'0');
        ns.insert(3, '@');
        ns.delete(0, 7);
        ns.deleteCharAt(ns.length()-1);
        System.out.println("Modified email: " + ns.toString());
        StringBuilder sb = new StringBuilder("nziosjbdfiubugfisbgyuibyvjhkb");
        StringBuilder b = sb.reverse();
        for(int i = 0; i<sb.length();i++){
            ns.append(b.charAt(i));
        }
        System.out.println(ns);
        String gh = sb.substring(6,19);
        System.out.println("Substring from index 6 to 11: " + gh);
        String revString = sb.reverse().toString();
        System.out.println("Reversed String: " + revString);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("How many bits to shift left?");
        int L_shift = sc.nextInt();
        System.out.println("Left Shift of " + num + " is: " + L_shift);
        if(){
            
        }

    }
    public static String swap(String s,String t, String c){
        String temp = "";
        for(int i = 0; i<s.length(); i++){
            if (String.valueOf(s.charAt(i)).equalsIgnoreCase(t)) {
            temp+=c; continue;
            } temp+=s.charAt(i);
        }
        return temp;
    }
    // public static String swapped(String s, String t){
    //     String res="";
    //     for(int i =0; i<this.length();i++){
    //         if(this.charAt(i).equalsIgnoreCase(s)){
    //             res+=t; continue;
    //         } res+=this.charAt(i);
    //     } return res;
    // }
}