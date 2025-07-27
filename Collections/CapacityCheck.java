import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class CapacityCheck{
	public static void main(String[] args)throws Exception{
		ArrayList<Integer>list=new ArrayList<>(11);

//11 is not its fixed size but capacity because it is growable
		
		list.add(1);
   		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		
Field field=ArrayList.class.getDeclaredField("elementData");
field.setAccessible(true);
Object[] elementData=(Object[])field.get(list);
System.out.println("ArrayList Capacity : "+elementData.length);


		
	}
}