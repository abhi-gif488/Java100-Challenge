package problems;

import java.util.Scanner;

public class Swap {
  public static void main(String[] args) {

     // Main method → starting point of Java program
    // public → accessible from anywhere
    // static → no object needed to call it
    // void → does not return anything
    // String[] args → command line arguments
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first Number: ");
    int num1 = sc.nextInt();

    System.out.print("Enter second Number: ");
    int num2 = sc.nextInt();

    int[] swapped = Swapping (num1, num2);

    // Calls Swaping method and stores returned array in 'swapped'
    // swapped[0] = first value, swapped[1] = second value
    
    System.out.println("After swapping: " + swapped[0] + " " + swapped[1]);
  }

  static int[] Swapping(int a, int b){
    int temp = a;
    a = b;
    b = temp;

    //or simply write System.out.println("Swapped number is "+ a +"" + b)::

    return new int[]{a, b};
  }
}
