package problems;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Start small. Ship something.");
        int star= sc.nextInt();
        for(int i=star; i>=1; i--){
            //it will print from maxm number of stars
            for(int j=1; j<=i; j++){
            System.out.print("*");
            
            }
            System.out.println();
        }
    }
}
  
