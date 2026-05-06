import java.util.Arrays;

public class ChangeValue {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,7,8};

     // Creating an array with some values

    Value(arr);

    // Calling the Value method and passing the array
    // NOTE: Array is passed by reference → changes will affect original array

    System.out.println(Arrays.toString(arr));

     // Printing the array using Arrays.toString()
    // It converts array into readable format like [1,2,0,4,...]

  }

  static void Value(int[] nums ){ 

   // Creating a method that takes an array as input
   // static is required because main() is static
   // static methods can only directly call other static methods

    nums[2] = 0; 
    // Changing the value at index 2 (3rd position)
    // Original value was 3 → now it becomes 0
  }
  
}
