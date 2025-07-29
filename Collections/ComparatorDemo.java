import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class StringLengthComparator implements Comparator<String>{

@Override
public int compare(String o1,String o2){
	return o2.length()-o1.length();
}
}
public class ComparatorDemo{
	public static void main(String[] args){
	List<String>words=Arrays.asList("banana","apple","date");
	words.sort(new StringLengthComparator());
	System.out.println(words);

	}
}