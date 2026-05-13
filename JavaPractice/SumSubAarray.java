
public class SumSubAarray {
  public static void main(String[] args) {
    System.out.println("All about Sum of subarrays");
int[] arr = {1,2,3,4,5};

     // Outer loop selects the starting index of subarray
    for (int i = 0; i < arr.length; i++) {
      
      int sum= 0; // Variable to store sum of elements

       // Inner loop starts from current index i and moves till the end of array
      for(int j=i; j<arr.length;j++){
        
        sum+= arr[j]; // Adding current element into sum
      }
      System.out.print(sum+ " ");
      
    }    
  }
  
}
