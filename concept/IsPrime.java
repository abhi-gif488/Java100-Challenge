import java.util.Scanner;

public class IsPrime {
  public static void main(String[] args) {
    System.out.print("Give a number: ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    boolean result = prime(num);
    System.out.println(result);;

  }
  static boolean prime(int num){
   
    if (num<=1) {
      return false;
    }
   int c= 2;

   while (c*c<=num) {
    if(num%c == 0){
    return false;
   }
   c++;
  }

  return c*c>num;

    
  //  if (c*c >num) {
  //   return true;
    //  }return false;
   }


    }

  

