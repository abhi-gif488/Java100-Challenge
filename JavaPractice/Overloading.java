import java.util.Arrays;

public class Overloading {

  public static void main(String[] args) {
    //fun(); - always remember the ambiuous method
    // fun(2,3,4,5);
    fun("abh", "kum");

    int summ = sum(7,8,11);
    System.out.println(summ);
  }
  static void fun(int ...v){
     System.out.println(Arrays.toString(v));
  }

  static void fun(String ...v){
    System.out.println(Arrays.toString(v));
  }
  

  static int sum(int a, int b){
    return a+ b;
  }

  static int sum(int a, int b, int c){
    return a+b-c;
  }
  
}
