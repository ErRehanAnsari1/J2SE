import java.util.Set;
import java.util.HashSet;

public class HashSetExample{
public static void main(String[] args){

Set<String> fruits=new HashSet<>();

fruits.add("Apple");
fruits.add("Banana");
fruits.add("Mango");
fruits.add("Apple");             //duplicate

System.out.println("Fruits : "+fruits);     

//duplicate(apple) will not appear twice

}
}