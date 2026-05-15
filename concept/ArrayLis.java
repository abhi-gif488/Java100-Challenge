import java.util.ArrayList;

public class ArrayLis {
  public static void main(String[] args){
    System.out.println("Here we will discuss about ArrayList");
    ArrayList<Integer> list= new ArrayList<>();

    list.add(11);
    list.add(25);
    list.add(33);
    list.add(409);

    //accessing elements
    System.out.println(list); //print ArrayList
    System.out.println(list.get(2));//print the element whose index is '2'

    //updating elements
    list.set(1, 200);

    //size of ArrayList
    list.size();

    //removing elements
    list.remove(0);
    //removing elements by objects
    list.remove(Integer.valueOf(11));

  }
  
}
