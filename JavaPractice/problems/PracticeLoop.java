package problems;
import java.util.Scanner;

public class PracticeLoop {
  public static void main(String[] args) {
    
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter 1st number: ");
    int num= sc.nextInt();
    System.out.print("Enter 2nd number: ");
    int num2= sc.nextInt();
    System.out.print("Enter 3rd number: ");   
    int num3= sc.nextInt();

    //Q- Find the largest of the three numbers?
//1st method
    // int max= num;
    // if(num2>max){
    //   max= num2;
    // }
    // else if(num3>max){
    //   max= num3;
    // }

    // else{
    // System.out.println("Khel khatam beta");
    // }
    // System.out.println("The largest numbers is: "+ max);

     //2nd method
/*
     int max=0;
     if(num2>num){
      max= num2;
     }
     else{
      max=num;
     }
     if(num3>max){
      num3=max;

     }

     System.out.println("LArgest number is : "+max);
 */
//3rd method

int max= Math.max(num, Math.max(num2, num3));

System.out.println(max);
  }
  
}
