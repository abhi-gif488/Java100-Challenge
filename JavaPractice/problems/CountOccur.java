package problems;

import java.util.Scanner;

public class CountOccur {
  public static void main(String[] args) {
    System.out.println("enter the number: ");
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();//It takes a number input from the user

    int x = sc.nextInt();//It takes the digit that we want to count

   
     int count= 0;
    while (num>0) {  //It runs the loop until all digits of the number are checked.
      
      int rem = num%10;

      if(rem==x){    //It checks if the last digit matches the given digit.
        count++;
      }
    
      num=num/10; //It removes the last digit of the number after checking it.

    }
      System.out.println(count);

    


  }
  
}
