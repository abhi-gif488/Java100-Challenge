import java.util.Scanner;

public class WhileLoop {
  public static void main(String[] args) {
    
     /*
   While Loops
  basic syntax: 

  1st-     initialition 
       
  2nd-     while(condition){

  3rd-     executions

  4th-     increment/decrement
  }
  */

  Scanner sc= new Scanner(System.in);
  System.out.print("Enter your number: ");
    int n = sc.nextInt();

    int num = 1;

    while (num<=n) {
      System.out.println(num);
      // System.err.println();
      num++;
      
    }
  }
 
/* Q. How do we know when we need to use the while loop or for loop
You are confused right that which loop we can use in which time 
   you can freely use any of this loop anytime you want- this both works same.

   their is One suggestion for you-
   -when you don't know how many times your loop is going to run (n times)- use while loop.
   -when you know how many times your loop is going to run (limited times)- use for loop.
  */
  
}
