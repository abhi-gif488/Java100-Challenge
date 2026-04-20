import java.util.Scanner;

public class Fibonacci{
  public static void main(String[] args) {
    System.out.println("How to find fibonacci numbers? ");

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the fibonacci position number you want me to find: ");
    int n = sc.nextInt();
    
    int prev = 0;
    int after=1;
    
    for (int count = 2; count <=n; count++) {
        int temp= after;
        after += prev;
        prev= temp; 
      
    }
    System.out.println(after);

        }

}