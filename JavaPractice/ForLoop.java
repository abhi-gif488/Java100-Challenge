import java.util.Scanner;

public class ForLoop {
  public static void main(String[] args) {
    /* syntx for for loop
       
    for (initialization; condition; increment/decrement){
      // code to be executed
    }
    */
  //  for(int sum=1; sum<=5; sum++){
  //     System.out.println(sum + "-Hey ABhishek");

  //  } 
   //this is the basic syntax we use in for looping which is totally based on this format-   for (initialization; condition; increment/decrement){
      // code to be executed

      Scanner sc = new Scanner(System.in);
      System.out.print("give me a number: ");
      int n = sc.nextInt();
      for (int i = 1; i <= n; i++) {
        System.out.println(i + "-Doraemon");
        
      }


       }
    //lets take an example where we take input from the user and whatever they give value the loop will run that much time. Just a example : user give - 15 then the loop will run and execute smaller or equal to the given number according to condition.
    
  }
  

