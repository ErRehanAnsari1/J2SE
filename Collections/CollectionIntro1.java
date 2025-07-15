import java.util.*;

public class CollectionIntro1{
public static void main(String[] args){

List<String> names=new ArrayList<>();

names.add("Rehan");
names.add("Arjun");
names.add("Sanya");
names.add("Karan");
names.add("Kajal");
names.add("Sejal");
names.add("Prinjal");

for(String name:names){
System.out.println(name);
}

}
}