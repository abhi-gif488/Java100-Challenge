import java.util.Arrays;
import java.util.Scanner;

public class Matrix{ 
  public static void main(String[] args) {
   // Creating Scanner object to take input from user
    Scanner in = new Scanner(System.in);

    // Declaring a 2D array with 3 rows and 2 columns
    int[][] arr = new int[3][2];
  
for (int row = 0; row <3; row++) { // Outer loop is used to access each row
  
  for(int col=0; col<arr[row].length; col++){ // Inner loop is used to access each column of the current row

      // Taking input from user and storing it in the array
    arr[row][col]= in.nextInt();
    
  }
}  //enhanced for lo
  for( int[] elemt : arr){
    System.out.println(Arrays.toString(elemt));  // Arrays.toString() converts array row into readable string format
  }
}
}