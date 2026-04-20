import java.util.Scanner;

public class Fibonacci{
  public static void main(String[] args) {
    System.out.println("How to find fibonacci numbers? ");

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the fibonacci position number you want me to find: ");
    int n = sc.nextInt();
    
    int prev = 0;
    int after=1;
    
    for (int count = 2; count <=n; count++) {
        int temp= after;
        after += prev;
        prev= temp; 
      
    }
    System.out.println(after);

   /*  
 If counting starts from 0 (common in programming)

Position:
0 → 0
1 → 1
2 → 1
3 → 2
4 → 3
5 → 5
6 → 8
7 → 13
8 → 21
9 → 34
10 → 55

 10th Fibonacci number = 55

 If counting starts from 1

Position:
1 → 0
2 → 1
3 → 1
4 → 2
5 → 3
6 → 5
7 → 8
8 → 13
9 → 21
10 → 34

 10th Fibonacci number = 34 */



    /* Fibonacci numbers ko simple words mein samjho toh yeh ek number pattern (sequence) hai jahan har naya number, uske pichhle do numbers ka sum hota hai.

      Start:
         0, 1, 1, 2, 3, 5, 8, 13...

    A Fibonacci sequence is a series where: each number is the sum of the two numbers before it

So:

First two numbers → 0 and 1
Then keep adding:
0 + 1 = 1
1 + 1 = 2
1 + 2 = 3
2 + 3 = 5 


                     Simple idea to remember

          “Add the last two numbers to get the next one”
       
   */

        }

}