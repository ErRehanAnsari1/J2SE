import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class IteratorDemo{
public static void main(String[] args){

List<String>names=new ArrayList<>();

names.add("Rehan");
names.add("Kabir");
names.add("Zoya");
names.add("Aryan");

Iterator<String> it=names.iterator();

System.out.println("Using iterator");

while(it.hasNext()){

String name=it.next();
System.out.println(name);

if(name.startsWith("K")){
it.remove();           //safe remove
}
}
System.out.println("After removal : "+names);
}
}