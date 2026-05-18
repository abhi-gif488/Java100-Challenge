package In;

import java.util.Arrays;

public class swapArray {

  public static void main(String[] args) {
    System.out.println("Here we will swap two elements of the given array");
    int[] arr = {1,2,3,4,5,6,7,8};

    Swapp(arr,0,7);
    System.out.println(Arrays.toString(arr));

  }
    static void Swapp(int[] arry,int index1, int index2){


        int temp= arry[index1];
        arry[index1]=arry[index2];
        arry[index2]= temp;


    }
  
}
