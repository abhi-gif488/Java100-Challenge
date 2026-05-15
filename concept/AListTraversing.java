import java.util.ArrayList;

public class AListTraversing {

  public static void main(String[] args){
    System.out.println("Here we will study about traversing in ArrayList");
    ArrayList<Integer> list = new ArrayList<>();
    list.add(45);
    list.add(67);
    list.add(87);
    list.add(98);
    list.add(123);
    
    //using forloop
    for (int i = 0; i < 5; i++) {
      System.out.println(list.get(i));
    }
    System.out.println();

    //using enhanced forloop
    for(int result : list){
      System.out.println(result);
    }
    
  }
  
}
