public class Shadowing {
  static int x= 50;

  public static void main(String[] args) {
    System.out.println("Hey abhhishek here we will learn about the concept 'Shadowing'!! \n damn excited right...\n lets go...");

    int x;
    x=25;
    System.out.println("the value of x is: "+x);
    fun();

  }

  static void fun(){
    System.out.println("the value of x is: "+x);
  }
  
}
