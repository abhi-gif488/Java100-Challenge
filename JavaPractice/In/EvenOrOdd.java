package In;

import java.util.Scanner;

public class EvenOrOdd {
  public static void main(String[] args) {
    System.out.println("Enter your Fav number: ");

    Scanner sc = new Scanner(System.in);//scanner object
    int num= sc.nextInt();//user input

   check(num);//calling method
   

}
    static void check(int num){//method to check whether given num is even or odd
      
    if (num %2==0) {//condition to check
      System.out.println("Your given number "+ num +" is Even");
      
    }else{
      System.out.println("Gand Marao");
    }
  }
}

