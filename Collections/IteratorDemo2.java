import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class IteratorDemo2{
public static void main(String[] args){
ArrayList<Integer> nums=new ArrayList<>();

nums.add(11);
nums.add(22);
nums.add(33);
nums.add(44);
nums.add(55);
nums.add(66);
nums.add(77);
nums.add(88);
nums.add(99);
nums.add(110);

Iterator<Integer> it=nums.iterator();

while(it.hasNext()){

int numlist=it.next();
System.out.println(numlist);

if(numlist%5==0){

it.remove();
}

}
System.out.println("After removal : "+nums);
}
}