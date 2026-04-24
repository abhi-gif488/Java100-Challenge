package problems;

import java.util.Scanner;

public class Reverse {
  public static void main(String[] args) {
    System.out.print("Enter the numbers: ");
    Scanner sc = new Scanner(System.in);
    int num= sc.nextInt();
    System.out.println(" You have written " + num);

    int reverse= 0;
    while (num>0) {  //loop will run until num is greater than 0
      int rem= num%10; // it will help to find the last digit as an remainder 
      reverse=reverse*10+rem; //this will help to find the reverse of the given number at the last step
      num /=10; //this line will remove the last digit of the number

    }
    System.out.println("So the reverse of number is : "+ reverse);

  }
  
}
