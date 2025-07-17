import java.util.*;

public class ListDemo{
public static void main(String[] args){

List<String> colors=new ArrayList<>();

colors.add("Red");
colors.add("Blue");
colors.add("Green");

colors.add(1,"Yellow");
colors.add(2,"Black");
colors.remove("Red");

for(String color:colors){

System.out.println(color);
}
}
}