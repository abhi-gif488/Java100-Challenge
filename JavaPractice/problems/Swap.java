package problems;

import java.util.Scanner;

public class Swap {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first Number: ");
    int num1 = sc.nextInt();

    System.out.print("Enter second Number: ");
    int num2 = sc.nextInt();

    int[] swapped = Swaping(num1, num2);

    System.out.println("After swapping: " + swapped[0] + " " + swapped[1]);
  }

  static int[] Swaping(int a, int b){
    int temp = a;
    a = b;
    b = temp;

    //or simply write System.out.println("Swapped number is "+ a +"" + b)

    return new int[]{a, b};
  }
}