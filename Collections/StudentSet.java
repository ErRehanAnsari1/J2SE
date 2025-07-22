import java.util.*;

public class StudentSet{
public static void main(String[] args){

Set<String> students=new HashSet<>();

students.add("Ayaan");
students.add("Kabir");
students.add("Zoya");
students.add("Ayaan");
students.add("Rehan");
students.add("Zoya");

System.out.println("Unique students: "+students);
System.out.println("Total count: "+students.size());

}
}