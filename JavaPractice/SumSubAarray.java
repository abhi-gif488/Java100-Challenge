
public class SumSubAarray {
  public static void main(String[] args) {
    System.out.println("All about Sum of subarrays");
int[] arr = {1,2,3,4,5};
    for (int i = 0; i < arr.length; i++) {
      int sum= 0;
      for(int j=i; j<arr.length;j++){
        sum+= arr[j];
      }
      System.out.print(sum+ " ");
      
    }    
  }
  
}
