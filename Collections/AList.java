import java.util.ArrayList;
import java.util.List;
public class AList{
	public static void main(String[] args){
	List<Integer> list=new ArrayList<>();
	
	list.add(5);
	list.add(5);
	list.add(10);
	System.out.println(list.get(2));
	System.out.println(list.size());

	for(int i=0;i<list.size();i++){
	System.out.println(list.get(i));
	}
	System.out.println(list.contains(5));
	}
}