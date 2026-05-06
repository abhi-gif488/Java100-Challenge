
package problems;

import java.util.Arrays;
// import arrays class to use helper methods like toString()..

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        //create and initialize an array of 5 elements

        int start = 0;
        //start from the beginning of the array.
    
        int end = arr.length - 1;
        //end it points the last element of the array
       

        while (start < end) { 
//loop runs until start index is less then the end index

            int temp = arr[start];
            //temp will store the value of start index
            arr[start] = arr[end];
            //replace the value of end index to start index
            arr[end] = temp;
            //put stored value of temp at end.

            start++;
            //move start forward right to left.
            end--;
            //movve end backward left to right
        }

        System.out.println(Arrays.toString(arr));
    }
}
  

