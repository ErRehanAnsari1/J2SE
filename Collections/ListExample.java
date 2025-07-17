import java.util.List;
import java.util.ArrayList;

public class ListExample{
public static void main(String[] args){

List<String> cities=new ArrayList<>();

cities.add("Delhi");
cities.add("Mumbai");
cities.add("Indore");

cities.add(1,"Bhopal");   //Insert at index
cities.set(2,"Nagpur");   //update

System.out.println(cities);

cities.remove("Nagpur");
System.out.println(cities.contains("Delhi"));   //true 


}
}