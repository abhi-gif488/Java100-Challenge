package problems;

import java.util.Scanner;

public class Reverse {
  public static void main(String[] args) {
    System.out.print("Enter the numbers: ");
    Scanner sc = new Scanner(System.in);
    int num= sc.nextInt();
    System.out.println(" You have written " + num);

    int reverse= 0;
    while (num>0) {
      int rem= num%10;
      reverse=reverse*10+rem;
      num /=10;

    }
    System.out.println("So the reverse of number is : "+ reverse);

  }
  
}
