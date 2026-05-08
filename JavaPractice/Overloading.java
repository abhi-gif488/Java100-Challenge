import java.util.Arrays;

public class Overloading {

  public static void main(String[] args) {

      // fun();
    // If we call fun() with no arguments,
    // Java gets confused because both fun(int...)
    // and fun(String...) can accept empty values.
    // This situation is called an ambiguous method call.

    // fun(2,3,4,5);
    // This would call the int version of fun()
    // because all values are integers.

    fun("abh", "kum");
     // This calls the String version of fun()
    // because we passed String values.

    int summ = sum(7,8,11);
     // Calls the sum() method with 3 parameters.

    System.out.println(summ);
  }
  static void fun(int ...v){
    // Variable-length argument method for integers.
    // It can take any number of int values.

     System.out.println(Arrays.toString(v));
     // Converts the integer array into readable form
     // and prints it.
  }

  static void fun(String ...v){ // Variable-length argument method for Strings.
    // It can take any number of String values.

    System.out.println(Arrays.toString(v));
    // Converts the String array into readable form
    // and prints it.
  }
  

  static int sum(int a, int b){
    return a+ b;
  }

  static int sum(int a, int b, int c){

    
    return a+b-c;
  }
  
}
