import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class WaysOfArrayListCreation{
public static void main(String[] args){

List<String> list=new ArrayList<>();
System.out.println(list.getClass().getName());

List<String>list1=Arrays.asList("Monday","Tuesday");
System.out.println(list1.getClass().getName());
list1.set(1,"Wednesday");
System.out.println(list1.get(1));

String[] array={"Apple","Banana","Cherry"};
List<String>list2=Arrays.asList(array);
System.out.println(list2.getClass().getName());

List<Integer>list3=List.of(1,2,3,4);//unmodifiable

}
}
