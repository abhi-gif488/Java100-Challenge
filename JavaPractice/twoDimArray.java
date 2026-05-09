import java.util.Arrays;
import java.util.Scanner;

public class twoDimArray { 
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[][] arr = new int[3][2];
    System.out.println("length of the array is: "+arr.length);


    //input

for (int row = 0; row <3; row++) {

  //now we take every row
  for(int col=0; col<arr[row].length; col++){
    arr[row][col]= in.nextInt();
    
  }
  // first method to get output
  
}
  // for(int row=0; row<3; row++){
  //   for(int col=0; col<arr[row].length; col++){
  //       System.out.print(arr[row][col]+ " ");

  //   }
  //   System.out.println();
  //  }

   //second and best method to print
  //  for(int row=0; row< arr.length; row++){
  //   System.out.println(Arrays.toString(arr[row])) ;
  //  }


  //third method- this is enhanced forloop method to get array
  for( int[] elemt : arr){
    System.out.println(Arrays.toString(elemt));

  }
}
}