import java.util.Scanner;

public class SwitchStatement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // System.out.print("Enter your fav fruit: ");
    // String fruit = sc.next();

    // switch (fruit) {
    //   case "mango":
    //     System.out.println("King of the Fruits");
        
    //     break;
    //   case "Bananna":
    //     System.out.println("A full energy pack fruit");
    //     break;

    //   case "Apple":
    //     System.out.println("A sweet red fruit");
    //     break;
      
    //   case "Orange":
    //     System.out.println("Round fruit");
    //     break;
    
    //   default:
    //     System.out.println(" Enter a valid fruit ");
    // }


System.out.print("Enter the Number of day: ");
int day = sc.nextInt();

switch (day) {

  case 1 -> System.out.println(" Monday");
  
  case 2 -> System.out.println(" Tuesday");
  
  case 3 -> System.out.println(" Wednesday");
  
  case 4 -> System.out.println(" Thusday");
  
  case 5 -> System.out.println(" Friday");
  
  case 6 -> {
     System.out.println(" Saturday");}
  
  case 7 -> 
  { System.out.println(" Sunday");
}
}


  }
  
}
