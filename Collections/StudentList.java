 import java.util.*;
public class StudentList{
public static void main(String[] args){

List<String>names=new ArrayList<>();

names.add("Rehan");
names.add("Ayan");
names.add("Sanskar");
names.add("Rehan");
names.add("Sanskar");

System.out.println("Original List : "+names);
System.out.println("List size : "+names.size());

Set<String>nms=new HashSet<>(names);

System.out.println("Unique Names : "+nms);
System.out.println("Size of Set : "+nms.size());

}
}