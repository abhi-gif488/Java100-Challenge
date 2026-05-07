package problems;

public class Scope {
  public static void main(String[] args){

  int a = 20; //initialize variables - main block
  int b= 25;

  System.out.println("a is equals to: "+a); // here we print the value of the variables of the main block.
  System.out.println("b is equals to: "+b);
  

{
  //int a = 90;  // this will give error because the main block is already declare the variable 'a'- and this block comes under the main block , so the values can be manipulated but we can't initialize same named variable again
   a = 50;
  System.out.println("a is equals to: "+a);

  int c = 605; //here we initialize the variable 'c' we can call this variable under this block but can't use or manipulate outside the block
  System.out.println("c is equal to: "+c);

}

  //c= 21; yeah so, this will give error because we can't manipulate the variable of subblocks but subblocks can..
  
int c= 21; //it will not give any error ,instead it will give a new value - its a new variable under the main block and cannot change or affect the value of smaller block's variable 'c'..
           
System.out.println("c is equal to: "+c);

  System.out.println("a is equals to: "+a);//value of 'a' is being changed in the smaller block

  }
    
  }
  

