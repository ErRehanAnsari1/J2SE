import java.util.LinkedHashSet;

public class LinkedHashSetDemo{
public static void main(String[] args){

LinkedHashSet<String> cities=new LinkedHashSet<>();

cities.add("Mumbai");
cities.add("Delhi");
cities.add("Bhopal");
cities.add("Indore");
cities.add("Delhi");

System.out.println("Cities in insertion order : "+cities);

}
}