public class PrefixSum {
  public static void main(String[] args) {
    System.out.println("Prefix Sum : ");
    int[] arr = {2,4,6,8,10}; //declaring and initializing an array
    
    for (int i = 0; i < arr.length; i++) { //Outer loop runs through each index of the array

      int sum=0;  // Variable to store the sum for each prefix

      for(int j=0; j<=i; j++){  // Inner loop adds elements from index 0 to current index i
        sum+=arr[j];
         // Adding each element to sum
      }
      System.out.println("Here is your Sum: "+ sum);
      
    }
  }
  
}
