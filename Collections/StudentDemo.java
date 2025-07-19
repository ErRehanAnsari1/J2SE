import java.util.List;
import java.util.ArrayList;

public class StudentDemo{
public static void main(String[] args){

List<String>student=new ArrayList<>();

student.add("Rehan Ansari");
student.add("Saad Ansari");
student.add("Armaan Ansari");
student.add("Aena Ansari");
student.add("Hayat Ansari");

System.out.println(student.get(1));
System.out.println(student);

student.remove("Rehan Ansari");

System.out.println(student.size());


}
}