package In;

public class MaxArray {

  public static void main(String[] args){

    System.out.println("Here we will find the max number in the Array");
    int[] arr = {3,5,689,807,99,98}; //declared and initialised array
    int max= Maxx(arr);  // declared max and calling function Maxx
    System.out.println(max);

  }
  static int  Maxx(int[] arr){  //function to find max no. of an array
    

      int max=arr[0]; //let assume 0th index number is maxzz
      for (int i = 1; i < arr.length; i++) {  //use for loop so that iteration will move every elemet of the array
        if (arr[i]>max) {   //give condition if ith element of array is greater than max then:  
          max= arr[i];
          
        }

        
      }
    return max;
      
     }
      
    }