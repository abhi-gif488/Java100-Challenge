package problems;

import java.util.Scanner;

public class Swap {
  public static void main(String[] args) {

     // Main method → starting point of Java program
    // public → accessible from anywhere
    // static → no object needed to call it
    // void → does not return anything
    // String[] args → command line arguments..
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first Number: ");
    int num1 = sc.nextInt();

    System.out.print("Enter second Number: ");
    int num2 = sc.nextInt();

    int[] swapped = Swapping (num1, num2);

    // Calls Swaping method and stores returned array in 'swapped'
    // swapped[0] = first value, swapped[1] = second value
    
    System.out.println("After swapping: " + swapped[0] + " " + swapped[1]);
    // Prints swapped values using array indexing
  }

  static int[] Swapping(int a, int b){

     // Method declaration
    // static → can be called without object
    // int[] → returns an array of integers
    // Swaping → method name
    // int a, int b → parameters (inputs)
    
    int temp = a;
    a = b;
    b = temp;

   // Alternative: you could print directly instead of returning
    // System.out.println("Swapped number is " + a + " " + b);

    return new int[]{a, b}; 
    // Returns swapped values as an array
    // new int[]{a, b} → creates array with two elements
  }
}
