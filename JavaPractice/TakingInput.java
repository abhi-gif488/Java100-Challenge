package JavaPractice;
import java.util.Scanner;

public class TakingInput {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name: ");
    System.out.println("Hello " + sc.nextLine());
  }}
  
  //here we learned about taking input from using Scanner class from the package java.util.Scanner. We created an object(using 'new') of the Scanner class and used the nextLine()(for printing strings) method to read a line of text from the user(System.in (input from the keyboard)). We then printed a greeting message that includes the our name.
  

 