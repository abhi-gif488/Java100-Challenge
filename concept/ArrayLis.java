import java.util.ArrayList;

public class ArrayLis {
  public static void main(String[] args){
    System.out.println("Here we will discuss about ArrayList");
    ArrayList<Integer> list= new ArrayList<>();

    list.add(11);
    list.add(25);
    list.add(33);
    list.add(409);

    System.out.println(list); //print ArrayList
    System.out.println(list.get(2));
  }
  
}
