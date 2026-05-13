public class PrefixSum {
  public static void main(String[] args) {
    System.out.println("Prefix Sum : ");
    int[] arr = {2,4,6,8,10};
    
    for (int i = 0; i < arr.length; i++) {
      int sum=0;
      for(int j=0; j<=i; j++){
        sum+=arr[j];
      }
      System.out.println("Here is your Sum: "+ sum);
      
    }
  }
  
}
