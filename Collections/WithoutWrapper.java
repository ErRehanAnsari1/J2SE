import java.util.*;

public class WithoutWrapper{
public static void main(String[] args){

List<Integer> list=new ArrayList<>();
list.add(10);    //autoboxing
list.add(20);

int sum=0;

for(Integer num : list){
sum=sum+num;
}
System.out.println("Sum : "+sum);
}
}