import java.util.List;
import java.util.ArrayList;

public class ShoppingCart{
public static void main(String[] args){

List<String> items=new ArrayList<>();

items.add("Milk");
items.add("Bread");
items.add("Butter");
items.add("Eggs");
items.add("Chocolates");

System.out.println(items);

items.set(1,"Whole Grain Bread");
items.remove("Eggs");

System.out.println(items);

}
}