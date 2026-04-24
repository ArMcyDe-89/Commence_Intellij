public class S1L5 {
    //TASK_1

import java.util.Scanner;

public class lab05task01{
  
  public static void main(String [] args){
        
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Please enter a string type input : ");
    
    String input = sc.nextLine();
    
    String empty = "";
    
    for(int index = 0; index <= (input.length()-1); index++){
      
      char ch = input.charAt(index);
      
      if(ch>= 'a' && ch<='z'){
        
        ch = (char) (ch-32);
        
      }
      
      empty+=ch;
      
    }
    
    System.out.println(empty);
    
  }
}


//TASK_2


import          java.util.Scanner;

public class lab05task02{
  
  public static void main(String[]args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Please enter a word to check if it is a palindrome : ");
    
    String pali = sc.nextLine();
    
    String empty = "";
    
    for(int index = 0; index<= (pali.length()-1); index++){
      
      char ch = pali.charAt(index);
      
      empty = ch + empty;
      
    }
    
    if(pali.equals(empty)){
      
      System.out.println(pali.equals(empty));
      
    }
     
    else {
      
      System.out.println(pali.equals(empty));
      
    }
    
 }
}



//TASK_3


import          java.util.Scanner;

public class lab05task03{
  
  public static void main(String[]args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Please enter a string input : ");
    
    String input = sc.nextLine();
    
    System.out.println("Please enter the special character : ");
    
    char ch = sc.next().charAt(0);
    
    input+=ch;
    
    String empty = "";
    
    for(int index = 0 ; index<input.length(); index++){
      
      char letter = input.charAt(index);
      
      if(ch != letter){
        
        empty+=letter;
        
      }
      
      else{
        
        System.out.println(empty);
        
        empty = "";
        
      }
      
    }
    
  }
}



//TASK_4



import          java.util.Scanner;

public class lab05task03{
  
  public static void main(String[]args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Please enter a string input : ");
    
    String input = sc.nextLine();
    
    System.out.println("Please enter the special character : ");
    
    char ch = sc.next().charAt(0);
    
    input+=ch;
    
    String empty = "";
    
    for(int index = 0 ; index<input.length(); index++){
      
      char letter = input.charAt(index);
      
      if(ch != letter){
        
        empty+=letter;
        
      }
      
      else{
        
        System.out.println(empty);
        
        empty = "";
        
      }
      
    }
    
  }
}



//TASK_5


import java.util.Scanner;

public class lab05task05{
  
  public static void main(String [] args){
        
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Please enter the secret phrase Captain : ");
              
              String input = sc.nextLine();
              
              int vowel = 0;
              
              int consonant = 0;
              
              for(int index = 0 ; index<input.length(); index++){
                
                char letter = input.charAt(index);
                
                if((letter>=65 && letter<=90)||(letter>=97 && letter<=122)){
                  
                  if(letter =='a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U'){
                    
                    vowel++;
                    
                  }
                  
                  else{
                    
                    consonant++;
                    
                  }
                  
                }
              
             }
                
              if(vowel>0 && consonant >0 && vowel%3 == 0 && consonant %5 ==0){
                  
                  System.out.println("Aaarr! Me Plunder!!");
                  
                }
                
                else{
                  
                  System.out.println("Blimey! No Plunder!!");
                  
                }
    
  }
}



//TASK_6



import          java.util.Scanner;

public class lab05task06{
  
  public static void main(String[]args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Please enter a string input : ");
    
    String input = sc.nextLine();
    
    String temp = "";
    
    for(int index = (input.length()-1); index>=0; index--){
      
      char ch = input.charAt(index);
      
      temp = ch + temp;
      
      if (ch == ' '){
        
        for(int index2 = (temp.length()-1); index>=0 ; index2--){
          
          System.out.print(temp + " ");
          
          break;
          
        }
        temp = "";
      }      
    }
    
    System.out.println (temp);
 }
}




//TASK_7



import          java.util.Scanner;

public class lab05task07{
  
  public static void main(String[]args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Please enter a string input with lowercase letters : ");
    
    String input1 = sc.nextLine();
    
    System.out.println("Please enter another string input with lowercase letters : ");
    
    String input2 = sc.nextLine();
    
    String con = "";
    
    String cat = "";
    
    boolean flag1= false;
    
    for(int index1 = 0; index1<input1.length(); index1++){
      
      flag1 = false;
      
      char ch1 = input1.charAt(index1);
      
      for(int index2 = 0; index2<input2.length(); index2++){
        
        char ch2 = input2.charAt(index2);
        
        
        if (ch1 == ch2) {
          
          flag1 = true;
          
          break;
          
        }
      }
      
      if (flag1 == false) {
        
        con+=ch1;
        
      }
    }
    
    boolean flag2= false;
    
    for(int index2 = 0; index2<input2.length(); index2++){
      
      flag2 = false;
      
      char ch3 = input2.charAt(index2);
      
      for(int index1 = 0; index1<input1.length(); index1++){
        
        char ch4 = input1.charAt(index1);
        
        if (ch3 == ch4) {
          
          flag2 = true;
          
          break;
          
        }
      }
      
      if (flag2 == false) {
        
        cat+=ch3;
        
      }
    }
    
    System.out.println((con+cat).toUpperCase());
    
  }
}




//TASK_8



import          java.util.Scanner;

public class lab05task06{
  
  public static void main(String[]args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Please enter a string input : ");
    
    String input = sc.nextLine();
    
    String temp = "";
    
    for(int index = (input.length()-1); index>=0; index--){
      
      char ch = input.charAt(index);
      
      temp = ch + temp;
      
      if (ch == ' '){
        
        for(int index2 = (temp.length()-1); index>=0 ; index2--){
          
          System.out.print(temp + " ");
          
          break;
          
        }
        temp = "";
      }      
    }
    
    System.out.println (temp);
 }
}



//TASK_9



import java.util.Scanner;

public class lab05task09{
  
  public static void main(String [] args){
        
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Please enter your password : ");
    
    String pass = sc.nextLine();
    
    int uppercase = 0;
    
    int lowercase = 0;
    
    int digits = 0;
    
    int sp = 0;
    
    if(pass.length()>=8){
        
    for(int index = 0; index < pass.length(); index++){
      
      char ch = pass.charAt(index);
      
      if (ch <= 'Z' && ch>= 'A'){
        
        uppercase++;
        
      }
      
      if(ch <= 'z' && ch>= 'a'){
        
        lowercase++;
        
      }
      
      if(ch >='0' && ch <= '9'){
        
        digits++;
        
      }
      
      if ( !( (ch >='0' && ch <= '9') || (ch <= 'z' && ch>= 'a') || (ch <= 'Z' && ch>= 'A') ) ){
        
        sp++;
        
      }      
    }
   }
    
     if(uppercase>0 && lowercase>0 && digits > 0 && sp > 0){
        
        System.out.println("True");
        
      }
    
    else{
      
      System.out.println("False");
      
    }
    
  }
}
}
