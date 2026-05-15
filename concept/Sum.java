import java.util.Scanner;

public class Sum {
  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    // System.out.println("Enter your first number: ");
    // int num1= sc.nextInt();
    //   System.out.println("Enter your second number: ");
    //   int num2 = sc.nextInt();
    //   int sum = num1 + num2;
    //   System.out.println("The Sum of this two numbers is : " + sum);
  
     System.out.println("Enter your first number: ");
     float num1= sc.nextInt();
     System.out.println("Enter your second number: ");
     float num2 = sc.nextInt();
     float sum = num1 + num2;
     System.out.println("The Sum of this two numbers is : " + sum);

  }
}

// In this program, we learned how can we take input from the user and perform addtion of two integers and floats as well. We used the scanner class to read the input from the user and then performed the addition operation and printed the result. We can also take input of other datatypes like double, long etc. using the appropriate methods of the Scanner class (e.g., nextDouble(), nextLong(), etc.).