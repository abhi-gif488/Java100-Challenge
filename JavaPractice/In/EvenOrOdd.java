package In;

import java.util.Scanner;

public class EvenOrOdd {
  public static void main(String[] args) {
    System.out.println("Enter your Fav number: ");
    Scanner sc = new Scanner(System.in);
    int num= sc.nextInt();
   check(num);
   

}
    static void check(int num){
      
    if (num %2==0) {
      System.out.println("Your given number "+ num +" is Even");
      
    }else{
      System.out.println("Gand Marao");
    }
  }
}

