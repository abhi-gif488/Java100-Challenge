import java.util.ArrayList;
import java.util.Scanner;

public class InputArraylList {
  public static void main(String[] args) {
    System.out.println("Here we take input from the user to fill ArrayList");

    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();

    for (int i = 0; i < 5; i++) {
      list.add(sc.nextInt()); 
    }
     System.out.println(list);

  }
  
}
