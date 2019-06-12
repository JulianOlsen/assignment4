package assignment4;
import java.util.Scanner;

public class assignment4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String word = scan.nextLine();
        int wordlenth = word.length();
        int x =0;
        while(x<=wordlenth)
        {
         System.out.println("Give me a "+word.charAt(x)+", "+word.charAt(x)+"!");   
          ++x;
          if(x==wordlenth){
              break;
          }
        }
        
        System.out.println("What does it spell?"); 
        System.out.println(word.toUpperCase());
        
        //---------
        System.out.println(""); 
         System.out.println("Line:"); 
        String backwords = scan.nextLine();
        char[] bw1 = backwords.toCharArray();
        for (int i = bw1.length-1; i>=0; i--)
            System.out.print(bw1[i]);
        // link: https://www.geeksforgeeks.org/reverse-a-string-in-java/ number3.
        System.out.println(" ");   
        //-----------
        
        System.out.println("endcoder"); 
        String spy = scan.nextLine();
        int y =0;
        int spylenth= spy.length();
        while(y<=spylenth)
        {
         System.out.print(spy.charAt(y)+" ");   
           y =y+3;
          if(y>=spylenth){
              System.out.println(" ");   
              break;
          }
        }
        
        
        //----------
    
        System.out.println("What is my favourite food? 3 tries left"); 
        System.out.print("guess?; ");
        String guess = scan.nextLine();
        if (guess.contains("electricity")){
            System.out.println("You guessed it! Buzzzz");  
        }
        else{
            System.out.println("Not even close. 2 tries left");
            System.out.print("guess?; ");
            guess = scan.nextLine();
            if(guess.contains("electricity")){
            System.out.println("You guessed it! Buzzzz");  
            }
            else{
                System.out.println("Not even close. 1 tries left");
                System.out.print("guess?; ");
                guess = scan.nextLine();
                if(guess.contains("electricity")){
                System.out.println("You guessed it! Buzzzz");  
                }
                else{
                    System.out.println("Oops! No more tries! ");
                }
            }
        }
        
    }
}