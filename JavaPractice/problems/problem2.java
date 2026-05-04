package problems;

import java.util.Scanner;

public class problem2 {
  public static void main(String[] args) {
    
    System.out.print(" enter a character: ");

    Scanner sc= new Scanner(System.in);

     char ch = sc.next().trim().charAt(0); 
    
    // sc.next() → takes input as a string
    // trim() → removes extra spaces
    // charAt(0) → extracts the first character from input
  
    System.out.println(ch);
    
    if(ch>='a' && ch<='z'){
       // Checks if character is between 'a' and 'z' (ASCII comparison)
      System.out.println("Lowercase");
    }

    else{
      System.out.println("Uppercase");
    }


  }
/* This Java program reads a single character from the user and determines whether it is lowercase or uppercase. It uses a `Scanner` to take input, trims any extra spaces, and extracts the first character entered. The program then checks if the character falls between `'a'` and `'z'` in ASCII values; if so, it prints “Lowercase”. Otherwise, it prints “Uppercase”. Finally, it also displays the entered character before showing the result.
 */
   
  
}
