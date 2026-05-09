import java.util.Arrays;
import java.util.Scanner;

public class StringArray {
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
    String[] strr = new String[3];
    System.out.print("enter 3 elements: ");
    strr[0] = "abhi";
    strr[1] = "rakhi";
    strr[2] = "tiger";
    // System.out.println(strr[2]); //this is my first method to get String..
   
    // for (int i = 0; i < strr.length; i++) {
    //   strr[i]= sc.next(); 
    // }
    //  System.out.println(Arrays.toString(strr));
  
    for (int i = 0; i < strr.length; i++) {
        System.out.print(strr[i]+ " ");
    }
    }
  
}
