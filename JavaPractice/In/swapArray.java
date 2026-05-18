package In;

import java.util.Arrays;

public class swapArray {

  public static void main(String[] args) {
    System.out.println("Here we will swap two elements of the given array");
    int[] arr = {1,2,3,4,5,6,7,8}; //declared and initialised array

    Swapp(arr,0,7); //calling function and given array 'arr' and its index no. to pass values
    System.out.println(Arrays.toString(arr));//it will generate string value - easy to read: passing in function

  }
    static void Swapp(int[] arry,int index1, int index2){  //fuction to swap two numbers where array-'arr', and its two index values are taken-- directly we can say when function is called then this get the values of array, and indexes


        int temp= arry[index1];// logic
        arry[index1]=arry[index2];
        arry[index2]= temp;


    }
  
}
