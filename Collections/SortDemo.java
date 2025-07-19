import java.util.*;

public class SortDemo{
public static void main(String[] args){

List<Integer>nums=new ArrayList<>();

nums.add(11);
nums.add(77);
nums.add(88);
nums.add(99);
nums.add(44);
nums.add(33);

System.out.println("Random order numbers : "+nums);

Collections.sort(nums);

System.out.println("After sorted numbers : "+nums);

System.out.println(nums.remove(Integer.valueOf(77)));

nums.add(3,90);

for(int i=0;i<nums.size();i++){
System.out.println("Index : " +i+ ", Value : " +nums.get(i));
}

}
}