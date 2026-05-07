public class Shadowing {
  static int x= 50;// this will be shadowed at line 7

  public static void main(String[] args) {
    System.out.println("Hey abhhishek here we will learn about the concept 'Shadowing'!!\ndamn excited right...\nlets go...");
System.out.println("the value of 'x' will be remain same in main block- that is: "+ x);
    int x; //this is known as declaring   - the class variable at line 2 is shadowed by this..
    x=25;  //and this is known as initializing

    System.out.println("the value of x is: "+x);
    fun();


//here we can see, the value of 'x' that we have declared before main block is remain same after printing- the thing I want to explain is that main block has initialize and declared the same variable with different value and cannot change the value of static x value that we declared before main block


  }//its a another function block to check which value it will pickup - the main block one or the class variable.

  static void fun(){
    System.out.println("the value of x is: "+x);
  }
  
}
