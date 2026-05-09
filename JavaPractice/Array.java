import java.util.Arrays;
import java.util.Scanner;

public class Array {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Here we learn about array basics");
    int[] arr = new int[5];
    // arr[0]=5;
    // arr[1]=7;
    //  arr[2]=4;
    // arr[3]=9;
    //  arr[4]=8;
    //  System.out.println(Arrays.toString(arr)); //may be its value is [5,7,4,9,8]-- and yes the output is same!


     //if the array size of 1000 number of elements
     //then we use for loop

     for(int i = 0; i<arr.length; i++ ){
      //input using forloop..

      arr[i] = sc.nextInt();
      
     
     }
     System.out.println(Arrays.toString(arr)); 
     
     //System.out.println(arr[i]+ " "); it will work the same as down their but scope of 'i' is only whithin the forloop block.

    //  for (int i = 0; i < arr.length; i++) {
    //     System.out.print(arr[i]+ " ");
    //  }
   }

  
}
