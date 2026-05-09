package problems;

import java.util.Arrays;

public class PassingInFunction {
  public static void main(String[] args){
    System.out.println("here we discuss about modifying the value of primitive array from the sub-function");
    
    int[] arr = {1, 2, 3, 4, 5, 6};
    System.out.println(Arrays.toString(arr));

    System.out.println("now we are modifying the 3rd indexs element");
    modify(arr);
    System.out.println("after calling function: "+ Arrays.toString(arr));



   
  }
   static void modify(int[] num){
    num[3] = 44;
     System.out.println("In function: "+Arrays.toString(num));
    }
   


  
}
