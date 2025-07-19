import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class Differences{
public static void main(String[] args){

List<String>cities=new ArrayList<>();
Set<String>hset=new HashSet<>();

cities.add("Mumbai");
cities.add("Chennai");
cities.add("Ahmedabad");
cities.add("Chennai");
cities.add("Ahmedabad");

hset.add("Mumbai");
hset.add("Chennai");
hset.add("Ahmedabad");
hset.add("Chennai");
hset.add("Ahmedabad");

System.out.println("Cities printed by ArrayList : "+cities);
System.out.println("Citites printed by HashSet : "+hset);

}
}