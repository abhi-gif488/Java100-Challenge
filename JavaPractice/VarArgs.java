import java.util.Arrays;

public class VarArgs {

  //here we talk about variable length argument

  public static void main(String[] args) {
    fun(2,3,4,4,5,5,6,6,7,8);    //initilising the array value 
  }
  static void fun(int ...v){  //this three dots '...' means taking input or value as n number of array value of any datatype
  //static void fun(String ...v) this way..

    System.out.println(Arrays.toString(v));
    /*It is a utility method used to convert a one-dimentional array into a readable string
      instead of getting a confusing memory address(like [I@123a439b]), this method displays the actual contents of the array 'v' */
  
    }
  
}
