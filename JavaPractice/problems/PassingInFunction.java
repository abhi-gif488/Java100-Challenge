package problems;

import java.util.Arrays;

public class PassingInFunction {
  public static void main(String[] args){
    System.out.println("here we discuss about modifying the value of primitive array from the sub-function");
    
    int[] arr = {1, 2, 3, 4, 5, 6}; //declaration and initialising the primitive array
    System.out.println(Arrays.toString(arr));

    System.out.println("now we are modifying the 3rd indexs element");

    modify(arr); // callling modify func
    System.out.println("after calling function: "+ Arrays.toString(arr));
    //this is help to get output as string


   
  }
   static void modify(int[] num){
    num[3] = 44;
//here we change the value of 3rd index element of the array 'arr'

     System.out.println("In function: "+Arrays.toString(num));
     //same as line no. 14
    }
   


  
}
