import java.util.Arrays;
import java.util.Scanner;

public class Matrix{ 
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[][] arr = new int[3][2];
  
for (int row = 0; row <3; row++) {
  
  for(int col=0; col<arr[row].length; col++){
    arr[row][col]= in.nextInt();
    
  }
}
  for( int[] elemt : arr){
    System.out.println(Arrays.toString(elemt));
  }
}
}