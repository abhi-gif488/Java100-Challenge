package In;

import java.util.Arrays;

public class ReverseArray{
public static void main(String[] args){
  System.out.println("Here we will learn about Reversing an Array using swapping");
int[] arr = {1,2,3,4,5,6,7,8,9,10};// declared and initialised array

reverse(arr); // calling reverse first becoz if we call swap first then reverse function will work after swapping the first and last element of the array 

System.out.println(Arrays.toString(arr));// use to show readable array

swap(arr, 0, 9); //passing value
System.out.println(Arrays.toString(arr));

}
static void swap(int[] arr,int index1,int index2){ //function for swapping elements
  int temp= arr[index1];
  arr[index1]= arr[index2];
  arr[index2]= temp;

}

static void reverse(int[] arr){ //function for reversing elements
  int start=0;
  int end= arr.length-1;
  while(start<end){
    swap(arr, start, end);// calling swap function
    start++;
    end--;
  }

}



}