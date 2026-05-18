package In;

public class MaxArray {

  public static void main(String[] args){

    System.out.println("Here we will find the max number in the Array");
    int[] arr = {3,5,689,807,99,98};
    int max= Maxx(arr);
    System.out.println(max);

  }
  static int  Maxx(int[] arr){
    

      int max=arr[0];
      for (int i = 1; i < arr.length; i++) {
        if (arr[i]>max) {
          max= arr[i];
          
        }

        
      }
    return max;
      
     }
      
    }