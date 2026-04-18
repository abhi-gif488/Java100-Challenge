public class Conditionals {
  public static void main(String[] args) {
  //   int Salary = 9999;
  //   if(Salary>=10000){
  //      Salary += 5000;
  //     System.out.println("Your Salary is: " + Salary);
  //   }  else{
  //     Salary += 3000;
  //     System.out.println("Your Salary is: " + Salary);
  //   }


//Multiple conditions
        int Salary = 9999;
         if (Salary>10000){
          Salary +=5001;
          System.out.println("Your Salary is: " + Salary);
         }
         else if (Salary<5000){
          Salary += 501;
          System.out.println("Your Salary is: " + Salary);
         }
         else{
          Salary += 201;
          System.out.println("Your Salary is: " + Salary);
         }

  }
  
}


