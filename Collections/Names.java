import java.util.ArrayList;

public class Names{
public static void main(String[] args){

ArrayList<String>names=new ArrayList<>();

names.add("Rehan");
names.add("Ayaan");
names.add("Kabir");
names.add("Zoya");
names.add("Aryan");

System.out.println("Initial names : "+names);

System.out.println(names.size());

names.set(2,"Armaan");

System.out.println("Index 2 updated");

names.remove("Rehan");

System.out.println("Rehan removed from the list");

System.out.println(names.contains("Ali"));

for(int i=0;i<names.size();i++){
System.out.println("Index "+i+":"+names.get(i));
}

}
}